package concessionaria;

import java.util.Scanner;

import concessionaria.model.Carro;
import concessionaria.model.Moto;
import concessionaria.model.Veiculo;

public class Menu {
	
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String marca, modelo, cor;
		int opcao = 0, ano, tipo, id, portas, cilindrada;
		float valor;
		
		Carro v1 = new Carro(1, "VolksWagen", "Gol", "Preto", 2007, 25000.00f, 1, 2);
		v1.visualizar();
		
		Moto m1 = new Moto(2, "Honda", "CB300", "Vermelha", 2015, 13000f, 2, 200);
		m1.visualizar();
		
		while (true) {

			System.out.println("-------------------------------------");
			System.out.println("           Concessionária            ");
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
			
			switch(opcao) {
			
			case 1 ->{ System.out.println("Opção cadastrar selecionada");}
			
			case 2 ->{ System.out.println("Opção listar veículos selecionada");}
			
			case 3 ->{ System.out.println("Opção pesquisar veículo por número selecionada");}
			
			case 4 ->{ System.out.println("Opção atualizar veículo selecionada");}
			
			case 5 ->{ System.out.println("Opção remover veículo selecionada");}
			
			case 0 -> {{System.out.println("Programa encerrado!");}
			
			System.exit(0);}
			
			default -> System.out.println("Opção inválida!");
			}
		}	
	}
}
