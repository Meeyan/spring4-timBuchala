package com.study.controller;

import com.study.service.GenericWelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author zhaojy
 * @createTime 2017-10-19
 */
@Controller
public class WelcomeController {

    @Autowired
    private GenericWelcomeService welcomeService;

    @RequestMapping("/")
    public String doWelcome(Model model) {
        List<String> welcomeMsg = welcomeService.getWelcomeMsg("Zhang san");
        model.addAttribute("welcomeMessages", welcomeMsg);
        return "welcome";
    }
}
