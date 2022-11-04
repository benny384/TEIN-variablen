package variablen;


import java.util.Scanner;


public class Raviolita {

	 public static void main (String[] args) {
		 
		 
	 final double PI = 3.141592;
	 
	 double u, h;
	 
	 u = 40;
	 h = 15;
	
	 
	 double fBoden;
	 double dBoden;
	 double fMantel;
	 double fGesamt;
	 double v;
	 
	 dBoden = u / PI;
	 fBoden = PI * (dBoden/2) + (dBoden/2);
	 fMantel = u * h;
	 fGesamt = 2 * (fBoden + fMantel);
	 v = fBoden * h;
	 
	 System.out.println("Umfang der Dose: " + u);
	 System.out.println("Hoehe der Dose: " + h);
	 System.out.println("Durchmesser der Dose: " + dBoden);
	 System.out.println("Flaeche der Dose: " + fBoden);
	 System.out.println("Mantelflaeche der Dose: " + fMantel);
	 System.out.println("Gesamtflaeche der Dose: " + fGesamt);
	 System.out.println("Volumen der Dose: " + v);
		
		
 // nachfolgend die fehlenden Deklarationen ergaenzen
		
 // nachfolgend die fehlenden Berechnungen ergaenzen
		
 // nachfolgend die fehlenden Ausgaben ergaenzen
	}
}