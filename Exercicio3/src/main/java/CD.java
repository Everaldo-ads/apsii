
public class CD extends Produto implements InfoGerais {
	public int numFaixas;

	public int getNumFaixas() {
		return numFaixas;
	}

	public void setNumFaixas(int numFaixas) {
		this.numFaixas = numFaixas;
	}

	public String exibeInformacoes() {
		return "Informações do CD"+"\nNome: "+this.nome+"\nPreço: "+this.preco+"\nNúmero de Faixas: "+this.numFaixas;
		
	}
	
	
}
