package secondChallenge;

import java.util.Locale;
import java.util.Scanner;

public class App {
	
    public static void main(String[] args) {
		Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);

	    double ballot[] = {100.0, 50.0, 20.0, 10.0, 5.0, 2.0};
	    double currency[] = {1.0, 0.50, 0.25, 0.10, 0.05, 0.01};
	    int ballotQunatity, currencyQuantity;

	    double value = sc.nextDouble();
	    value = (value * 100) + 0.05;

	    System.out.println("NOTAS:");
	    for (int i = 0; i < ballot.length; i++) {
	    	ballotQunatity = (int) (value / (ballot[i] * 100));
	        value %= ballot[i] * 100;
	        System.out.printf("%d nota(s) de R$ %.2f%n", ballotQunatity, ballot[i]);
	    }

	    System.out.println("MOEDAS:");
	    for (int i = 0; i < currency.length; i++) {
	    	currencyQuantity = (int) (value / (currency[i] * 100));
	        value %= currency[i] * 100;
	      	System.out.printf("%d moeda(s) de R$ %.2f%n", currencyQuantity, currency[i]);
	    }
	
	    sc.close();
    }
}
