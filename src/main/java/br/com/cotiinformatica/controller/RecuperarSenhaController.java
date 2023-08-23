package br.com.cotiinformatica.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RecuperarSenhaController {
	
	@RequestMapping(value ="/recuperar-senha") // caminho da pagina
	public ModelAndView recuperarSenha() {
		//mapeamento da pagina que sera exibida
		//WEB-INF/views/criar-conta.jsp
		ModelAndView modelAndView = new ModelAndView("recuperar-senha");
		return modelAndView;
	}

}
