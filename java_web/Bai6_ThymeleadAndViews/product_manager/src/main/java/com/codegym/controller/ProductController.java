package com.codegym.controller;

import com.codegym.service.ProductServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {
    ProductServiceImpl productService = new ProductServiceImpl();
    @GetMapping("/")
    public String setindex(Model model){
            model.addAttribute("products",productService.findAll()) ;
            return "index" ;
    }
}
