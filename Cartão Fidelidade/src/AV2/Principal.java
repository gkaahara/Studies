package AV2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
	Scanner scanner = new Scanner(System.in);
	Cliente c = null;
	List<Copos> lista = new ArrayList<Copos>();

	public static void main(String[] args) {
		new Principal().processar();
	}

	private void processar() {
		int option = 0;
		do {
			System.out.println("1 - Cadastrar Cliente: ");
			System.out.println("2 - Registrar Pedido: ");
			System.out.println("3 - Cadastrar Pedido: ");
			System.out.println("9 - Encerrar Sessão");
			option = scanner.nextInt();

			switch (option) {
			case 1:
				c = new Cliente("Gabriel", 1234567890);
				break;
			case 2:

				Copos cup1 = new Copos("Amarelo", 'P', 15.00);
				lista.add(cup1);
				Copos cup2 = new Copos("Vermelho", 'P', 5.00);
				lista.add(cup2);
				Copos cup3 = new Copos("Preto", 'M', 20.90);
				lista.add(cup3);
				Copos cup4 = new Copos("Rosa", 'G', 18.50);
				lista.add(cup4);
				Copos cup5 = new Copos("Azul", 'P', 35.90);
				lista.add(cup5);

				break;
			case 3:
				double total = 0.0;
				for (Copos copos : lista) {
					total = total + copos.getValor();
				}
				Pedido p = new Pedido(total, lista);
				c.setPed(p);
				System.out.println("Cliente completo: " + c);
				break;

			default:
				break;
			}

		} while (option != 9);
	}
}