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

import br.edu.infnet.appGeradorCss.model.domain.Preferencias;
import br.edu.infnet.appGeradorCss.model.service.PreferenciasService;

@RestController
@RequestMapping("/api/preferencias")
public class PreferenciasController {
	
	@Autowired
	private PreferenciasService preferenciasService;
	
	@GetMapping(value = "/listar")
	public List<Preferencias> obterLista() {
		return (List<Preferencias>) preferenciasService.obterLista();
	}
	
	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Preferencias preferencias) {
		preferenciasService.incluir(preferencias);
	}
	
	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		preferenciasService.excluir(id);
	}
}