package br.edu.infnet.appGeradorCss.model.domain;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class Botao extends Usuario{
	private int Id;
	private String NomeBotao;
	private String CorFundo;
	private String CorTexto;
	private String TamanhoBotao;
	private String Borda;
	private String Hover;
	private String Fonte;
	private Date DataCriacao;
	
	public Botao() {
		super();
	}
	
    public Botao(int Id, String NomeBotao, String CorFundo, String CorTexto, String TamanhoBotao,
                              String Borda, String Hover, String Fonte, Date DataCriacao) {
    	super(Id);
    	
        this.Id = Id;
        this.NomeBotao = NomeBotao;
        this.CorFundo = CorFundo;
        this.CorTexto = CorTexto;
        this.TamanhoBotao = TamanhoBotao;
        this.Borda = Borda;
        this.Hover = Hover;
        this.Fonte = Fonte;
        this.DataCriacao = DataCriacao;
    }

    public Botao(int Id, String NomeBotao, String CorFundo, String CorTexto, String TamanhoBotao,
                              String Borda, String Hover, String Fonte, String OutrasPropCSS,
                              String CodigoCSSGerado, String dataCriacao) throws ParseException {
        this(Id, NomeBotao, CorFundo, CorTexto, TamanhoBotao, Borda, Hover, Fonte,
                 new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dataCriacao));
    }
	
	@Override
	public String toString() {
        SimpleDateFormat formatoData = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dataFormatada = formatoData.format(DataCriacao);
        
		return String.format(
				"ID do Botão: (%d) - Nome do Botão: (%s) - Cor de Fundo: (%s) - Cor do Texto: (%s) - Tamanho do Botão:(%s) - "
				+ "Propriedades da Borda:(%s) - Efeito Hover:(%s) - Tipo da Fonte:(%s)- Data de Criação do Botão:(%s)"
				, Id, NomeBotao, CorFundo, CorTexto, TamanhoBotao, Borda, Hover, Fonte, dataFormatada);
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
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
	public String getBorda() {
		return Borda;
	}
	public void setBorda(String borda) {
		Borda = borda;
	}
	public String getHover() {
		return Hover;
	}
	public void setHover(String hover) {
		Hover = hover;
	}
	public String getFonte() {
		return Fonte;
	}
	public void setFonte(String fonte) {
		Fonte = fonte;
	}

	public Date getDataCriacao() {
		return DataCriacao;
	}
	public void setDataCriacao(String dataCriacao) throws Exception {
		SimpleDateFormat formatoData = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		DataCriacao = formatoData.parse(dataCriacao);
	}
}
