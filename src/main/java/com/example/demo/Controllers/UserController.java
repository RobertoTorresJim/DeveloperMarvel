package com.example.demo.Controllers;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import com.example.demo.Models.UserVO;

@Controller
public class UserController {
	
	@RequestMapping("/lista")
	public String demoUser(Model modelo) {
		
		UserVO user = new UserVO();
		
		user.setUser("Test");
		user.setPass("1234");
		List<UserVO> users= Arrays.asList(user);
		modelo.addAttribute("user", users);
		return "lista";
	}

}
