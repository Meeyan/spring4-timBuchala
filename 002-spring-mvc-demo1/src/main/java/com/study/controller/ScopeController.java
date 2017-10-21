package com.study.controller;

import com.study.service.RandomRequestScopeService;
import com.study.service.RandomSessionScopeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;

/**
 * 演示bean的Request Scope 和 Session Scope域
 *
 * @author zhaojy
 * @createTime 2017-10-20
 */
@Controller
@RequestMapping({"/scope/", "scop"})
public class ScopeController {

    @Autowired
    private RandomRequestScopeService requestScopeService;

    @Autowired
    private RandomSessionScopeService sessionScopeService;

    @RequestMapping("")
    public void getRandom(HttpServletResponse response) {

    }
}