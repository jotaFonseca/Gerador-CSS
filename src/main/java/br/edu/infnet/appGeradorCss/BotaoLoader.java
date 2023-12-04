package br.edu.infnet.appGeradorCss;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appGeradorCss.model.domain.Botao;
import br.edu.infnet.appGeradorCss.model.service.BotaoService;

@Order(2)
@Component
public class BotaoLoader implements ApplicationRunner{
	
	public BotaoLoader() {
	}
	
	public BotaoLoader(String filePath) throws Exception {
		carregarPropriedades(filePath);
	}

	@Autowired
	private BotaoService botaoService;

	@Override
	public void run(ApplicationArguments args) throws Exception {	
      carregarPropriedades("files/propriedades.txt");

      for (Botao botao : botaoService.obterLista()) {
          System.out.println("[BOTAO] " + botao);
      }
		
	}
	
	private void carregarPropriedades(String filePath) throws Exception{
			try (FileReader file = new FileReader(filePath);
				BufferedReader leitura = new BufferedReader(file)) {
		
		    String linha = leitura.readLine();
		
		    while (linha != null) {
		        String[] campos = linha.split(";");
		        
		        if(campos.length == 9) {
			        Botao botao = new Botao();
			        
			        botao.setId(Integer.valueOf(campos[0]));
			        botao.setNomeBotao(campos[1]);
			        botao.setCorFundo(campos[2]);
			        botao.setCorTexto(campos[3]);
			        botao.setTamanhoBotao(campos[4]);
			        botao.setBorda(campos[5]);
			        botao.setHover(campos[6]);
			        botao.setFonte(campos[7]);
			        botao.setDataCriacao(campos[8]);
			        
			        botaoService.incluir(botao);
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

