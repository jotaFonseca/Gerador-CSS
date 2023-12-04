package br.edu.infnet.appGeradorCss.model.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appGeradorCss.model.domain.Preferencias;

@Repository
public interface PreferenciasRepository extends CrudRepository<Preferencias, Integer> {

	
}
