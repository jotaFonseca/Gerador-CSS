package br.edu.infnet.appGeradorCss.model.domain;

public class PreferenciasEstilo {
	private int IDPreferencias;
	private int IDUsuario;
	private String CorFundoPadrao;
	private String CorTextoPadrao;
	private String TamanhoPadrao;
	private String PropBordaPadrao;
	private String EfeitoHoverPadrao;
	private String TipoFontePadrao;
	public int getIDPreferencias() {
		return IDPreferencias;
	}
	public void setIDPreferencias(int iDPreferencias) {
		IDPreferencias = iDPreferencias;
	}
	public int getIDUsuario() {
		return IDUsuario;
	}
	public void setIDUsuario(int iDUsuario) {
		IDUsuario = iDUsuario;
	}
	public String getCorFundoPadrao() {
		return CorFundoPadrao;
	}
	public void setCorFundoPadrao(String corFundoPadrao) {
		CorFundoPadrao = corFundoPadrao;
	}
	public String getCorTextoPadrao() {
		return CorTextoPadrao;
	}
	public void setCorTextoPadrao(String corTextoPadrao) {
		CorTextoPadrao = corTextoPadrao;
	}
	public String getTamanhoPadrao() {
		return TamanhoPadrao;
	}
	public void setTamanhoPadrao(String tamanhoPadrao) {
		TamanhoPadrao = tamanhoPadrao;
	}
	public String getPropBordaPadrao() {
		return PropBordaPadrao;
	}
	public void setPropBordaPadrao(String propBordaPadrao) {
		PropBordaPadrao = propBordaPadrao;
	}
	public String getEfeitoHoverPadrao() {
		return EfeitoHoverPadrao;
	}
	public void setEfeitoHoverPadrao(String efeitoHoverPadrao) {
		EfeitoHoverPadrao = efeitoHoverPadrao;
	}
	public String getTipoFontePadrao() {
		return TipoFontePadrao;
	}
	public void setTipoFontePadrao(String tipoFontePadrao) {
		TipoFontePadrao = tipoFontePadrao;
	}
}
