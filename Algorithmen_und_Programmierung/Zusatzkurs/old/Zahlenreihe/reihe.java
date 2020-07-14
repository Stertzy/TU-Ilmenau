
import java.util.*;

public class reihe {

	// Konstanten
	protected static Scanner sc = new Scanner(System.in);

	// Main Funktion
	public static void main(String[] args) {

		// Eingabe der Zahl n
		System.out.print("n = ");
		int n = sc.nextInt();

		// Berechnung der Zahlen
		ArrayList<Integer> erg = calc(n);

		// Ausgabe
		System.out.println("\nAusgabe aller geraden Zahlen kleiner gleich 2n: ");
		for (int x = 0; x <= erg.size() - 1; x++) {
			System.out.print(erg.get(x) + ",");
		}

	}

	public static ArrayList<Integer> calc(int n) {
		ArrayList<Integer> back = new ArrayList<>();
		for (int x = 2 * n; x >= 1; --x) {
			if (x % 2 == 0) {
				back.add(x);
			}
		}
		return back;
	}
}
