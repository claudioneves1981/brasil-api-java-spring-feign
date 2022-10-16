package br.com.brasilapi.api;

/**
 * Informa��es sobre Pre�o M�dio de Ve�culos fornecido 
 * pela FIPE (Funda��o Instituto de Pesquisas Econ�micas).
 * 
 * @author S�vio Andres
 * @see <a href="https://brasilapi.com.br/docs#tag/FIPE">https://brasilapi.com.br/docs#tag/FIPE</a>
 */
public class FipeMarcas extends API {
	private String nome;
	private String valor;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "FipeMarcas [nome=" + nome + ", valor=" + valor + "]";
	}
	
	
}
