package com.worldpay.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Secure links
 */
@Controller
public class LoginController {

    @RequestMapping(value = "/user-login", method = RequestMethod.GET)
    public ModelAndView loginForm() {
        return new ModelAndView("login");
    }

    @RequestMapping(value = "/error-login", method = RequestMethod.GET)
    public ModelAndView invalidLogin() {
        ModelAndView modelAndView = new ModelAndView("login");
        modelAndView.addObject("error", true);
        return modelAndView;
    }

    @RequestMapping(value = "/success-login", method = RequestMethod.GET)
    public ModelAndView successLogin() {
        return new ModelAndView("success");
    }
}
