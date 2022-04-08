package Simulacao;

import java.util.Random;
import java.util.Scanner;

public class Simulacao2 {

	public static void main(String[] args) {

		// Inst�ncias
		Scanner scan = new Scanner(System.in);
		Random numRandom = new Random();

		// Variaaveis
		int portaPessoa, portaCarro, countManterWin = 0, countTrocarWin = 0;
		int contador = 0;
		String portaEscolhida = null;

		// Pergunta quantas simula��es ser�o realizadas
		System.out.println(
				"Por favor, Qual o numero de simula��es que deseja fazer ? \n( Digite um valor diferente de 0 at� 100)");
		int numeroSimu = scan.nextInt();

		// Cria o la�o com o numero das simula��es
		while (contador != numeroSimu) {

			// Calcula o numero da porta do Carro
			portaCarro = numRandom.nextInt(3) + 1;

			// Pergunta qual porta a pessoa deseja abrir
			System.out
					.println("Por favor, Digite o numero da porta que deseja escolher \nPorta[1] Porta[2] e Porta[3]");
			portaPessoa = scan.nextInt();

			// Faz as valida��es e de acordo atribui para o numero de vitorias.
			if (portaCarro == 1 && portaPessoa == 1) {
				System.out.println("O Anfitriao abriu a porta 2! Deseja abrir a porta 3 ? [y/n]");
				portaEscolhida = scan.next();

				if (portaEscolhida.equals("y")) {
					portaPessoa = 3;

					if (portaPessoa == portaCarro) {
						System.out.println("Voc� ganhou!");
						countTrocarWin += 1;
					} else {
						System.out.println("Voc� perdeu!");

					}

				}

				else if (portaEscolhida.equals("n") && portaPessoa == portaCarro) {
					System.out.println("Voc� ganhou!");
					countManterWin += 1;
				} else {
					System.out.println("Voc� perdeu!");

				}

				contador += 1;

			}

			else if (portaCarro == 2 && portaPessoa == 1) {
				System.out.println("O Anfitriao abriu a porta 3! Deseja abrir a porta 2 ? [y/n]");
				portaEscolhida = scan.next();

				if (portaEscolhida.equals("y")) {
					portaPessoa = 2;

					if (portaPessoa == portaCarro) {
						System.out.println("Voc� ganhou!");
						countTrocarWin += 1;
					} else {
						System.out.println("Voc� perdeu!");

					}

				}

				else if (portaEscolhida.equals("n") && portaPessoa == portaCarro) {
					System.out.println("Voc� ganhou!");
					countManterWin += 1;
				} else {
					System.out.println("Voc� perdeu!");

				}

				contador += 1;

			}

			else if (portaCarro == 3 && portaPessoa == 1) {
				System.out.println("O Anfitriao abriu a porta 2! Deseja abrir a porta 3 ? [y/n]");
				portaEscolhida = scan.next();

				if (portaEscolhida.equals("y")) {
					portaPessoa = 3;

					if (portaPessoa == portaCarro) {
						System.out.println("Voc� ganhou!");
						countTrocarWin += 1;
					} else {
						System.out.println("Voc� perdeu!");

					}

				}

				else if (portaEscolhida.equals("n") && portaPessoa == portaCarro) {
					System.out.println("Voc� ganhou!");
					countManterWin += 1;
				} else {
					System.out.println("Voc� perdeu!");

				}

				contador += 1;

			}

			else if (portaCarro == 1 && portaPessoa == 2) {
				System.out.println("O Anfitriao abriu a porta 3! Deseja abrir a porta 1 ? [y/n]");
				portaEscolhida = scan.next();

				if (portaEscolhida.equals("y")) {
					portaPessoa = 1;

					if (portaPessoa == portaCarro) {
						System.out.println("Voc� ganhou!");
						countTrocarWin += 1;
					} else {
						System.out.println("Voc� perdeu!");

					}

				}

				else if (portaEscolhida.equals("n") && portaPessoa == portaCarro) {
					System.out.println("Voc� ganhou!");
					countManterWin += 1;
				} else {
					System.out.println("Voc� perdeu!");

				}

				contador += 1;

			}

			else if (portaCarro == 2 && portaPessoa == 2) {
				System.out.println("O Anfitriao abriu a porta 3! Deseja abrir a porta 1 ? [y/n]");
				portaEscolhida = scan.next();

				if (portaEscolhida.equals("y")) {
					portaPessoa = 1;

					if (portaPessoa == portaCarro) {
						System.out.println("Voc� ganhou!");
						countTrocarWin += 1;
					} else {
						System.out.println("Voc� perdeu!");

					}

				}

				else if (portaEscolhida.equals("n") && portaPessoa == portaCarro) {
					System.out.println("Voc� ganhou!");
					countManterWin += 1;
				} else {
					System.out.println("Voc� perdeu!");

				}

				contador += 1;

			}

			else if (portaCarro == 3 && portaPessoa == 2) {
				System.out.println("O Anfitriao abriu a porta 1! Deseja abrir a porta 3 ? [y/n]");
				portaEscolhida = scan.next();

				if (portaEscolhida.equals("y")) {
					portaPessoa = 3;

					if (portaPessoa == portaCarro) {
						System.out.println("Voc� ganhou!");
						countTrocarWin += 1;
					} else {
						System.out.println("Voc� perdeu!");

					}

				}

				else if (portaEscolhida.equals("n") && portaPessoa == portaCarro) {
					System.out.println("Voc� ganhou!");
					countManterWin += 1;
				} else {
					System.out.println("Voc� perdeu!");

				}

				contador += 1;

			}

			else if (portaCarro == 1 && portaPessoa == 3) {
				System.out.println("O Anfitriao abriu a porta 2! Deseja abrir a porta 1 ? [y/n]");
				portaEscolhida = scan.next();

				if (portaEscolhida.equals("y")) {
					portaPessoa = 1;

					if (portaPessoa == portaCarro) {
						System.out.println("Voc� ganhou!");
						countTrocarWin += 1;
					} else {
						System.out.println("Voc� perdeu!");

					}

				}

				else if (portaEscolhida.equals("n") && portaPessoa == portaCarro) {
					System.out.println("Voc� ganhou!");
					countManterWin += 1;
				} else {
					System.out.println("Voc� perdeu!");

				}

				contador += 1;

			}

			else if (portaCarro == 2 && portaPessoa == 3) {
				System.out.println("O Anfitriao abriu a porta 1! Deseja abrir a porta 2 ? [y/n]");
				portaEscolhida = scan.next();

				if (portaEscolhida.equals("y")) {
					portaPessoa = 2;

					if (portaPessoa == portaCarro) {
						System.out.println("Voc� ganhou!");
						countTrocarWin += 1;
					} else {
						System.out.println("Voc� perdeu!");

					}

				}

				else if (portaEscolhida.equals("n") && portaPessoa == portaCarro) {
					System.out.println("Voc� ganhou!");
					countManterWin += 1;
				} else {
					System.out.println("Voc� perdeu!");

				}

				contador += 1;

			}

			else if (portaCarro == 3 && portaPessoa == 3) {
				System.out.println("O Anfitriao abriu a porta 2! Deseja abrir a porta 1 ? [y/n]");
				portaEscolhida = scan.next();

				if (portaEscolhida.equals("y")) {
					portaPessoa = 1;

					if (portaPessoa == portaCarro) {
						System.out.println("Voc� ganhou!");
						countTrocarWin += 1;
					} else {
						System.out.println("Voc� perdeu!");

					}

				}

				else if (portaEscolhida.equals("n") && portaPessoa == portaCarro) {
					System.out.println("Voc� ganhou!");
					countManterWin += 1;
				} else {
					System.out.println("Voc� perdeu!");

				}

				contador += 1;

			}

		}

		// Realizada o print no console das quantidades de vitorias
		System.out.println("\n");
		System.out.println("###############################################################");
		System.out.println("Numero de simula��es "+contador+"/100");
		System.out.println("Voc� ganhou: " + countManterWin + " Vezes, Mantendo a porta escolhida!");
		System.out.println("Voc� ganhou: " + countTrocarWin + " Vezes, Trocando a porta escolhida!");
		System.out.println("###############################################################");
	}

}
