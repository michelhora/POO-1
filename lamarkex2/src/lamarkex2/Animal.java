package lamarkex2;

public class Animal {
	private String nome;
	private String raca;

	public Animal() {

	}

	public Animal(String nome) {
		this.nome = nome;
	}

	public String caminha() {
		return "caminhando";
	}

	public class Cachorro extends Animal {
		public String late;

		public String Cachorro(String late) {
			return "Au au";
		}

	}

	public class Gato extends Animal {
		public String mia;

		public String Gato(String mia) {
			return "miau";
		}

	}

}
