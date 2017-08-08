package com.xsz.controller;

import com.xsz.model.UserEntity;
import com.xsz.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by liujinliang on 2017/8/8.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/showUser")
    public String toIndex(HttpServletRequest request, Model model) {
        int userId = Integer.parseInt(request.getParameter("id"));
        UserEntity userEntity = this.userService.getUserById(userId);
        model.addAttribute("userEntity",userEntity);
        return "showUser";
    }
}
