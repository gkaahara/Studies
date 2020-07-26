package AV2;

public class Cliente {
	private String nome;
	private long cpf;

	Pedido ped = new Pedido();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public Pedido getPed() {
		return ped;
	}

	public void setPed(Pedido ped) {
		this.ped = ped;
	}

	public Cliente(String nome, long cpf, Pedido ped) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.ped = ped;
	}

	public Cliente(String nome, long cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cpf=" + cpf + ", ped=" + ped + ", getNome()=" + getNome() + ", getCpf()="
				+ getCpf() + ", getPed()=" + getPed() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	

}
