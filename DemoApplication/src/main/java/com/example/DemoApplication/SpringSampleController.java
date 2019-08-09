package com.example.DemoApplication;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//==========================================================
// Controller Class
//==========================================================
@Controller
public class SpringSampleController {

    @RequestMapping(value="/input")
    public String getMessage(Model model, Message message) {
        model.addAttribute("message", new Message());
        return "input";
    }

//    @RequestMapping("/")
//    public String todoName(Model model){
//        model.addAttribute("message", new Message());
//        return "input";
//    }
//
//    @RequestMapping("/input")
//    public String todoTime(Model model){
//        model.addAttribute("message", new Message());
//        return "input";
//    }

    @RequestMapping(value = "/confirm", method = RequestMethod.POST)
    public String confirm(@ModelAttribute Message form, Model model) {
        model.addAttribute("message", form);
        return "confirm";
    }

}