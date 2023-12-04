package br.edu.infnet.appGeradorCss.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appGeradorCss.model.domain.Preferencias;
import br.edu.infnet.appGeradorCss.model.repositories.PreferenciasRepository;

@Service
public class PreferenciasService {
	
	@Autowired
	private PreferenciasRepository preferenciasRepository;
	
	public void incluir(Preferencias preferencias) {
		preferenciasRepository.save(preferencias);
	}
	
	public Collection<Preferencias> obterLista() {
		return (Collection<Preferencias>) preferenciasRepository.findAll();
	}
}
