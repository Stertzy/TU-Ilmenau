
/**
 * @author Zeyecx
 */

public class Anagramm {



	// Schutz vor Buchstabendifferenz
	public final static int mult = 64;

	// ignoriren von gross und klein Schreibung.
	public final static int bigsmall = 32;

	// Eingaben werden ueber die Komandozeile get�tigt

	public static void main(String[] args) {
		if (vgl(args[0], args[1])) {
			System.out.println(args[0] + " und " + args[1] + " sind Anagramme.");
		} else {
			System.out.println(args[0] + " und " + args[1] + " sind keine Anagramme.");
			System.out.println(zahl(args[0]) + " " + zahl(args[1]));
		}

	}

	// Ausgelagerte VGL Schaltung
	// Der vgl ueber die Laenge dient als Schutz und ist eig nicht notwendig
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

	// cheat Funktion fuer die gross und klein Schreibung
	public static int cheat(int x) {
		return x < 97 ? x + 32 : x;
	}
	
}