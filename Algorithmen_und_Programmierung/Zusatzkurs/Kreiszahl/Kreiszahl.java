
public class Kreiszahl {
	// Mein berechnetes PI
	public static double pi = 4.0;

	// Anzahl der Durchlaeufe
	public static int i = 0;

	// Genauigkeit
	public static double g = 0.0000001;

	public static void main(String[] args) {

		System.out.println("Start");
		System.out.println("Pi: " + calcpi());
		System.out.println("Iteration: " + i);
		System.out.println("Genauigkeit: " + g);
		System.out.println("Stop");
	}

	// Funktion zur Berechnung von pi
	public static double calcpi() {
		double pi_old = 0.0;
		double delta;
		while (true) {
			delta = Math.abs(pi - pi_old);
			if (delta < g) {
				i += 1;
				return pi;
			}

			pi_old = pi;
			i++;
			pi = ((i % 2) == 0) ? pi + 4.0 / (2.0 * i + 1.0) : pi - 4.0 / (2.0 * i + 1.0);

		}
	}

}
