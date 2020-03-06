package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class Convert {
    @GetMapping("/convert")
    public String getconvert(){
             return "form";
    }
    @PostMapping("/convert")
    public String postconvert(@RequestParam("rate") String rate, @RequestParam("usd") String dola, Model md){
        try {
            double usd = Double.parseDouble(dola);
            double tiLe = Double.parseDouble(rate);
            md.addAttribute("result", usd * tiLe);
        } catch (NumberFormatException ex) {
            md.addAttribute("result", "error");
        }
        return "form" ;
    }
}
