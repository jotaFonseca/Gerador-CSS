package br.edu.infnet.appGeradorCss.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.appGeradorCss.model.domain.Botao;
import br.edu.infnet.appGeradorCss.model.service.BotaoService;

@RestController
@RequestMapping("/api/botao")
public class BotaoController {
	
	@Autowired
	private BotaoService botaoService;
	
	@GetMapping(value = "/listar")
	public List<Botao> obterLista() {
		return (List<Botao>) botaoService.obterLista();
	}
	
	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Botao botao) {
		botaoService.incluir(botao);
	}
	
	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		botaoService.excluir(id);
	}
}
