package prova2;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x, y, mais, menos, vezes, div1, div2;
		System.out.println("Insira o valor de X: ");
		x = scanner.nextInt();
		System.out.println("Insira o valor de Y: ");
		y = scanner.nextInt();
		mais = x + y;
		menos = x - y;
		vezes = x * y;
		div1 = x / y;
		div2 = x % y;
		System.out.println("O valor da soma dos valores �: " + mais + ", o valor da subtra��o �: " + menos
				+ ", o valor da multiplica��o �: " + vezes + ", o valor da divis�o �: " + div1 + " e o resto �: "
				+ div2);
		scanner.close();
	}
}
