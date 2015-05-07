package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.service.Service;

@Controller
public class HelloController
{
    
    private Service service;
    
    public void setService(Service service)
    {
        this.service = service;
    }
    
    @RequestMapping(value = "/hello.do")
    public ModelAndView hello()
    {
        
        ModelAndView model = new ModelAndView();
        
        service.serviceMethod();
        
        model.addObject("hello", "Hello Spring!");
        model.setViewName("hello");
        
        return model;
    }
    
}