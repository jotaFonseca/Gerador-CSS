package br.edu.infnet.appGeradorCss.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appGeradorCss.model.domain.Botao;

@Service
public class BotaoService {
	
	private Map<Integer, Botao> mapa = new HashMap<Integer, Botao>();
	
	public void incluir(Botao botao) {
		mapa.put(botao.getId(), botao);
	}
	
	public Collection<Botao> obterLista() {
		return mapa.values();
	}
}
