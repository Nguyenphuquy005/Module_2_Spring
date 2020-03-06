package com.kienden005.case_study.controller;

import com.kienden005.case_study.model.Admin;
import com.kienden005.case_study.model.User;
import com.kienden005.case_study.service.AdminService;
import com.kienden005.case_study.service.impl.AdminServiceImpl;
import com.kienden005.case_study.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class LoginController {

    @Autowired
    AdminService adminService;
    @Autowired
    UserServiceImpl userService ;
    @GetMapping("/")
    public String index() {
        return "home";
    }


    @GetMapping("/login")
    public String indexlogin() {

        return "login";
    }
     @PostMapping("/submit")
    public String getlogin(@RequestParam(name = "u") String u , @RequestParam(name = "p") String p , Model model  ){
         List<Admin> list = adminService.findAllByUserAndPassWord(u,p);
         List<User> listuser = userService.findAllByUserNameAndPassWord(u,p) ;
             if (list.size() == 1 ) {
                 return "admin";
             } else if(listuser.size() == 1){
                 return "user" ;
             }  else {
                 model.addAttribute( "error", "User or PassWord fails");
                 return "login";
             }
         }

       @GetMapping("/registration")
             public  String setUser(Model model){
           model.addAttribute("user" , new User()) ;
        return  "registration" ;
       }
       @PostMapping("/addRegistration")
      public String getUser(@ModelAttribute(name = "user") User user , Model model){
           List<User> listuser = userService.findAllByUserNameAndPassWord(user.getUserName(),user.getPassWord()) ;
           List<Admin> listadmin = adminService.findAllByUserAndPassWord(user.getUserName(),user.getPassWord()) ;

           if (listuser.size() > 0 || listadmin.size() >0){
               model.addAttribute("error","User already exist") ;
               return  "registration" ;
           }  else {
               userService.save(user);
               return "home" ;
           }

       }
     }

