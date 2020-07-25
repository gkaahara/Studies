package objectorientation;

public class PrincipalApolice {
	public static void main(String[] args) {
		Apolice novoObj = new Apolice();
		novoObj.idade = 20;
		novoObj.nomeSegurado = "Gabriel";
		novoObj.valorPremio = 500;
		System.out.println("Imprimir dados:");
		novoObj.imprimir();
		novoObj.calcularPremioApolice();
		novoObj.imprimir();
		System.out.println("Imprimir dados após cálculos de apólice:");
		novoObj.imprimir();
		novoObj.oferecerDesconto("Curitiba");
		novoObj.imprimir();
	}
}
