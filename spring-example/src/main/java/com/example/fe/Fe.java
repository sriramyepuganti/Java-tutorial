package com.example.fe;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class Fe {
    
    @RequestMapping("jsp-home")
    // normal jsp 
    public String home(HttpServletRequest req, HttpServletResponse res) {
        var title = req.getParameter("title");
        HttpSession session = req.getSession();
        session.setAttribute("name", "sriram");
        System.out.println(title);
        return "home";
    }

    @RequestMapping("spring-home")
    public ModelAndView name(@RequestParam("name") String title, HttpSession session) {
        // you can use String title =>  it look for title in params
        // you can use RequestParam to get all the paramas and assign to title
        // you can skip session by using ModelAndView
        ModelAndView mv = new ModelAndView();
        mv.addObject("name", "sai");
        // session.setAttribute("name", "sai");
        System.out.println(title);
        mv.setViewName("home");
        return mv;
        // return "home";

    }
}
