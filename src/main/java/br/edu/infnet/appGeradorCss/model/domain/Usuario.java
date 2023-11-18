package br.edu.infnet.appGeradorCss.model.domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Usuario {
	private int Id;
	private String Nome;
	private String Email;
	private String Senha;
	protected Date DataRegistro;

	public Usuario() {
	}

	public Usuario(int Id) {
		this.Id = Id;
	}

	public Usuario(int Id, String Nome, String Email, String Senha, Date DataRegistro) {
		this.Id = Id;
		this.Nome = Nome;
		this.Email = Email;
		this.Senha = Senha;
		this.DataRegistro = DataRegistro;
	}

	@Override
	public String toString() {
		SimpleDateFormat formatoData = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dataFormatada = formatoData.format(DataRegistro);
		return String.format("ID Usuário:(%d) - Nome:(%s) - Email:(%s) - Senha: (%s) - Data Registro: (%s)", Id, Nome,
				Email, Senha, dataFormatada);
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
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