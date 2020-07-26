package AV2;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private double valorPedido;
	private List<Copos> lista = new ArrayList<Copos>();

	public double getValorPedido() {
		return valorPedido;
	}

	public void setValorPedido(double valorPedido) {
		this.valorPedido = valorPedido;
	}

	public List<Copos> getLista() {
		return lista;
	}

	public void setLista(List<Copos> lista) {
		this.lista = lista;
	}

	public Pedido(double valorPedido, List<Copos> lista) {
		super();
		this.valorPedido = valorPedido;
		this.lista = lista;
	}

	public Pedido() {
	}

	@Override
	public String toString() {
		return "Pedido [valorPedido=" + valorPedido + ", lista=" + lista + ", getValorPedido()=" + getValorPedido()
				+ ", getLista()=" + getLista() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
