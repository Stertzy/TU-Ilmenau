import java.io.*;

public class Zahlenreihen {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// einlesen der Vars
		System.out.print("n = ");
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(sc.readLine());

		// 2n festlegen
		int n2 = 2 * n;
		System.out.print("2n = " + n2);
		System.out.print("\n");

		// Ausgabe
		for (int y = n2; y >= 1; y--) {
			if (y % 2 == 0) {
				System.out.print(y + ", ");
			}
		}

	}
}
