package util;

public class CurrencyConverter {
	public static double IOF = 0.06;
	
	public static double totalPaid(double dolarPrice, double quantity) {
		return (dolarPrice*quantity) * (1 + IOF);
	}
}
