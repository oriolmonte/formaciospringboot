package com.oriol.springwebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "index";
    }
    @RequestMapping("add")
    public ModelAndView add( @RequestParam("num1") int patata, int num2, ModelAndView mv) //MATCH OR @REQUEST PARAM
    {
        int result = patata+num2;
        mv.addObject("result", result);
        mv.setViewName("result");
        return mv;        
    }
    @RequestMapping("addAlien")
    public String addAlien(Alien alien) //MATCH OR @REQUEST PARAM
    {
        return "result";        
    }
    @ModelAttribute("course")
    public String courseName(){
        return "Java";
    }


}
