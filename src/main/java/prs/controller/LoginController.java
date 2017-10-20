package prs.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.servlet.ModelAndView;
import prs.service.user.UserService;

@Controller
public class LoginController {

    @Resource(name = "userService")
    private UserService userService;

    @RequestMapping("/login")
    public ModelAndView loginView() {
        System.out.println("???");
        return new ModelAndView("login");
    }

    @RequestMapping("/getzs")
    @ResponseBody
    public String getUserByUserName() {
        return userService.getUserByUserName();
    }
}
