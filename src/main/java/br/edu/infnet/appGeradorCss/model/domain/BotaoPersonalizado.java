package br.edu.infnet.appGeradorCss.model.domain;
import java.util.Date;

public class BotaoPersonalizado {
	private int IDBotao;
	private String NomeBotao;
	private String CorFundo;
	private String CorTexto;
	private String TamanhoBotao;
	private String PropriedadesBorda;
	private String EfeitoHover;
	private String TipoFonte;
	private String OutrasPropCSS;
	private String CodigoCSSGerado;
	private Date DataCriacao;
	public int getIDBotao() {
		return IDBotao;
	}
	public void setIDBotao(int iDBotao) {
		IDBotao = iDBotao;
	}
	public String getNomeBotao() {
		return NomeBotao;
	}
	public void setNomeBotao(String nomeBotao) {
		NomeBotao = nomeBotao;
	}
	public String getCorFundo() {
		return CorFundo;
	}
	public void setCorFundo(String corFundo) {
		CorFundo = corFundo;
	}
	public String getCorTexto() {
		return CorTexto;
	}
	public void setCorTexto(String corTexto) {
		CorTexto = corTexto;
	}
	public String getTamanhoBotao() {
		return TamanhoBotao;
	}
	public void setTamanhoBotao(String tamanhoBotao) {
		TamanhoBotao = tamanhoBotao;
	}
	public String getPropriedadesBorda() {
		return PropriedadesBorda;
	}
	public void setPropriedadesBorda(String propriedadesBorda) {
		PropriedadesBorda = propriedadesBorda;
	}
	public String getEfeitoHover() {
		return EfeitoHover;
	}
	public void setEfeitoHover(String efeitoHover) {
		EfeitoHover = efeitoHover;
	}
	public String getTipoFonte() {
		return TipoFonte;
	}
	public void setTipoFonte(String tipoFonte) {
		TipoFonte = tipoFonte;
	}
	public String getOutrasPropCSS() {
		return OutrasPropCSS;
	}
	public void setOutrasPropCSS(String outrasPropCSS) {
		OutrasPropCSS = outrasPropCSS;
	}
	public String getCodigoCSSGerado() {
		return CodigoCSSGerado;
	}
	public void setCodigoCSSGerado(String codigoCSSGerado) {
		CodigoCSSGerado = codigoCSSGerado;
	}
	public Date getDataCriacao() {
		return DataCriacao;
	}
	public void setDataCriacao(Date dataCriacao) {
		DataCriacao = dataCriacao;
	}
}
