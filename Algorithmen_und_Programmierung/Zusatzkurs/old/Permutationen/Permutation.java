
public class Hauptklasse {

	public static void main(String[] string_x, String[] string_y) {

		// Auslesen und konvertieren der Strings
		int[] x = convertArray(string_x);
		int[] y = convertArray(string_y);

		// Arrays werden sortiert
		x = bubblesort(x);
		y = bubblesort(y);

		// Arrays werden auf HASH-Ebene verglichen.
		if (x.equals(y)) {
			// Sind permutationen
			System.out.println("Die Arrays sind Permutationen");
		} else {
			// keine Permutation
			System.out.println("Die Arrays sind keine Permutationen");
		}
	}

	// Bubblesort
	public static int[] bubblesort(int[] zusortieren) {
		// JA GG EZ :)
		int temp;
		for (int i = 1; i < zusortieren.length; i++) {
			for (int j = 0; j < zusortieren.length - i; j++) {
				if (zusortieren[j] > zusortieren[j + 1]) {
					temp = zusortieren[j];
					zusortieren[j] = zusortieren[j + 1];
					zusortieren[j + 1] = temp;
				}

			}
		}
		return zusortieren;
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
