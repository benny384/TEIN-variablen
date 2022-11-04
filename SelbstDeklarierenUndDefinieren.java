package variablen;

class SelbstDeklarierenUndDefinieren {
public static void main(String[] args) {
	
	int aepfel;
	int birnen;		
																													// deklariere eine Variable "birnen" vom Typ int
	birnen = 3;																							// weise ihr den Wert drei zu
	aepfel = 5;
			
		                      	
System.out.println("3 erwartet: " + birnen);

System.out.println(birnen + 5);
// addiere fuenf zu dem Wert

	birnen = 8;

System.out.println("8 erwartet: " + birnen);
// deklariere eine Variable "aepfel" und weise ihr den Wert fuenf zu

System.out.println("5 erwartet: " + aepfel);
// subtrahiere zwei von dem Wert

System.out.println(aepfel - 2);
	
	aepfel = 3;

System.out.println("3 erwartet: " + aepfel);

}
}