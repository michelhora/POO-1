package lamarkex2;

public class Ingresso {
	double valor = 15;

	public class IngressoVIP extends Ingresso {

		public double IngressoVIP() {
			return this.valor + 10;
		}

	}

	public class normal extends Ingresso {

		public double ingressoNormal() {
			return this.valor;
		}

	}
	
	public class camaroteInferior extends IngressoVIP {
		String localizacao= "CI23";
		
		public String camaroteInferior() {
			return this.localizacao;
		}
		
		
		public class camaroteSuperior extends IngressoVIP {
			String localização= "CS23";
			
			public double IngressoVIPCS() {
			return	this.IngressoVIP() + 20;
				
			}
		}
		
	}

}
