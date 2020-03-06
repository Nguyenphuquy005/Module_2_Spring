package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Convert {

    @PostMapping("/from")
    public void  count(@RequestParam("dola") String dola , @RequestParam("rate")  String rate ) {

    }
}
