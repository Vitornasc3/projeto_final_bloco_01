package concessionaria.model;

public class Moto extends Veiculo {

	public int cilindrada;
	
	public Moto(int id, String marca, String modelo, String cor, int ano, float valor, int tipo, int cilindrada) {
		super(id, marca, modelo, cor, ano, valor, tipo);
		
		this.cilindrada = cilindrada;

	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCapacetes(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public void visualizar() {
			super.visualizar();
			System.out.println(" Cilindrada: " + this.getCilindrada() + "CC");
	}

	
}
