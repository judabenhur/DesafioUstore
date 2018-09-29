package com.teste.Desafio.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/")
@Controller
public class Login {
	
	public String login;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@RequestParam String login, @RequestParam String password) {
		User user = this.login.findOneByLogin(login);
		if(user != null && user.isActive()) {
			return "redirect:/dashboard/" + user.getId();
		}
		return "LOGIN INVALIDO";
	}

}
