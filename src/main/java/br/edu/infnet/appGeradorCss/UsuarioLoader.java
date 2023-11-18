package br.edu.infnet.appGeradorCss;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appGeradorCss.model.domain.Usuario;

@Component
public class UsuarioLoader implements ApplicationRunner {

    private Map<String, Usuario> mapa = new HashMap<String, Usuario>();

    // Construtor padrão
    public UsuarioLoader() {
    }

    // Construtor com parâmetros
    public UsuarioLoader(String filePath) throws Exception {
        carregarUsuarios(filePath);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        carregarUsuarios("files/usuarios.txt");

        for (Usuario usuario : mapa.values()) {
            System.out.println("[USUÁRIO] " + usuario);
        }
    }

    private void carregarUsuarios(String filePath) throws Exception {
        FileReader file = new FileReader(filePath);
        BufferedReader leitura = new BufferedReader(file);

        String linha = leitura.readLine();

        String[] campos = null;

        while (linha != null) {
            campos = linha.split(" - ");

            Usuario usuario = new Usuario();

            // Configurar valores usando métodos de instância
            usuario.setIDUsuario(Integer.parseInt(campos[0]));
            usuario.setNomeUsuario(campos[1]);
            usuario.setEmail(campos[2]);
            usuario.setSenha(campos[3]);
            usuario.setDataRegistro(campos[4]);

            mapa.put(usuario.getNomeUsuario(), usuario);

            linha = leitura.readLine();
        }

        // Fechar o leitor
        leitura.close();
    }
}
