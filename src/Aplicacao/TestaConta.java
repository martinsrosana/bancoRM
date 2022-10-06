package Aplicacao;

import java.util.Scanner;

import Entidades.Conta;

public class TestaConta {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Conta conta;

		System.out.print("Informe o número da Conta: ");
		int numero = scanner.nextInt();
		System.out.println();
		System.out.println("Informe o nome do titular da conta: ");
		String titular = scanner.next();
		System.out.println();
		System.out.print("Deseja realizar um deposito inicial? [1] Sim [2]Não");
		int respostaDepositoInicial = scanner.nextInt();
		System.out.println();
		if (respostaDepositoInicial == 1) {
			System.out.println("Quanto deseja depositar? ");
			double depositoInicial = scanner.nextDouble();
			conta = new Conta(numero, titular, depositoInicial);
		} else {
			conta = new Conta(numero, titular);
		}
		System.out.println();
		System.out.println(" Dados da Conta: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Qual o valor do deposito? ");
		double valorDeposito = scanner.nextDouble();
		conta.deposito(valorDeposito);
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Quantos deseja sacar? ");
		double valorSaque = scanner.nextDouble();
		conta.sacar(valorSaque);
		System.out.println(conta);
		
		scanner.close();
	}
} 