package br.edu.infnet.appGeradorCss.model.domain;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Usuario {
	private Integer IDUsuario;
	private String NomeUsuario;
	private String Email;
	private String Senha;
	private Date DataRegistro;
	
	// Construtor padrão
    public Usuario() {
    }

    // Construtor com parâmetros
    public Usuario(Integer IDUsuario, String NomeUsuario, String Email, String Senha, Date DataRegistro) {
        this.IDUsuario = IDUsuario;
        this.NomeUsuario = NomeUsuario;
        this.Email = Email;
        this.Senha = Senha;
        this.DataRegistro = DataRegistro;
    }
	
    @Override
    public String toString() {
        SimpleDateFormat formatoData = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dataFormatada = formatoData.format(DataRegistro);
        return String.format("ID Usuário:(%d) - Nome:(%s) - Email:(%s) - Senha: (%s) - Data Registro: (%s)",
                IDUsuario, NomeUsuario, Email, Senha, dataFormatada);
    }

    public int getIDUsuario() {
        return IDUsuario;
    }

    public void setIDUsuario(int iDUsuario) {
        IDUsuario = iDUsuario;
    }

    public String getNomeUsuario() {
        return NomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        NomeUsuario = nomeUsuario;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        Senha = senha;
    }

    public Date getDataRegistro() {
        return DataRegistro;
    }

    public void setDataRegistro(String dataRegistro) throws ParseException {
        SimpleDateFormat formatoData = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        DataRegistro = formatoData.parse(dataRegistro);
    }
}