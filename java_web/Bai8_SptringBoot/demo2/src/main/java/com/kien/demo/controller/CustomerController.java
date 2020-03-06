package com.kien.demo.controller;

import com.kien.demo.model.Customer;
import com.kien.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.data.domain.Pageable ;
import org.springframework.validation.BindingResult;
import java.util.Optional;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/")
    public ModelAndView index(@PageableDefault(value = 3) Pageable pageable,
                              @RequestParam(name = "name") Optional<String> name, Model model) {
        Page<Customer> customers;
        if (name.isPresent()) {
            customers = customerService.findAllByNameContaining(name.get(), pageable);
            model.addAttribute("name", name.get());
        } else {
            customers = customerService.getAllCustomers(pageable);
        }
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("customer", customers);
        return modelAndView;
    }

    @GetMapping("/customer/create")
    public String setCreate(Model model) {
        model.addAttribute("customer", new Customer()) ;
        return "create" ;
    }

    @PostMapping("/customer/addnewcustomer")
    public String getCustomer(@Validated  Customer customer
                              , BindingResult bindingResult ,
                              RedirectAttributes redirectAttributes  ) {
        if (bindingResult.hasErrors()){
            return "create" ;
        } else {
            customer.setId((long) (Math.random() * 100));
            customerService.save(customer);

            redirectAttributes.addFlashAttribute("success", "you add customer");
            return "redirect:/";

        }


    }

    @GetMapping("/customer/{id}/edit")
    public String setEdit(@PathVariable(name = "id") int id, Model model ) {
        model.addAttribute("editcustomer", customerService.findById(id));
        return "edit";
    }

    @PostMapping("/customer/edit")
    public String getEdit( @Validated @ModelAttribute("editcustomer") Customer customer,
            BindingResult bindingResult, Model model ,
                           RedirectAttributes redirectAttributes) {

        if (bindingResult.hasErrors()){
            System.out.println(customer);
            model.addAttribute("editcustomer", customer);
            return "edit" ;
        }else {
            customerService.save(customer);
            redirectAttributes.addFlashAttribute("success", "You Edit Customer");
        }
        return "redirect:/";

    }

    @GetMapping("/customer/{id}/delete")
    public String setDelete(@PathVariable(name = "id") int id, Model model) {
        model.addAttribute("customer", customerService.findById(id));
        return "delete";

    }

    @PostMapping("/customer/delete")
    public String getDelete(Customer customer, RedirectAttributes redirectAttributes) {
        customerService.delete(customer);
        redirectAttributes.addFlashAttribute("success", "Delete");
        return "redirect:/";
    }

//    @GetMapping("/customer/search")
//    public String search(@RequestParam(name = "name") String name, Model model) {
//        if (name == null) {
//            return "redirect:/";
//        } else {
//            model.addAttribute("customer", customerService.search(name));
//            return "index";
//        }
//    }

    @GetMapping("/customer/{id}/view")
    public String setview(@PathVariable(name = "id") int id, Model model) {
        model.addAttribute("customer", customerService.findById(id));
        return "view";
    }

}
