package br.edu.infnet.appGeradorCss.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;
import br.edu.infnet.appGeradorCss.model.domain.Preferencias;

@Service
public class PreferenciasService {
	
	private Map<Integer, Preferencias> mapa = new HashMap<Integer, Preferencias>();
	
	public void incluir(Preferencias preferencias) {
		mapa.put(preferencias.getIdPref(), preferencias);
	}
	
	public Collection<Preferencias> obterLista() {
		return mapa.values();
	}
}
