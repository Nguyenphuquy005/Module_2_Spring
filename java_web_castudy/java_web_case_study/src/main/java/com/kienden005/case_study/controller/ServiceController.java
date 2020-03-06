package com.kienden005.case_study.controller;

import com.kienden005.case_study.model.MyCount;
import com.kienden005.case_study.model.Services;
import com.kienden005.case_study.service.impl.ServiceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Pageable ;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import java.util.Optional;

@Controller
@SessionAttributes("myservice")
public class ServiceController {
    @Autowired
    ServiceServiceImpl serviceService ;

    @ModelAttribute("myservice")
    public MyCount Myservice(){
     return  new MyCount() ;
    }
    @GetMapping("/service")
    public  String setFindAll(@PageableDefault(value = 3)Pageable pageable ,
                              @RequestParam(name = "name") Optional<String> name ,
                              Model model){
        Page<Services> servicesPage ;
        if (name.isPresent()){
            servicesPage = serviceService.findAllByFullNameContaining(name.get() , pageable) ;
              model.addAttribute("name",name.get()) ;
        }else {
            servicesPage = serviceService.getAllCustomers(pageable) ;
        }
          model.addAttribute("services", servicesPage) ;
        return "service/service" ;
    }
    @GetMapping("/service/add")
    public  String setAdd(Model model ,@ModelAttribute("myservice") MyCount myCount ){
        model.addAttribute("myservice" ,myCount) ;
        model.addAttribute("service",new Services()) ;
        return "service/addservice" ;
    }
    @PostMapping("/service/addnew")
    public  String getAdd(@Validated @ModelAttribute("service") Services services , BindingResult bindingResul,
                          @ModelAttribute("myservice") MyCount myCount){

        if (bindingResul.hasErrors()){
            return "service/addservice" ;
        }else {
            myCount.setMyservice(services.getFullName());
        serviceService.save(services);
        return "redirect:/service/add" ;}
    }
    @GetMapping("/service/{idServices}/edit")
    public String setEdit(@PathVariable(name = "idServices") int idservice,Model model){
        model.addAttribute("service",serviceService.findById(idservice)) ;
        return "service/editservice" ;
    }
    @PostMapping("/service/edit")
    public String getEdit(Services services){
        serviceService.save(services);
        return "redirect:/service" ;
    }
    @GetMapping("/service/{idServices}/delete")
    public String setDelete(@PathVariable(name = "idServices") int idservice,Model model){
        model.addAttribute("service",serviceService.findById(idservice)) ;
        return "service/deleteservice" ;
    }
    @PostMapping("/service/delete")
    public  String getDelete(Services services){
        serviceService.delete(services);
        return "redirect:/service" ;
    }
}
