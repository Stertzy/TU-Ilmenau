
import java.io.*;

public class isPrime {

	public static void main(String[] args) throws Exception {

		// eingabe der Zahl
		System.out.print("n= ");
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int zahl = Integer.parseInt(sc.readLine());
		boolean test = true;

		// Test und Ausgabe
		System.out.print("\n");

		for (int teiler = 2; teiler <= 10; teiler++) {
			if (zahl % teiler == 0 && zahl != teiler) {
				test = false;
				System.out.println(zahl + "/" + teiler + " = " + (zahl / teiler));
			}

		}

		if (test) {
			System.out.println("\n" + zahl + " ist eine Primzahl");
		} else {
			System.out.println("\n" + zahl + " ist keine Primzahl");
		}
	}

}