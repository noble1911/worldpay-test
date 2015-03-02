package com.worldpay.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LinksController {

    @RequestMapping(value="/", method= RequestMethod.GET)
    public ModelAndView homePage() {
        return new ModelAndView("index");
    }

    @RequestMapping(value="/index", method=RequestMethod.GET)
    public ModelAndView indexPage() {
        return new ModelAndView("index");
    }

    @RequestMapping(value="/moderation", method=RequestMethod.GET)
    public ModelAndView moderatorPage() {
        return new ModelAndView("moderation");
    }

    @RequestMapping(value="/admin/first", method=RequestMethod.GET)
    public ModelAndView firstAdminPage() {
        return new ModelAndView("admin1");
    }

    @RequestMapping(value="/admin/second", method=RequestMethod.GET)
    public ModelAndView secondAdminPage() {
        return new ModelAndView("admin2");
    }

}