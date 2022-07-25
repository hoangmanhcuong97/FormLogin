package com.example.formlogin.controller;

import com.example.formlogin.dto.FormLogin;
import com.example.formlogin.model.Account;
import com.example.formlogin.service.IServiceLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("")

public class Login {
        @Autowired
        private IServiceLogin iServiceLogin;

        @GetMapping("/home")
        public ModelAndView home(){
            ModelAndView modelAndView = new ModelAndView("/formlogin");
            modelAndView.addObject("FormLogin", new Account());
            return modelAndView;
        }
        public Account checkLogin(FormLogin formLogin){
            for (Account account: iServiceLogin.finAll()) {
                if (account.getEmail().equals(formLogin.getEmail())
                        && account.getPassword().equals(formLogin.getPassword())) {
                    return account ;
                }
            }
            return null;
        }
         @PostMapping("/login")
        public ModelAndView login(@ModelAttribute("FormLogin") FormLogin formLogin){
            Account account = checkLogin(formLogin);
            if (account == null){
                ModelAndView modelAndView = new ModelAndView("/error");
                return modelAndView;
            }else {
                ModelAndView modelAndView = new ModelAndView("/account");
                modelAndView.addObject("account", account);
                return modelAndView;
            }
        }

        @GetMapping("/singup")
        public ModelAndView singup (){
            ModelAndView modelAndView = new ModelAndView("/formSingUp");
            modelAndView.addObject("FormSingUp", new Account());
            return modelAndView;
        }

        @PostMapping("/register")
        public ModelAndView createAccount (@ModelAttribute("FormSingUp") Account account){
            iServiceLogin.save(account);
            ModelAndView modelAndView = new ModelAndView("/formSingUp");
            modelAndView.addObject("FormSingUp", new Account());
            modelAndView.addObject("message", "New account created successfully");
            return modelAndView;
        }
}
