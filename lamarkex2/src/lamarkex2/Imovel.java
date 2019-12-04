package lamarkex2;

public class Imovel {
	String endreço;
	double preco;
	
	public class novo extends Imovel {
		double novopreco;

		public novo(double novopreco) {
			this.preco = novopreco + 20.000;
		}
		
	}

	public class velho extends Imovel {}
	double velhopreco;

	public void velho(double velhopreco) {
		this.preco = velhopreco - 20.000;
	}
	
}

