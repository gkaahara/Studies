package objectorientation;

public class Apolice {
	String nomeSegurado;
	byte idade;
	double valorPremio;

	public void imprimir() {
		System.out.println(nomeSegurado + ", " + idade + ", " + valorPremio);
	}

	public void calcularPremioApolice() {
		if (idade > 18 && idade <= 25) {
			valorPremio += (valorPremio * 20) / 100;
		}
		if (idade > 25 && idade <= 36) {
			valorPremio += (valorPremio * 15) / 100;
		}
		if (idade > 36) {
			valorPremio += (valorPremio * 10) / 100;
		}
	}

	public void oferecerDesconto(String cidade) {
		if (cidade.contentEquals("Curitiba")) {
			valorPremio -= (valorPremio * 20) / 100;
		}
		if (cidade.contentEquals("Rio de Janeiro")) {
			valorPremio -= (valorPremio * 15) / 100;
		}
		if (cidade.contentEquals("São Paulo")) {
			valorPremio -= (valorPremio * 10) / 100;
		}
		if (cidade.contentEquals("Belo Horizonte")) {
			valorPremio -= (valorPremio * 5) / 100;
		}
	}
}