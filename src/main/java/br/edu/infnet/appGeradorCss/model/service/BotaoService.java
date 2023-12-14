package br.edu.infnet.appGeradorCss.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appGeradorCss.model.domain.Botao;
import br.edu.infnet.appGeradorCss.model.repositories.BotaoRepository;

@Service
public class BotaoService {
	
	@Autowired
	private BotaoRepository botaoRepository;
	
	public void incluir(Botao botao) {
		botaoRepository.save(botao);
	}
	
	public Collection<Botao> obterLista() {
		return (Collection<Botao>) botaoRepository.findAll();
	}
	
	public void excluir(Integer id) {
		botaoRepository.deleteById(id);
	}
}
