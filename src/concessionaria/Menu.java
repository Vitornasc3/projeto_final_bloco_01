package concessionaria;

import java.io.IOException;
import java.util.Optional;
import java.util.Scanner;

import concessionaria.controller.VeiculoController;
import concessionaria.model.Carro;
import concessionaria.model.Moto;
import concessionaria.model.Veiculo;

public class Menu {

	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		VeiculoController veiculo = new VeiculoController();
		String marca, modelo = "", cor;
		int opcao = 0, ano, tipo, id, portas, cilindrada = 0;
		float valor;

		
		while (true) {

			System.out.println("-------------------------------------");
			System.out.println("       Concessionária Multicar       ");
			System.out.println("-------------------------------------");
			System.out.println("     1 - Cadastrar veículo           ");
			System.out.println("     2 - Listar veículos             ");
			System.out.println("     3 - Pesquisar veículo por número");
			System.out.println("     4 - Atualizar veículo           ");
			System.out.println("     5 - Remover veículo             ");
			System.out.println("     0 - Sair                        ");
			System.out.println("-------------------------------------");
			System.out.println("  - Insira a opção desejada          ");

			opcao = leia.nextInt();

			switch (opcao) {

			case 1 -> {
				System.out.println("Opção cadastrar selecionada");

				System.out.print("Digite a marca do veículo: ");
				leia.skip("\\R");
				marca = leia.nextLine();

				System.out.print("Digite o modelo do veículo: ");
				modelo = leia.nextLine();

				System.out.print("Digite a cor do veículo: ");
				cor = leia.nextLine();

				System.out.print("Digite o ano do veículo: ");
				ano = leia.nextInt();

				System.out.print("Digite o valor do veículo: ");
				leia.skip("\\R");
				valor = leia.nextFloat();

				System.out.print("Digite o tipo de veículo: 1 Carro | 2 Moto");

				do {
					tipo = leia.nextInt();
				} while (tipo < 1 || tipo > 2);

				leia.nextLine();
				switch (tipo) {

				case 1 -> {

					System.out.print("Digite a quantidade de portas do carro: ");
					portas = leia.nextInt();
					veiculo.cadastrarProduto(
							new Carro(veiculo.gerarId(), marca, modelo, cor, ano, valor, tipo, portas));
				}
				case 2 -> {

					System.out.print("Digite a cilindrada da moto: ");
					cilindrada = leia.nextInt();
					veiculo.cadastrarProduto(
							new Moto(veiculo.gerarId(), marca, modelo, cor, ano, valor, tipo, cilindrada));

				}
				}
				keyPress();

			}

			case 2 -> {
				System.out.println("Opção listar veículos selecionada");

				veiculo.listarProdutos();
				keyPress();
			}

			case 3 -> {
				System.out.println("Opção pesquisar veículo por número selecionada");

				System.out.print("Digite o ID do veículo: ");
				id = leia.nextInt();

				veiculo.pesquisarPorNumero(id);

				keyPress();
			}

			case 4 -> {
				System.out.println("Opção atualizar veículo selecionada");

				System.out.println("Digite o ID do veículo");
				id = leia.nextInt();

				Optional<Veiculo> atualizaVeiculo = veiculo.percorreLista(id);

				if (atualizaVeiculo.isPresent()) {

					System.out.print("Digite a marca do veículo: ");
					leia.skip("\\R");
					marca = leia.nextLine();

					System.out.print("Digite o modelo do veículo: ");
					modelo = leia.nextLine();

					System.out.print("Digite a cor do veículo: ");
					cor = leia.nextLine();

					System.out.print("Digite o ano do veículo: ");
					ano = leia.nextInt();

					System.out.print("Digite o valor do veículo: ");
					leia.skip("\\R");
					valor = leia.nextFloat();

					tipo = atualizaVeiculo.get().getTipo();

					switch (tipo) {

					case 1 -> {
						System.out.print("Digite a quantidade de portas do carro: ");
						portas = leia.nextInt();
						veiculo.atualizarProduto(new Carro(id, marca, modelo, cor, ano, valor, tipo, portas));
					}

					case 2 -> {

						System.out.print("Digite a cilindrada da moto: ");
						portas = leia.nextInt();
						veiculo.atualizarProduto(new Carro(id, marca, modelo, cor, ano, valor, tipo, cilindrada));

					}
					}

				} else {
					System.out.println("Produto não encontrado");
				}

				keyPress();
			}

			case 5 -> {
				System.out.println("Opção remover veículo selecionada");

				System.out.print("Digite o ID do produto que deseja remover: ");
				id = leia.nextInt();

				veiculo.removerProduto(id);

				keyPress();
			}

			case 0 -> {
				{
					System.out.println("  ... Programa encerrado!");
				}

				sobre();

				System.exit(0);
			}

			default -> System.out.println("Opção inválida!");
			}

		}

	}

	public static void sobre() {

		System.out.println("                                                                        ");
		System.out.println("************************************************************************");
		System.out.println(" Projeto concessionária desenvolvido por: Vitor do Nascimento Ferreira  ");
		System.out.println(" Generation Brasil - generation@generation.org                          ");
		System.out.println(" GitHub: https://github.com/Vitornasc3/projeto_final_bloco_01           ");
		System.out.println("************************************************************************");

	}

	public static void keyPress() {

		try {
			System.out.println("\n\n  ***  Pressione a tecla Enter para continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla inválida!");
		}
	}
}
