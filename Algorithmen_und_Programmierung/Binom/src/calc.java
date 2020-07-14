import java.util.Scanner;

public class calc {

	/**
	 * @author Skopp, Jonathan
	 * @Matrikel 60128
	 */

	public static void main(String[] args) {

		System.out.print("n = ");
		int n = extracted().nextInt();
		System.out.print("k = ");
		int k = extracted().nextInt();

		// Ausgabe
		System.out.println(bin(n, k));

	}

	// Eingabe mit Scanner
	private static Scanner extracted() {
		return new Scanner(System.in);
	}

	// Funktion zur berechnung
	public static double bin(int n, int k) {
		if (n < k) {
			return (0);
		} else if (k == 0 || n == k) {
			return (1);
		}
		return ((bin((n - 1), (k - 1)) + bin((n - 1), k)));
	}
}
