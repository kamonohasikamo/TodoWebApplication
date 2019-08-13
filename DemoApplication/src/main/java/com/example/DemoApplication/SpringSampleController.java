package com.example.DemoApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

import com.example.DemoApplication.todoService;


//==========================================================
// Controller Class
//==========================================================
@Controller
public class SpringSampleController {

    @Autowired
    todoService todoSer;

    @RequestMapping(value="/input")
    public String getMessage(Model model, Message message) {
        model.addAttribute("message", new Message());
        return "input";
    }

    @RequestMapping(value = "/confirm", method = RequestMethod.POST)
    public String confirm(@ModelAttribute Message form, Model model) {
        model.addAttribute("message", form);
        List<Message> msgList = todoSer.showAllData();
        model.addAttribute("messageList", msgList);

        List<Message> todoNameList = todoSer.searchTodoName("いえい");
        model.addAttribute("todoNameList", todoNameList);
        return "confirm";
    }

    @RequestMapping(value = "/searchTodo")
    public String searchTodo(@ModelAttribute Message form, Model model) {
        model.addAttribute("message", form);
        return "searchTodo";
    }

}