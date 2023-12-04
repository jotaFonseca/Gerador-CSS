package br.edu.infnet.appGeradorCss;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appGeradorCss.model.domain.Preferencias;
import br.edu.infnet.appGeradorCss.model.service.PreferenciasService;

@Order(2)
@Component
public class PreferenciasLoader implements ApplicationRunner{
	
	public PreferenciasLoader() {
	}
	
	public PreferenciasLoader(String filePath) throws Exception{
		carregarPreferencias(filePath);
	}

	@Autowired
	private PreferenciasService preferenciasService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		carregarPreferencias("files/preferencias.txt");
		
		for(Preferencias preferencias : preferenciasService.obterLista()) {
			System.out.println("[PREFERENCIAS] " + preferencias);
		}
	}
	
	private void carregarPreferencias(String filePath) throws Exception {
	    	try (FileReader file = new FileReader(filePath);
	            BufferedReader leitura = new BufferedReader(file)) {

	           String linha = leitura.readLine();

	           while (linha != null) {
	               String[] campos = linha.split(";");

	               if (campos.length == 7) {
	                   Preferencias preferencias = new Preferencias();

	                   preferencias.setIdPref(Integer.valueOf(campos[0]));
	                   preferencias.setCorFundoPadrao(campos[1]);
	                   preferencias.setCorTextoPadrao(campos[2]);
	                   preferencias.setTamanhoPadrao(campos[3]);
	                   preferencias.setBordaPadrao(campos[4]);
	                   preferencias.setHoverPadrao(campos[5]);
	                   preferencias.setFontePadrao(campos[6]);

	                   preferenciasService.incluir(preferencias);
	               } else {
	                   System.out.println("Ignorando linha inválida: " + linha);
	               }

	               linha = leitura.readLine();
	           }
	       } catch (Exception e) {
	           e.printStackTrace();
	       }
	}
}
