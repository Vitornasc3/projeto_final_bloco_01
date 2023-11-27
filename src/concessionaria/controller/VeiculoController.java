package concessionaria.controller;

import java.util.ArrayList;
import java.util.Optional;

import concessionaria.model.Veiculo;
import concessionaria.repository.VeiculoRepository;

public class VeiculoController implements VeiculoRepository{
	
	private int id;
	
	private ArrayList<Veiculo> listaVeiculos = new ArrayList<Veiculo>();

	@Override
	public void cadastrarProduto(Veiculo veiculo) {
		listaVeiculos.add(veiculo);
		System.out.println("Veículo adicionado!");
		
	}

	@Override
	public void listarProdutos() {
		
		for(var veiculo : listaVeiculos) {
			veiculo.visualizar();
		}
		
	}

	@Override
	public void pesquisarPorNumero(int id) {
		Optional<Veiculo> veiculo = percorreLista(id);
		
		if(veiculo.isPresent()) {
			veiculo.get().visualizar();
			}
		else
			System.out.println("Veículo não encontrado");
	
	}	
			
	

	@Override
	public void atualizarProduto(Veiculo veiculo) {
		Optional<Veiculo> buscaVeiculo = percorreLista(id);
		
		if(buscaVeiculo.isPresent()) {
			listaVeiculos.set(listaVeiculos.indexOf(buscaVeiculo.get()), veiculo);
			System.out.println("Atualizado com sucesso!");
			
		}else
			System.out.println("Produto não localizado!");
	}

	@Override
	public void removerProduto(int id) {

		Optional<Veiculo> veiculo = percorreLista(id);
		
		if(veiculo.isPresent()) {
			if(listaVeiculos.remove(veiculo.get())){
					System.out.println("Veículo removido");
			}
		}else {
			System.out.println("Produto não encontrado!");
		}
			
	}
	
	public int gerarId() {
		return ++id;
	}
	
	public Optional<Veiculo> percorreLista(int codigo) {

		for (var veiculo : listaVeiculos) {
			if (veiculo.getId() == codigo) {
				return Optional.of(veiculo);

			}
		}

		return Optional.empty();
	}
	
	

}
