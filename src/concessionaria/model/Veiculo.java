package concessionaria.model;

public abstract class Veiculo {
	
	public int id;
	private String marca;
	private String modelo;
	private String cor;
	private float valor;
	public int ano;
	public int tipo;
	
	public Veiculo(int id, String marca, String modelo, String cor, int ano, float valor, int tipo) {
		super();
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		this.valor = valor;
		this.tipo = tipo;
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	
	public void visualizar() {

		String tipo = "";

		switch (this.tipo) {
		case 1 -> tipo = "Carro";
		case 2 -> tipo = "Moto";
		}

		System.out.println("\n\n***********************************");
		System.out.println("           Dados do Veículo            ");
		System.out.println("***************************************");
		System.out.println(" ID do veículo: " + this.id);
		System.out.println(" Marca do veículo: " + this.marca);
		System.out.println(" Modelo do veículo: " + this.modelo);
		System.out.println(" Cor: " + this.cor);
		System.out.println(" Ano: " + this.ano);
		System.out.println(" Tipo: " + tipo);
		System.out.printf(" Valor do veículo: R$%.2f \n", this.valor);

	}

}
