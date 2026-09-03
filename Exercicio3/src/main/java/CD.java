
public class CD extends Produto implements InfoGerais {
	private int numFaixas;

	public int getNumFaixas() {
		return numFaixas;
	}

	public void setNumFaixas(int numFaixas) {
		this.numFaixas = numFaixas;
	}

	public String exibeInformacoes() {
		return "Informações do CD"+"\nNome: "+this.getNome()+"\nPreço: "+this.getPreco()+"\nNúmero de Faixas: "+this.numFaixas;
		
	}
	
	
}
