public class ContaBancaria {
	private int    numero;
	private String tipo;
	private double saldo;
	private double limite;
	

	public ContaBancaria(int numero, String tipo, double limite) {
		this.numero = numero;
		this.tipo = tipo;
		this.limite = limite;
	}

	public void realizarDeposito(double valorDeposito) {
		this.saldo += valorDeposito;
	}
	
	public boolean realizarSaque(double valorSaque) {
		if (valorSaque > saldo + limite) {
			return false;
		}
		this.saldo -= valorSaque;
		return true;
	}
	
	public double obterSaldoDisponivel() {
		return saldo + limite;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}


}