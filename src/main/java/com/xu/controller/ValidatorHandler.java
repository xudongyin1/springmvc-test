package com.xu.controller;

import com.xu.Account;
import com.xu.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

/**
 * @Author: win10
 * @Description:
 * @Date: Created in 17:58 2020/5/2
 * @Modified By:
 */
@Controller
public class ValidatorHandler {
    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("account", new Account());
        return "login";
    }

    @PostMapping("/login")
    public String login(@Validated Account account, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "login";
        }
        return "index";
    }

    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("person", new Person());
        return "register";
    }

    @PostMapping("/register")
    public String register(@Valid Person person, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "register";
        } else return "index";
    }
}
