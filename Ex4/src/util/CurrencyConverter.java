package util;

public class CurrencyConverter {
	public static double IOF = 6; 
	public static double dolar;
	public static double reais;
	public static double pagar = dolar*reais;
	
	public static double dollarToReal() {
		return dolar * reais + (dolar*reais/100)*IOF;
		
	}

}
