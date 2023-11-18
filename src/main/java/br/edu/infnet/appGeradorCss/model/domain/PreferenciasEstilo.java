package br.edu.infnet.appGeradorCss.model.domain;

public class PreferenciasEstilo extends Usuario{
	private int IDPreferencias;
	private int IDUsuario;
	private String CorFundoPadrao;
	private String CorTextoPadrao;
	private String TamanhoPadrao;
	private String PropBordaPadrao;
	private String EfeitoHoverPadrao;
	private String TipoFontePadrao;
	
	public PreferenciasEstilo() {
		super();
	}
	
    public PreferenciasEstilo(int IDUsuario, int IDPreferencias, String corFundoPadrao, String corTextoPadrao,
            String tamanhoPadrao, String propBordaPadrao, String efeitoHoverPadrao, String tipoFontePadrao) {
    	super(IDUsuario);

		this.IDPreferencias = IDPreferencias;
		this.CorFundoPadrao = corFundoPadrao;
		this.CorTextoPadrao = corTextoPadrao;
		this.TamanhoPadrao = tamanhoPadrao;
		this.PropBordaPadrao = propBordaPadrao;
		this.EfeitoHoverPadrao = efeitoHoverPadrao;
		this.TipoFontePadrao = tipoFontePadrao;
}
	
	@Override
	public String toString() {
		
		return String.format(
				"ID Preferências:(%d) - ID Usuário:(%d) - Cor de Fundo Padrão: (%s) - Cor do Texto Padrão: (%s) - Tamanho Padrão:(%s)"
				+ "Proporções da Borda Padrão:(%s) - Efeito Hover Padrão:(%s) - Tipo de Fonte Padrão:(%s)",
				super.toString(),IDPreferencias, IDUsuario, CorFundoPadrao, CorTextoPadrao, TamanhoPadrao, PropBordaPadrao, EfeitoHoverPadrao, TipoFontePadrao);
	}
	
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
