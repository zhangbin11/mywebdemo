package prs.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import prs.dao.user.UserDao;
import prs.model.user.UserEntity;
import prs.service.user.UserService;

@Controller
public class LoginController {
	
	@Resource(name="user-UserService")
	private UserService userService;

	@RequestMapping("/login")
	public String loginView() {
		System.out.println("???");
		return "login";
	}
	
	@RequestMapping("/getzs")
	@ResponseBody
	public String getUserByUserName() {
		return userService.getUserByUserName();
	}
}
