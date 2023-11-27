package concessionaria.model;

public class Carro extends Veiculo {

	private int portas;
	public Carro(int id, String marca, String modelo, String cor, int ano, float valor, int tipo, int portas) {
		
		super(id, marca, modelo, cor, ano, valor, tipo);
		this.portas = portas;
	}
	public int getPortas() {
		return portas;
	}
	public void setPortas(int portas) {
		this.portas = portas;
	}
	
	@Override
	public void visualizar() {
			super.visualizar();
			System.out.println(" Portas: " + this.getPortas());
	}
	

}
