package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import servicesDictionaey.DictionaryService;
import servicesDictionaey.DictionaryServiceImpl;
@Controller
public class Translate {
    DictionaryService dictionaryService=new DictionaryServiceImpl();
    @GetMapping("/translate")
    public String translate() {
        return "index";
    }

    @PostMapping("/result")
    public String result(@RequestParam String input, Model model) {
        String vn= dictionaryService.findByEnglish(input);
        if(vn==null) {
            model.addAttribute("result","Khong tim thay");
        } else {
            model.addAttribute("result",vn);
        }
        return "index";
    }
}
