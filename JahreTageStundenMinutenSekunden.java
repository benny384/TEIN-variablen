package variablen;

import java.util.Scanner;


public class JahreTageStundenMinutenSekunden {

	public static void main(String[] args) {
		
	  Scanner tastatur = new Scanner (System.in);
	  
	  

		
		int sec;
		int jahre;
		int tage;
		int stunde;
		int minute;
		int sekunde;
		
		
		System.out.println("Bitte geben sie die Sekunden ein.");
		
		sec = (int) tastatur.nextDouble();

		
    
    jahre   = sec/60/60/24/365;
    tage    = sec/60/60/24%365;
    stunde  = sec/60/60%24;
    minute  = sec/60%60;
    sekunde = sec%60;
    
		System.out.println( sec + " Sekunden Entspricht:");
		
		System.out.println( jahre + " Jahren,");
		
		System.out.println( tage + " Tagen,");
		
		System.out.println( stunde + " Stunden,");
		
		System.out.println( minute + " Minuten,");
		
		System.out.println( sekunde + " Sekunden");






    
    


	}

}
