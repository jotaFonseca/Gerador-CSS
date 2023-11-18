package br.edu.infnet.appGeradorCss.model.domain;

public class Preferencias extends Usuario{
	private int IdPref;
	private String CorFundoPadrao;
	private String CorTextoPadrao;
	private String TamanhoPadrao;
	private String BordaPadrao;
	private String HoverPadrao;
	private String FontePadrao;
	
	public Preferencias() {
		super();
	}
	
    public Preferencias(int Id, int IdPref, String corFundoPadrao, String corTextoPadrao,
            String tamanhoPadrao, String bordaPadrao, String hoverPadrao, String fontePadrao) {
    	super(Id);

		this.IdPref = IdPref;
		this.CorFundoPadrao = corFundoPadrao;
		this.CorTextoPadrao = corTextoPadrao;
		this.TamanhoPadrao = tamanhoPadrao;
		this.BordaPadrao = bordaPadrao;
		this.HoverPadrao = hoverPadrao;
		this.FontePadrao = fontePadrao;
}
	
	@Override
	public String toString() {
		
		return String.format(
				"ID Preferências:(%d) - Cor de Fundo Padrão: (%s) - Cor do Texto Padrão: (%s) - Tamanho Padrão:(%s)"
				+ "Proporções da Borda Padrão:(%s) - Efeito Hover Padrão:(%s) - Tipo de Fonte Padrão:(%s)",
				super.toString(),IdPref, CorFundoPadrao, CorTextoPadrao, TamanhoPadrao, BordaPadrao, HoverPadrao, FontePadrao);
	}
	
	public int getIdPref() {
		return IdPref;
	}
	public void setIdPref(int idPref) {
		IdPref = idPref;
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
	public String getBordaPadrao() {
		return BordaPadrao;
	}
	public void setBordaPadrao(String bordaPadrao) {
		BordaPadrao = bordaPadrao;
	}
	public String getHoverPadrao() {
		return HoverPadrao;
	}
	public void setHoverPadrao(String hoverPadrao) {
		HoverPadrao = hoverPadrao;
	}
	public String getFontePadrao() {
		return FontePadrao;
	}
	public void setFontePadrao(String fontePadrao) {
		FontePadrao = fontePadrao;
	}
}
