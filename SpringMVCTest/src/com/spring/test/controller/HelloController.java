package com.spring.test.controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

@Controller
public class HelloController extends AbstractController
{
    
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception
    {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("hello");
        mav.addObject("greeting", getGreeting());
        return mav;
    }
    
    private String getGreeting()
    {
        int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        if (hour >= 6 && hour <= 10)
        {
            return "좋은 아침입니다.";
        }
        else if (hour >= 12 && hour <= 15)
        {
            return "점심 식사는 하셨나요?";
        }
        else if (hour >= 18 && hour <= 22)
        {
            return "좋은 밤 되세요";
        }
        return "안녕하세요";
    }
}
