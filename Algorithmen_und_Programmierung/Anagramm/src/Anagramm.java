
/**
 * @author Awurin
 */

public class Anagramm {

	/**
	 * @author Awurin
	 */

	// Schutz vor Buchstabendifferenz
	public final static int mult = 64;

	// ignoriren von groß und klein Schreibung.
	public final static int bigsmall = 32;

	// Eingaben werden über die Komandozeile getätigt

	public static void main(String[] args) {
		if (vgl(args[0], args[1])) {
			System.out.println(args[0] + " und " + args[1] + " sind Anagramme.");
		} else {
			System.out.println(args[0] + " und " + args[1] + " sind keine Anagramme.");
			System.out.println(zahl(args[0]) + " " + zahl(args[1]));
		}

	}

	// Ausgelagerte VGL Schaltung
	// Der vgl über die länge dient als Schutz und ist eig nicht notwendig
	public static boolean vgl(String s, String z) {
		return s.length() == z.length() && zahl(s) == zahl(z);
	}

	// Funktion zum Umrechnen der Strings
	public static int zahl(String s) {
		char[] y = s.toCharArray();
		int c = 0;
		for (int x = 0; x <= s.length() - 1; x++) {
			c += cheat((int) y[x]) * mult;
		}
		return c;
	}

	// cheat Funktion für die groß und klein Schreibung
	public static int cheat(int x) {
		return x < 97 ? x + 32 : x;
	}
	
}