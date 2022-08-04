package com.bjpowernode.dubbo.web;

import com.bjpowernode.dubbo.model.User;
import com.bjpowernode.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private UserService userService2;

    @RequestMapping("/userDetail")
    public String userDetail(Model model, Integer id){
        User user = userService.queryUserById(id);
        User user2 = userService.queryUserById(id);
        model.addAttribute("user",user);
        model.addAttribute("user2",user2);
        return "userDetail";
    }
}
