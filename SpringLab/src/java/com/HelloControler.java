package com;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

@Controller
public class HelloControler extends AbstractController {

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest hsr,
                    HttpServletResponse hsr1) throws Exception {
        ModelAndView modelandview = new ModelAndView("hello");
        modelandview.addObject("welcomeMessage","Hello Neel , Welcome to SpringMVC Demo");
        return modelandview;
    }
    
    @RequestMapping("/form")
    public String showForm(){
        return "form";
    }
    

}