package csv;

import com.google.gson.annotations.SerializedName;

public class PontoDeVenda {

	@SerializedName(value = "Tempo")
	private String tempo;

	@SerializedName(value = "Estação")
	private String estacao;

	@SerializedName(value = "LAT")
	private String latitude;

	@SerializedName(value = "LONG")
	private String longitude;

	@SerializedName(value = "Movimentação")
	private String movimentacao;

	@SerializedName(value = "Original_473")
	private String quantidadeOriginal473;

	@SerializedName(value = "Original_269")
	private String quantidadeOriginal268;

	@SerializedName(value = "Zero")
	private String quantidadeZero;

	@SerializedName(value = "Maçã-Verde")
	private String quantidadeMacaVerde;

	@SerializedName(value = "Tangerina")
	private String quantidadeTangerina;

	@SerializedName(value = "Citrus")
	private String quantidadeCitrus;

	@SerializedName(value = "Açaí-Guaraná")
	private String quantidadeAcaiGuarana;

	@SerializedName(value = "Pêssego")
	private String quantidadePessego;

	@SerializedName(value = "TARGET")
	private String target;

	@SerializedName(value = "row")
	private int linha;

	public String getTempo() {
		return tempo;
	}

	public void setTempo(String tempo) {
		this.tempo = tempo;
	}

	public String getEstacao() {
		return estacao;
	}

	public void setEstacao(String estacao) {
		this.estacao = estacao;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getMovimentacao() {
		return movimentacao;
	}

	public void setMovimentacao(String movimentacao) {
		this.movimentacao = movimentacao;
	}

	public String getQuantidadeOriginal473() {
		return quantidadeOriginal473;
	}

	public void setQuantidadeOriginal473(String quantidadeOriginal473) {
		this.quantidadeOriginal473 = quantidadeOriginal473;
	}

	public String getQuantidadeOriginal268() {
		return quantidadeOriginal268;
	}

	public void setQuantidadeOriginal268(String quantidadeOriginal268) {
		this.quantidadeOriginal268 = quantidadeOriginal268;
	}

	public String getQuantidadeZero() {
		return quantidadeZero;
	}

	public void setQuantidadeZero(String quantidadeZero) {
		this.quantidadeZero = quantidadeZero;
	}

	public String getQuantidadeMacaVerde() {
		return quantidadeMacaVerde;
	}

	public void setQuantidadeMacaVerde(String quantidadeMacaVerde) {
		this.quantidadeMacaVerde = quantidadeMacaVerde;
	}

	public String getQuantidadeTangerina() {
		return quantidadeTangerina;
	}

	public void setQuantidadeTangerina(String quantidadeTangerina) {
		this.quantidadeTangerina = quantidadeTangerina;
	}

	public String getQuantidadeCitrus() {
		return quantidadeCitrus;
	}

	public void setQuantidadeCitrus(String quantidadeCitrus) {
		this.quantidadeCitrus = quantidadeCitrus;
	}

	public String getQuantidadeAcaiGuarana() {
		return quantidadeAcaiGuarana;
	}

	public void setQuantidadeAcaiGuarana(String quantidadeAcaiGuarana) {
		this.quantidadeAcaiGuarana = quantidadeAcaiGuarana;
	}

	public String getQuantidadePessego() {
		return quantidadePessego;
	}

	public void setQuantidadePessego(String quantidadePessego) {
		this.quantidadePessego = quantidadePessego;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}

	public PontoDeVenda(String tempo, String estacao, String latitude, String longitude, String movimentacao,
			String quantidadeOriginal473, String quantidadeOriginal268, String quantidadeZero,
			String quantidadeMacaVerde, String quantidadeTangerina, String quantidadeCitrus,
			String quantidadeAcaiGuarana, String quantidadePessego, String target, int linha) {
		super();
		this.tempo = tempo;
		this.estacao = estacao;
		this.latitude = latitude;
		this.longitude = longitude;
		this.movimentacao = movimentacao;
		this.quantidadeOriginal473 = quantidadeOriginal473;
		this.quantidadeOriginal268 = quantidadeOriginal268;
		this.quantidadeZero = quantidadeZero;
		this.quantidadeMacaVerde = quantidadeMacaVerde;
		this.quantidadeTangerina = quantidadeTangerina;
		this.quantidadeCitrus = quantidadeCitrus;
		this.quantidadeAcaiGuarana = quantidadeAcaiGuarana;
		this.quantidadePessego = quantidadePessego;
		this.target = target;
		this.linha = linha;
	}

}
