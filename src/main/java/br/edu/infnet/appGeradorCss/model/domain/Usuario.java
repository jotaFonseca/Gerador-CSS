package br.edu.infnet.appGeradorCss.model.domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@JsonTypeInfo(
		use = JsonTypeInfo.Id.NAME,
		include = JsonTypeInfo.As.PROPERTY,
		property = "tipo")
@JsonSubTypes({
	@JsonSubTypes.Type(value = Botao.class, name = "botao"),
	@JsonSubTypes.Type(value = Preferencias.class, name = "preferencias")
})
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	
	private String Nome;
	private String Email;
	private String Senha;
	protected Date DataRegistro;
	
	@OneToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name = "idPreferencias")
	private Preferencias preferencias;
	
	@ManyToMany(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
	@JoinColumn(name = "idBotao")
	@JsonBackReference
	private List<Botao> botoes;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "idEndereco")
	private Endereco endereco;
	

	public Usuario() {
	}

	public Usuario(int Id) {
		this.Id = Id;
	}

	public Usuario(Integer Id, String Nome, String Email, String Senha, Date DataRegistro) {
		this.Id = Id;
		this.Nome = Nome;
		this.Email = Email;
		this.Senha = Senha;
		this.DataRegistro = DataRegistro;
	}

	@Override
	public String toString() {
		SimpleDateFormat formatoData = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dataFormatada = "";
		if (DataRegistro != null) {
			dataFormatada = formatoData.format(DataRegistro);
		}
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
	
	public Preferencias getPreferencias() {
		return preferencias;
	}
	
	public void setPreferencias(Preferencias preferencias) {
		this.preferencias = preferencias;
	}
	
	public List<Botao> getBotoes() {
		return botoes;
	}
	
	public void setBotoes(List<Botao> botoes) {
		this.botoes = botoes;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}