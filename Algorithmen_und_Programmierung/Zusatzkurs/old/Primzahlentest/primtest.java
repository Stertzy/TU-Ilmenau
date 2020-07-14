import java.util.*;

public class primtest {

	// Var
	protected static Scanner sc = new Scanner(System.in);
	protected static int n = 0; // Zahl
	protected static int t = 0; // Teiler

	// Main Methode
	public static void main(String[] args) {

		// Eingabe
		System.out.print("n = ");
		n = sc.nextInt();
		if (n < 2) {
			System.err.print("Es muss gelten n >= 2");
			System.exit(8);
		}

		// Berechnung
		prim(n);

		// Ausgabe
		// Es wird nur der erste Ausgegeben, da auch mit einem Teiler n keine Primzahl
		// mehr ist.
		if (t == 0) {
			System.out.println(n + " ist Primzahl.");
		} else {
			System.out.println(n + " ist keine Primzahl da " + t + " ein Teiler ist.\n" + n + "/" + t + "=" + n / t);
		}

	}

	public static void prim(int n) {
		for (int x = 9; x >= 2; x--) {
			if (n % x == 0 ) {
				t = x;
			}
		}
	}
}
