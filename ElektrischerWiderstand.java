package variablen;

import java.util.Scanner;

public class ElektrischerWiderstand {

  

      public static void main(String[] args) {
    	  
    	  Scanner tastatur = new Scanner (System.in);
    	  
        double laenge;
        double durchmesser;
        double spezifischerWiderstand;
          
          
        System.out.println("Bitte geben sie die L�nge ein");
          
        laenge = tastatur.nextDouble();
          
        System.out.println("Bitte geben sie den Durchmesser an");
         
        durchmesser = tastatur.nextDouble();
          
        System.out.println("Bitte geben sie den spezifischen Widerstand an");
          
        spezifischerWiderstand = tastatur.nextDouble();
          
        double flaeche = (durchmesser * durchmesser / 4) * Math.PI;
        double widerstand = spezifischerWiderstand * ( laenge / flaeche); 
         
          
        System.out.println( widerstand + " Ohm");
            
        double stromstaerke = 25;
            
        System.out.println("Spannung von " + ( widerstand * stromstaerke ) + " Volt n�tig, um " + + stromstaerke + " Ampere Strom durchzuleiten"); 
       }
   
    }