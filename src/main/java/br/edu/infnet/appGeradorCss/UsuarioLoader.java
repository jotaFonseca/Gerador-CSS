package br.edu.infnet.appGeradorCss;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.appGeradorCss.model.domain.Usuario;
import br.edu.infnet.appGeradorCss.model.service.UsuarioService;

@Order(1)
@Component
public class UsuarioLoader implements ApplicationRunner {

	public UsuarioLoader() {
	}

	public UsuarioLoader(String filePath) throws Exception {
		carregarUsuarios(filePath);
	}

	@Autowired
	private UsuarioService usuarioService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		carregarUsuarios("files/usuarios.txt");

		for (Usuario usuario : usuarioService.obterLista()) {
			System.out.println("[USUÁRIO] " + usuario);
		}
	}

	private void carregarUsuarios(String filePath) throws Exception {
			try (FileReader file = new FileReader(filePath);
				BufferedReader leitura = new BufferedReader(file)) {
		
				String linha = leitura.readLine();
		
				while (linha != null) {
					String[] campos = linha.split(";");
					
					if(campos.length == 5) {
						Usuario usuario = new Usuario();
			
						usuario.setId(Integer.parseInt(campos[0]));
						usuario.setNome(campos[1]);
						usuario.setEmail(campos[2]);
						usuario.setSenha(campos[3]);
						usuario.setDataRegistro(campos[4]);
			
						usuarioService.incluir(usuario);
					} else {
						System.out.println("Ignorando linha inválida: " + linha);
					}
		
					linha = leitura.readLine();
				}
			}catch (Exception e) {
		       e.printStackTrace();
		    }
	}
}
