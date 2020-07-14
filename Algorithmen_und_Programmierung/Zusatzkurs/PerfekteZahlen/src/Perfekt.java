
public class Perfekt {

	public static void main(String[] args) {

		int zahl = 1;
		int summe = 0; // T(x)
		while (true) {

			for (int teiler = 1; teiler <= zahl - 1; teiler++) {
				if (zahl % teiler == 0) {
					summe += teiler;
				}
				if (summe > zahl) {
					break;
				}
			}

			if (summe == zahl) {
				System.out.println(zahl + ", ");
			}
			summe *= 0;
			zahl += 1;
		}
	}
}
