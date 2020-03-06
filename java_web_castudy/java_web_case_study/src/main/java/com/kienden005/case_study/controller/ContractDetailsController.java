package com.kienden005.case_study.controller;

import com.kienden005.case_study.model.Contract;
import com.kienden005.case_study.model.ContractDetails;
import com.kienden005.case_study.service.impl.ContractDetailsServiceImpl;
import com.kienden005.case_study.service.impl.ContractServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.List;

@Controller
public class ContractDetailsController {
    @Autowired
    ContractDetailsServiceImpl contractDetailsService ;
    @Autowired
    ContractServiceImpl contractService ;
    @ModelAttribute("contract")
    public List<Contract> setContract(){
        return  contractService.findAll() ;
    }
    @GetMapping("/contractdetails")
    public  String setadd(Model model){
        model.addAttribute("contractdetails",new ContractDetails());

        return ("contract/addnewcontractdetails");

    }
    @PostMapping("/contract/addnewcontractdetails")
    public String getadd(@Valid @ModelAttribute("contractdetails") ContractDetails contractDetails ,
                         BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return ("contract/addnewcontractdetails");
        }else {
            contractDetailsService.save(contractDetails);
            return "redirect:/contractdetails" ;
        }

    }
}
