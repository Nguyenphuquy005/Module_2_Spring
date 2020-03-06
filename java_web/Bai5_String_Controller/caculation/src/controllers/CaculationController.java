package controllers;

import javafx.scene.shape.Path;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CaculationController {
    @GetMapping("/")
    public String setCaculation(){
        return "index" ;
    }
    @PostMapping("/caculation")
    public String getCaculation(@RequestParam("number1") String num1 , @RequestParam("number2") String num2,
                                @RequestParam(name = "cong",required = false) String cong ,
                                @RequestParam(name = "tru",required = false) String tru ,
                                @RequestParam(name = "nhan",required = false) String nhan ,
                                @RequestParam(name = "chia",required = false) String chia ,
                                Model model) {

        try {
            int so1 = Integer.parseInt(num1) ;
            int so2 = Integer.parseInt(num2) ;
            if(cong == null && tru == null && nhan == null){
                model.addAttribute("result",so1  / so2) ;
            } else  if (cong==null && tru == null && chia == null){
                model.addAttribute("result",so1 *so2) ;
            }else if (cong == null && nhan==null&& chia==null){
                model.addAttribute("result",so1  -so2) ;
            }else {
                model.addAttribute("result",so1 +so2) ;
            }
        }catch (NumberFormatException ex){
model.addAttribute("result" , ex) ;
        }


        return "index" ;
    }
}
