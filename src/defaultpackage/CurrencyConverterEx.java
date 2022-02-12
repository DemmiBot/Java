package defaultpackage;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class CurrencyConverterEx {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o valor do dollar: ");
		double dollar = sc.nextDouble();
		System.out.println("Insira a quantidade que deseja comprar: ");
		double quantity = sc.nextDouble();
		System.out.printf("Preco em reais + IOF: %.2f" , CurrencyConverter.dollarToReal(dollar,quantity));
		sc.close();
	}

}
