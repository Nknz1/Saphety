import java.util.Scanner;

import Simulacao.Simulacao;

public class Main extends Simulacao {

	public static void main(String[] args) {

		// Inst�ncias
		Scanner scan = new Scanner(System.in);

		// Pergunta quantas simula��es ser�o realizadas
		System.out.println(
				"Por favor, Qual o numero de simula��es que deseja fazer ? \n( Digite um valor diferente de 0 at� 100)");
		int numeroSimu = scan.nextInt();
		
		// Retorna os valores que foram granhos trocando a porta ou mantendo em json		
		String retornoSimulacao = SimulacaoManager(numeroSimu);
		System.out.println(retornoSimulacao);

	}

}
