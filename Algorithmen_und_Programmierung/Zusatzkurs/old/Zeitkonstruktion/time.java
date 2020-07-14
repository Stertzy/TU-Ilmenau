	
	import java.util.*;
	
	public class time {
		// Konstanten (Grundeinheit ist hier Sekunden (ca.))
		protected final static Scanner sc = new Scanner(System.in);
		private final static long sekunden = 1;
		private final static long minuten = sekunden * 60;
		private final static long stunden = minuten * 60;
		private final static long jahr = stunden * 24 * 365; // Schaltjahre werden hier ignoriert
	
		// Main Funktion
		public static void main(String[] args) {
			// Zeitumformen
	
			// Eingabe
			long zeit = sc.nextLong();
	
			// Berechnung
			String ausgabe = calc(zeit);
	
			// Ausgabe
			System.out.println(ausgabe);
		}
	
		// Funktion zum Auflösen der Zeit
		public static String calc(long e) {
			 long e1 =  e / jahr;
			
			String x = ""  + String.valueOf(5);
			
			return new String();
	
		}
		
		
		// Modulo berechnung
	
	}
