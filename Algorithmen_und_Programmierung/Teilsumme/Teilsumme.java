
public class Teilsumme {
	
	/**
	 * @author Skopp, Jonathan
	 * @Matrikel 60128
	 */
	
	/*
	 * Das ist die Test "Folge". Ich wollte diese erhalten lassen. public static
	 * static int[] a = { 31, -41, 59, 26, -53, 58, 97, -93, -23, 84 };
	 */

	// Für Aufgabe a wird ein Counter eingebaut.
	public static int counter, j, k = 0;

	// Main Methode
	public static void main(String[] args) {

		// wandelt das String[] zu einem int[] um
		int[] x = convertArray(args);

		// führt die Eigentliche Funktion aus
		int erg = maxTeilSumme(x, x.length);

		// Ausgabe
		if (erg == Integer.MIN_VALUE) {
			System.out.println("Maximale Teilsumme: undef. (leere Menge)");
		} else {
			System.out.println("Maximale Teilsumme: " + erg);
		}
		System.out.println("Anzahl der Durchgänge: " + counter);
		System.out.println("Anfang:" + j);
		System.out.println("Ende: " + k);
	}

	// berechne die Teilsumme
	public static int maxTeilSumme(int arr[], int n) {

		// max ist negativ das hochgerechnet werden muss.
		int maximum = Integer.MIN_VALUE;
		int erg = 0;

		for (int v = 0; v < n; v++) {
			erg = 0;
			for (int x = v; x < n; x++) {
				counter++;
				erg = erg + arr[x];
				if (erg > maximum) {
					maximum = erg;
					j = v;
					k = x;
				}
			}

		}

		if (maximum == Integer.MIN_VALUE) {
			j = -1;
			k = -1;
		}
		return maximum;
	}

	// wandelt das Array um. Sollte es ein int Array sein, wird es nicht beachtet
	public static int[] convertArray(String[] array) {
		int[] b = new int[array.length];
		for (int i = 0; i < b.length; i++) {
			b[i] = Integer.parseInt(array[i]);
		}
		return b;
	}

	public static int[] convertArray(int[] array) {
		return array;

	}
}
