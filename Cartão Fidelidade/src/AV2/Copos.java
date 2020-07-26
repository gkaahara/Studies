package AV2;

public class Copos {
	private String cor;
	private char tamanho;
	private double valor;

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public char getTamanho() {
		return tamanho;
	}

	public void setTamanho(char tamanho) {
		this.tamanho = tamanho;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Copos(String cor, char tamanho, double valor) {
		super();
		this.cor = cor;
		this.tamanho = tamanho;
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Copos [cor=" + cor + ", tamanho=" + tamanho + ", valor=" + valor + ", getCor()=" + getCor()
				+ ", getTamanho()=" + getTamanho() + ", getValor()=" + getValor() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
