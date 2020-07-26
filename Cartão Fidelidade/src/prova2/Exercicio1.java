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
		System.out.println("O valor da soma dos valores é: " + mais + ", o valor da subtração é: " + menos
				+ ", o valor da multiplicação é: " + vezes + ", o valor da divisão é: " + div1 + " e o resto é: "
				+ div2);
		scanner.close();
	}
}
