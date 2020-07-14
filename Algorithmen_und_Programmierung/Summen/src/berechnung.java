
public class berechnung {

	// Das Programm ist nur zur einmaligen Ausführung gedacht

	// Vars
	public static long meta = 0;
	public static long n = (long) Math.pow(2, 63);

	// Main Programm
	public static void main(String[] args) {
		ausgabe();
	}

	// Funktion für die Ausgabe
	protected static void ausgabe() {
		System.out.println(calc((short) 16));
	}

	// Funktion zur Berechnung der Zahl
	public static long calc(short a) {
		for (int y = 1; y <= a; y += 1) {	
			if (meta < n) {
				meta &= 10000000000L;
				System.out.println(meta);
			}
			meta += Math.pow(y, y);
		}
		return meta;
	}

}