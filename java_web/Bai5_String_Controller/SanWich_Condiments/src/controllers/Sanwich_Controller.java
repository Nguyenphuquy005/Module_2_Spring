package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Sanwich_Controller {
    @GetMapping("/condition")
    public String setCOndition(){
        return "index" ;
    }
    @PostMapping("/conditon")
    public String getCondition(@RequestParam(value = "muoi",required = false)String muoi, @RequestParam(value = "mam" , required = false) String man ,
                               @RequestParam(value = "vitinh",required = false) String vitinh, @RequestParam(value = "dau",required = false) String dau  , Model model){
        System.out.println("muoi "+muoi);
        System.out.println("man "+man);
        System.out.println("vitinh "+vitinh);
        System.out.println("dau "+dau);
        if (muoi == null){
            muoi = "0" ;
        }else {
            muoi = "1" ;
        }
        if (man == null){
            man = "0" ;
        }else {
            man = "1" ;
        }
        if (vitinh == null){
            vitinh = "0" ;
        }else {
            vitinh = "1" ;
        }
        if (dau == null){
            dau = "0" ;
        }else {
            dau = "1" ;
        }
        model.addAttribute("result",man + muoi + vitinh + dau) ;
        return "index" ;
    }
}
