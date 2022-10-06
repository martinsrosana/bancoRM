package Entidades;

public class Conta {
	private int numero;
	private String titular;
	private double saldo;

	public Conta(int numero, String titular, double depositoInicial) {
		this.numero = numero;
		this.titular = titular;
		deposito(depositoInicial);
	}
	public Conta(int numero, String titular) {
		this.numero = numero;
		this.titular = titular;
	}
	
	public void deposito(double deposito) {
		saldo +=deposito;
	}
	
	public void sacar(double sacar) {
	 saldo-= sacar + 5.00;
	}

	public int getNumero() {
		return numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public String toString () {
		return "Conta"
				+ numero
				+" , Titular: "
				+ titular
				+ " , Saldo: R$ "
				+ String.format("%.2f", saldo);
				
	}

}
