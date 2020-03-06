package com.kien.demo.controller;

import com.kien.demo.model.Mycounter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("mycounter")
public class CounterController {
    @ModelAttribute("mycounter")
    public Mycounter setUpCount(){
        return  new Mycounter() ;
    }
    @GetMapping("/")
    public String get(@ModelAttribute("mycounter") Mycounter mycounter ){
        mycounter.increment();
        return  "index" ;
    }
}
