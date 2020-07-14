import java.io.*;

public class middle {

	public static void main(String[] args) throws Exception {

		// Var Gedöns
		int[] value = new int[5];
		int summe = 0;
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

		// Eingabe der 5 Werte. Ja ich hab da 5 Werte angenommen
		System.out.println("n = 5");
		for (int i : value) {
			 value[i] = Integer.parseInt(sc.readLine());
		}

		/*
		 * Mittelwert berechnen (eig hätte ich das da oben auch gleich machen können.
		 * Aber was solls)
		 */

		for (int i : value) {
			summe += value[i];
		}

		System.out.print("\n Mittelwert: " + summe / value.length);
	}
}
