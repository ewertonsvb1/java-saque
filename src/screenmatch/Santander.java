package screenmatch;

import java.util.Scanner;

public class Santander {

	public static void main(String[] args) {
		Scanner valor = new Scanner(System.in);

		// Leitura do nome
		System.out.println("Digite o nome do titular da conta: ");
		String nome = valor.nextLine();
		double saldo = 3000;
		int operacao;
		do {
			// Menu de operações
			System.out.println("##########################");
			System.out.println("# Escolha uma operação:  #");
			System.out.println("# 1 - Consultar saldo    #");
			System.out.println("# 2 - Aplicar na conta   #");
			System.out.println("# 3 - Retirar valor      #");
			System.out.println("# 4 - Sair               #");
			System.out.println("##########################");
			operacao = valor.nextInt();

			// Limpar o buffer para a próxima leitura
			valor.nextLine();

			// Processar a operação escolhida
			switch (operacao) {
			case 1:
				System.out.println("[------------------------------------------------]");
				System.out.println("Dados do usuário: ");
				System.out.println("Nome: " + nome);
				System.out.println("Saldo de: R$" + saldo);
				System.out.println("[------------------------------------------------]");
				break;

			case 2:
				System.out.println("Informe o valor a ser adicionado");
				double aplicar = valor.nextDouble();
				saldo = saldo + aplicar;
				System.out.println("Nome: " + nome);
				System.out.println("Saldo de: R$" + saldo);
				break;

			case 3:
				System.out.println("Informe o valor a ser retirado");
				double retirar = valor.nextDouble();
				if(retirar > saldo) {
					System.out.println("Saldo insuficiente para ser sacado!");
				}else {
				saldo = saldo - retirar;
				System.out.println("Nome: " + nome);
				System.out.println("Saldo de: R$" + saldo);
				}
				break;

			case 4:
				System.out.println("Saindo...");
				break;

			default:
				System.out.println("Opção inválida. Por favor, escolha uma operação válida.");
				break;
			}

		} while (operacao != 4);
		valor.close(); // Fechar o scanner
	}

}
