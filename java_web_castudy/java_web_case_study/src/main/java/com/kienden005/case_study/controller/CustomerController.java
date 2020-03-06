package com.kienden005.case_study.controller;

import com.kienden005.case_study.model.Contract;
import com.kienden005.case_study.model.Customer;
import com.kienden005.case_study.service.CustomerService;
import com.kienden005.case_study.service.impl.ContractDetailsServiceImpl;
import com.kienden005.case_study.service.impl.ContractServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService;
     @Autowired
    ContractServiceImpl contractService ;
     @Autowired
    ContractDetailsServiceImpl contractDetailsService ;

    @GetMapping("/admin")
    public String index() {
        return "admin";
    }


    @GetMapping("/customer")
    public ModelAndView index(@PageableDefault(value = 3) Pageable pageable,
                              @RequestParam(name = "name") Optional<String> full_name, Model model) {
        Page<Customer> customers;
        if (full_name.isPresent()) {
            customers = customerService.findAllByFullNameContaining(full_name.get(), pageable);
//            model.addAttribute("name", full_name.get());
        } else {
            customers = customerService.getAllCustomers( pageable);
        }
        ModelAndView modelAndView = new ModelAndView("customer/customer");
        modelAndView.addObject("customer", customers);
        return modelAndView;
    }
    @GetMapping("/customer/add")
    public String setaddcustomer(Model model){
      model.addAttribute("newcustomer",new Customer()) ;
        return "customer/addnewcustomer" ;
    }
    @PostMapping("/customer/addnew")
    public String getadd(@Validated @ModelAttribute("newcustomer") Customer customer , BindingResult bindingResult){
        if (bindingResult.hasErrors()){
              return "customer/addnewcustomer" ;
        }else {
            customerService.save(customer);
            return "redirect:/customer/add" ;
        }

    }

    @GetMapping("customer/{idCustommer}/edit")
    public String setedit(@Validated @PathVariable(name = "idCustommer") long idCustommer , Model model){
//        model.addAttribute()
        model.addAttribute("customer", customerService.findById(idCustommer));
        return "customer/editcustomer" ;

    }
    @PostMapping("/customer/edit")
    public String getedit(@Validated  Customer customer ,BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "customer/editcustomer" ;
        }else {
            customerService.save(customer);
            return "redirect:/customer" ;
        }


    }
    @GetMapping("customer/{idCustommer}/delete")
    public String setdelete(@PathVariable(name = "idCustommer") long idCustommer , Model model){
        model.addAttribute("customer", customerService.findById(idCustommer));
        model.addAttribute("contract" , contractService.findById(idCustommer)) ;
        return "customer/deletecustomer" ;

    }
    @PostMapping("/customer/delete")
    public  String detdelete(Customer customer , BindingResult bindingResult)
    {

            customerService.delete(customer);
            return "redirect:/customer" ;


    }


    @GetMapping("/customer/contract")
    public  String contract(Model model , Contract contract){
        model.addAttribute("contract", customerService.findAllCustomerContract() ) ;
        return "customer/contract" ;
    }


}
