package com.study.controller;

import com.study.service.RandomRequestScopeService;
import com.study.service.RandomSessionScopeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 演示bean的Request Scope 和 Session Scope域
 *
 * @author zhaojy
 * @createTime 2017*10*20
 */
@Controller
@RequestMapping("/")
public class ScopeController {

    @Autowired
    private RandomRequestScopeService requestScopeService;

    @Autowired
    private RandomSessionScopeService sessionScopeService;

    @RequestMapping("")
    public void getRandom(HttpServletResponse response) throws IOException {
        response.getWriter().write("<html>");
        response.getWriter().write("***************** request scope ***************** " + " <br>");
        response.getWriter().write("***************** old number is:" + requestScopeService.getRandomNumber() + " <br>");
        requestScopeService.generateRandomNumber();
        response.getWriter().write("***************** new number is:" + requestScopeService.getRandomNumber() + " <br>");
        response.getWriter().write("***************** object reference:" + requestScopeService + " <br>");

        response.getWriter().write("***************** session scope ***************** " + " <br>");
        response.getWriter().write("***************** old number is:" + sessionScopeService.getRandomNumber() + " <br>");
        sessionScopeService.generateRandomNumber();
        response.getWriter().write("***************** new number is:" + sessionScopeService.getRandomNumber() + " <br>");
        response.getWriter().write("***************** object reference:" + sessionScopeService + " <br>");
        response.getWriter().write("</html>");
    }
}