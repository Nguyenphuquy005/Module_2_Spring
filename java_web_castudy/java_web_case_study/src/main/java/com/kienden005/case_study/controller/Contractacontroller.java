package com.kienden005.case_study.controller;

import ch.qos.logback.core.util.CachingDateFormatter;
import com.kienden005.case_study.model.Contract;
import com.kienden005.case_study.model.Customer;
import com.kienden005.case_study.model.MyCount;
import com.kienden005.case_study.model.Services;
import com.kienden005.case_study.service.impl.ContractServiceImpl;
import com.kienden005.case_study.service.impl.CustomerServiceImpl;
import com.kienden005.case_study.service.impl.ServiceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller

public class Contractacontroller {
    @Autowired
    ContractServiceImpl contractService;
    @Autowired
    CustomerServiceImpl customerService;
    @Autowired
    ServiceServiceImpl serviceService;

    @ModelAttribute("customer")
    public List<Customer> setcustomer() {
        return customerService.findAll();
    }

    @ModelAttribute("service")
    public List<Services> setService() {
        return serviceService.findAll();
    }

    @GetMapping("/contract")
    public String setContract(Model model, @CookieValue(name = "quy", required = false) String abc ) {
        model.addAttribute("newcontract", new Contract());
        model.addAttribute("quy", abc);
//     model.addAttribute("customer",customerService.findAll());
        return "contract/addnewcontract";
    }

    @PostMapping("/contract/addnew")
    public String getnewContract(@Valid @ModelAttribute("newcontract") Contract contract,
                                 BindingResult bindingResult,
                                 HttpServletResponse response, HttpServletRequest request,
                                 Model model) {


        if (bindingResult.hasErrors()) {
            return "contract/addnewcontract";
        } else if (contract.getDaystartContract().compareTo(contract.getDayendContract()) > 0) {
            model.addAttribute("error", "DayEnd > DayStart");
            return "contract/addnewcontract";
        } else {
//           Date today = new Date() ;
            Cookie cookie = new Cookie("quy", contract.getDaystartContract().toString());
            cookie.setMaxAge(24 * 60 * 60);
            response.addCookie(cookie);
            contractService.save(contract);

            return "redirect:/contract";
        }

    }


}
