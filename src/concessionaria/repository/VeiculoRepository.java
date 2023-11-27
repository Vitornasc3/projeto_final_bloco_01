package concessionaria.repository;

import concessionaria.model.Veiculo;

public interface VeiculoRepository {

	public void cadastrarProduto(Veiculo veiculo);

	public void listarProdutos();

	public void pesquisarPorNumero(int id);

	public void atualizarProduto(Veiculo veiculo);

	public void removerProduto(int id);
	
}
