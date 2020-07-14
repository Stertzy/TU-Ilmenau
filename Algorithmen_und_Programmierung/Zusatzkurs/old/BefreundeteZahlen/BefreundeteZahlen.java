
public class Hauptklasse {
// Festlegen der Grenzen
	public static long anfang = 1;
	public static long ende = Long.MAX_VALUE;

	public static void main(String[] args) {
		for (long x = anfang; x <= ende; x++) {
			// System.out.println(x + " - " + t_summe(x) + " - " + t_summe(t_summe(x)));

			if (x == t_summe(t_summe(x)) && x != t_summe(x) && x < t_summe(t_summe(x))) {
				System.out.println(x + " und " + t_summe(x));
			}
		}
	}

	public static long t_summe(long i) {
		long summe = 0;
		long teiler = 0;
		for (teiler = 2; teiler < i; teiler++) {
			if (i % teiler == 0) {
				summe += (i / teiler);
			}

		}
		return summe + 1;
	}

}
