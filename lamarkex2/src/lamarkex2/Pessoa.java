package lamarkex2;

//Por: Michel Hora
//Aluno: Unip�
//Exerc�cio 2. POO

public class Pessoa {
	private String nome;
	private int idade;

	public Pessoa() {

	}

	public class Rica extends Pessoa {
		private double dinheiro;

		public String fazCompras() {
			return "Comprando";
		}
	}

	public class Pobre extends Pessoa {

		public String trabalha() {
			return "Trabalhando";
		}

	}

	public class Miseravel extends Pessoa {
		public String mendiga() {
			return "Mendigando";
		}

	}

}
