package com.webapp.Webappcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class Cadastro {
	@RequestMapping("/cadastrarUsuario")
	public String form() {
		return "templates/formCadastro";

}

}


	