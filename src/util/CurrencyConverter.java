package util;

public class CurrencyConverter {
	public static double dollarToReal(double dollar, double quantity) {
		return dollar*quantity + dollar*quantity*0.06;
	}
}
