package com.example.be;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import jakarta.websocket.server.PathParam;
// @RestController // Use it for rest apis

@Controller
public class Be {
    @Autowired
    private UserRepo repo;
    
    @RequestMapping("products")
    public String name() {
        // System.out.println(title);
        return "Form";
    }

    @RequestMapping("add_products")
    public String addProducts(User val) {
        repo.save(val);
        return "Form";  
    }

    @RequestMapping("get_products")
    public ModelAndView getProducts(@RequestParam int id) {
        ModelAndView mv = new ModelAndView("Form");
        User list = repo.findById(id).orElse(new User());
        System.out.println(list.toString());
        mv.addObject("list", list);
        return mv;
    }

    @RequestMapping("/route/{aid}")
    @ResponseBody
    public String getSubRoute(@PathVariable("aid") String id) {
        return id;
    }
    // @RequestMapping(path = "get_apps", produces = { "application/xml" })
    
}
