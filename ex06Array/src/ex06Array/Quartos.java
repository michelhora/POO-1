package ex06Array;

public class Quartos {
	String name;
	String email;
	
	public Quartos(String estudante, String email) {
		this.name = estudante;
		this.email = email;
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String estudante) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return name + ", " + email;
	}

}
