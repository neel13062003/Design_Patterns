/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstspringmvc.hellocontroller;

import javax.enterprise.inject.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

//    @RequestMapping("/first")
//    public ModelAndView help() {
//        ModelAndView modelandview = new ModelAndView("HelloPage");
//
//        modelandview.addObject("welcomeMessage", "Hello User Welcome to SpringMVC Demo");
//
//        return modelandview;
//    }
    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public ModelAndView getAdmissionForm() {
        ModelAndView modelView = new ModelAndView("Form");
        return modelView;
    }

    @RequestMapping(value = "/submitAdmissionForm",
            method = RequestMethod.POST)
    public ModelAndView submitAdmissionForm(
            @RequestParam("fname") String fname,
            @RequestParam("sem") String sem,
            @RequestParam("roll") String roll,
            @RequestParam("contact") String contact,
            @RequestParam("email") String email) {
        ModelAndView modelView = new ModelAndView("HelloPage");
        modelView.addObject("msg", "We have registered your details as, "
                + "Name:" + fname + "sem : " + sem + "roll :" + roll + "contact :" + contact + " email:" + email);
        System.out.println("fname");
        return modelView;
        
    }
}
