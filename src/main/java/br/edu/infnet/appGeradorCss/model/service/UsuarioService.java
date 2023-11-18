package br.edu.infnet.appGeradorCss.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.appGeradorCss.model.domain.Usuario;

@Service
public class UsuarioService {
	
	private Map<String, Usuario> mapa = new HashMap<String, Usuario>();
	
	public void incluir(Usuario usuario) {
		mapa.put(usuario.getNome(), usuario);
	}
	
	public Collection<Usuario> obterLista() {
		return mapa.values();
	}
	
}
