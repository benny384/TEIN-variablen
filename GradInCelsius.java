package variablen;

import java.util.Scanner;


public class GradInCelsius {

	public static void main(String[] args) {
		
		Scanner scannerVariable = new Scanner(System.in);

		double celsius;
		double ergebnis;
		
		System.out.println("Bite geben sie die Temperatur ein");
		celsius=scannerVariable.nextDouble();
		
		ergebnis = 9/5 * celsius + 32;
		
		
		
		System.out.println("Ihr ergebnis ist: " + ergebnis);
		
		System.out.println(celsius + " Grad Celsius sind " + ergebnis + " Grad Fahrenheit");


		
	}

}
