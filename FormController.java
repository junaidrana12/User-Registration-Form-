package com.JRana.Thymeleaf.FormHandling0786;

//import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;


    // handler method to handler user registration page request
    @RestController
    public class FormController {
        //Empty UserForm model object to store from data
        @RequestMapping("")
        public String useRegistrationPage(Model model){
            UserForm userForm = new UserForm();
            model.addAttribute("userForm",userForm);
            List<String> listProfession = Arrays.asList("Developer","Tester","Architect");
            model.addAttribute("listProfession",listProfession);
            return "register-form";
        }

        // handler method to handler user registration from submission request
        @PostMapping("register/save")
        public String submission(Model model, @ModelAttribute("userForm") UserForm userForm){
            model.addAttribute("userForm",userForm);
            return "register-success";
        }
}
