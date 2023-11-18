package br.edu.infnet.appGeradorCss.model.domain;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

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
	
	public BotaoPersonalizado() {
	}
	
    public BotaoPersonalizado(int IDBotao, String NomeBotao, String CorFundo, String CorTexto, String TamanhoBotao,
                              String PropriedadesBorda, String EfeitoHover, String TipoFonte, String OutrasPropCSS,
                              String CodigoCSSGerado, Date DataCriacao) {
        this.IDBotao = IDBotao;
        this.NomeBotao = NomeBotao;
        this.CorFundo = CorFundo;
        this.CorTexto = CorTexto;
        this.TamanhoBotao = TamanhoBotao;
        this.PropriedadesBorda = PropriedadesBorda;
        this.EfeitoHover = EfeitoHover;
        this.TipoFonte = TipoFonte;
        this.OutrasPropCSS = OutrasPropCSS;
        this.CodigoCSSGerado = CodigoCSSGerado;
        this.DataCriacao = DataCriacao;
    }

    public BotaoPersonalizado(int IDBotao, String NomeBotao, String CorFundo, String CorTexto, String TamanhoBotao,
                              String PropriedadesBorda, String EfeitoHover, String TipoFonte, String OutrasPropCSS,
                              String CodigoCSSGerado, String dataCriacao) throws ParseException {
        this(IDBotao, NomeBotao, CorFundo, CorTexto, TamanhoBotao, PropriedadesBorda, EfeitoHover, TipoFonte,
                OutrasPropCSS, CodigoCSSGerado, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dataCriacao));
    }
	
	@Override
	public String toString() {
        SimpleDateFormat formatoData = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dataFormatada = formatoData.format(DataCriacao);
        
		return String.format(
				"ID do Botão: (%d) - Nome do Botão: (%s) - Cor de Fundo: (%s) - Cor do Texto: (%s) - Tamanho do Botão:(%s) - "
				+ "Propriedades da Borda:(%s) - Efeito Hover:(%s) - Tipo da Fonte:(%s) - Outras Propriedades CSS:(%s) - "
				+ "Código CSS Gerado:(%s) - Data de Criação:(%s)"
				, IDBotao, NomeBotao, CorFundo, CorTexto, TamanhoBotao, PropriedadesBorda, EfeitoHover, TipoFonte, OutrasPropCSS, CodigoCSSGerado,
				dataFormatada);
	}
	
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
