import java.util.Scanner;

import Simulacao.Simulacao;

public class Main extends Simulacao {

	public static void main(String[] args) {

		// Instâncias
		Scanner scan = new Scanner(System.in);

		// Pergunta quantas simulações serão realizadas
		System.out.println(
				"Por favor, Qual o numero de simulações que deseja fazer ? \n( Digite um valor diferente de 0 até 100)");
		int numeroSimu = scan.nextInt();
		
		// Retorna os valores que foram granhos trocando a porta ou mantendo em json		
		String retornoSimulacao = SimulacaoManager(numeroSimu);
		System.out.println(retornoSimulacao);

	}

}
