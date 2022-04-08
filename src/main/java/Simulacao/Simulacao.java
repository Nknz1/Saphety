package Simulacao;

import java.util.Random;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class Simulacao {

	public static String SimulacaoManager(int numeroSimu) {

		// Instâncias
		Random numRandom = new Random();
		Scanner scan = new Scanner(System.in);

		// Variaaveis
		int portaPessoa, portaCarro, countManterWin = 0, countTrocarWin = 0;
		int contador = 0;
		String portaEscolhida = null;

		// Cria o laço com o numero das simulações
		while (contador != numeroSimu) {

			// Calcula o numero da porta do Carro
			portaCarro = numRandom.nextInt(3) + 1;

			// Pergunta qual porta a pessoa deseja abrir
			System.out
					.println("Por favor, Digite o numero da porta que deseja escolher \nPorta[1] Porta[2] e Porta[3]");
			portaPessoa = scan.nextInt();

			// Faz as validações e de acordo atribui para o numero de vitorias.
			if (portaCarro == 1 && portaPessoa == 1) {
				System.out.println("O Anfitriao abriu a porta 2! Deseja abrir a porta 3 ? [y/n]");
				portaEscolhida = scan.next();

				if (portaEscolhida.equals("y")) {
					portaPessoa = 3;

					if (portaPessoa == portaCarro) {
						System.out.println("Você Ganhou!");
						countTrocarWin += 1;
					} else {
						System.out.println("Você Perdeu!");

					}

				}

				else if (portaEscolhida.equals("n") && portaPessoa == portaCarro) {
					System.out.println("Você Ganhou!");
					countManterWin += 1;
				} else {
					System.out.println("Você Perdeu!");

				}

				contador += 1;

			}

			else if (portaCarro == 2 && portaPessoa == 1) {
				System.out.println("O Anfitriao abriu a porta 3! Deseja abrir a porta 2 ? [y/n]");
				portaEscolhida = scan.next();

				if (portaEscolhida.equals("y")) {
					portaPessoa = 2;

					if (portaPessoa == portaCarro) {
						System.out.println("Você Ganhou!");
						countTrocarWin += 1;
					} else {
						System.out.println("Você Perdeu!");

					}

				}

				else if (portaEscolhida.equals("n") && portaPessoa == portaCarro) {
					System.out.println("Você Ganhou!");
					countManterWin += 1;
				} else {
					System.out.println("Você Perdeu!");

				}

				contador += 1;

			}

			else if (portaCarro == 3 && portaPessoa == 1) {
				System.out.println("O Anfitriao abriu a porta 2! Deseja abrir a porta 3 ? [y/n]");
				portaEscolhida = scan.next();

				if (portaEscolhida.equals("y")) {
					portaPessoa = 3;

					if (portaPessoa == portaCarro) {
						System.out.println("Você Ganhou!");
						countTrocarWin += 1;
					} else {
						System.out.println("Você Perdeu!");

					}

				}

				else if (portaEscolhida.equals("n") && portaPessoa == portaCarro) {
					System.out.println("Você Ganhou!");
					countManterWin += 1;
				} else {
					System.out.println("Você Perdeu!");

				}

				contador += 1;

			}

			else if (portaCarro == 1 && portaPessoa == 2) {
				System.out.println("O Anfitriao abriu a porta 3! Deseja abrir a porta 1 ? [y/n]");
				portaEscolhida = scan.next();

				if (portaEscolhida.equals("y")) {
					portaPessoa = 1;

					if (portaPessoa == portaCarro) {
						System.out.println("Você Ganhou!");
						countTrocarWin += 1;
					} else {
						System.out.println("Você Perdeu!");

					}

				}

				else if (portaEscolhida.equals("n") && portaPessoa == portaCarro) {
					System.out.println("Você Ganhou!");
					countManterWin += 1;
				} else {
					System.out.println("Você Perdeu!");

				}

				contador += 1;

			}

			else if (portaCarro == 2 && portaPessoa == 2) {
				System.out.println("O Anfitriao abriu a porta 3! Deseja abrir a porta 1 ? [y/n]");
				portaEscolhida = scan.next();

				if (portaEscolhida.equals("y")) {
					portaPessoa = 1;

					if (portaPessoa == portaCarro) {
						System.out.println("Você Ganhou!");
						countTrocarWin += 1;
					} else {
						System.out.println("Você Perdeu!");

					}

				}

				else if (portaEscolhida.equals("n") && portaPessoa == portaCarro) {
					System.out.println("Você Ganhou!");
					countManterWin += 1;
				} else {
					System.out.println("Você Perdeu!");

				}

				contador += 1;

			}

			else if (portaCarro == 3 && portaPessoa == 2) {
				System.out.println("O Anfitriao abriu a porta 1! Deseja abrir a porta 3 ? [y/n]");
				portaEscolhida = scan.next();

				if (portaEscolhida.equals("y")) {
					portaPessoa = 3;

					if (portaPessoa == portaCarro) {
						System.out.println("Você Ganhou!");
						countTrocarWin += 1;
					} else {
						System.out.println("Você Perdeu!");

					}

				}

				else if (portaEscolhida.equals("n") && portaPessoa == portaCarro) {
					System.out.println("Você Ganhou!");
					countManterWin += 1;
				} else {
					System.out.println("Você Perdeu!");

				}

				contador += 1;

			}

			else if (portaCarro == 1 && portaPessoa == 3) {
				System.out.println("O Anfitriao abriu a porta 2! Deseja abrir a porta 1 ? [y/n]");
				portaEscolhida = scan.next();

				if (portaEscolhida.equals("y")) {
					portaPessoa = 1;

					if (portaPessoa == portaCarro) {
						System.out.println("Você Ganhou!");
						countTrocarWin += 1;
					} else {
						System.out.println("Você Perdeu!");

					}

				}

				else if (portaEscolhida.equals("n") && portaPessoa == portaCarro) {
					System.out.println("Você Ganhou!");
					countManterWin += 1;
				} else {
					System.out.println("Você Perdeu!");

				}

				contador += 1;

			}

			else if (portaCarro == 2 && portaPessoa == 3) {
				System.out.println("O Anfitriao abriu a porta 1! Deseja abrir a porta 2 ? [y/n]");
				portaEscolhida = scan.next();

				if (portaEscolhida.equals("y")) {
					portaPessoa = 2;

					if (portaPessoa == portaCarro) {
						System.out.println("Você Ganhou!");
						countTrocarWin += 1;
					} else {
						System.out.println("Você Perdeu!");

					}

				}

				else if (portaEscolhida.equals("n") && portaPessoa == portaCarro) {
					System.out.println("Você Ganhou!");
					countManterWin += 1;
				} else {
					System.out.println("Você Perdeu!");

				}

				contador += 1;

			}

			else if (portaCarro == 3 && portaPessoa == 3) {
				System.out.println("O Anfitriao abriu a porta 2! Deseja abrir a porta 1 ? [y/n]");
				portaEscolhida = scan.next();

				if (portaEscolhida.equals("y")) {
					portaPessoa = 1;

					if (portaPessoa == portaCarro) {
						System.out.println("Você Ganhou!");
						countTrocarWin += 1;
					} else {
						System.out.println("Você Perdeu!");

					}

				}

				else if (portaEscolhida.equals("n") && portaPessoa == portaCarro) {
					System.out.println("Você Ganhou!");
					countManterWin += 1;
				} else {
					System.out.println("Você Perdeu!");

				}

				contador += 1;

			}

		}

		// Instancia objeto responsável por manipular JSON
		Gson gson = new Gson();

		JsonObject obj = new JsonObject();
		
		obj.addProperty("numSimulacao", contador);
		obj.addProperty("countManterWin", countManterWin);
		obj.addProperty("countTrocarWin", countTrocarWin);

		// Transformar objeto em JSON
		String jsonReturn = gson.toJson(obj);

		return jsonReturn;
	}

}
