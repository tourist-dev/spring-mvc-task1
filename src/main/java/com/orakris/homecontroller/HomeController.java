package com.orakris.homecontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@RequestMapping("/display")
	public String display(@RequestParam("username") String username, Model model) {
		model.addAttribute("message", "hello " + username);
		return "home"; 
	}
}
