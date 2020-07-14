
public class func {

	// Das Programm geht davon aus, das x dem Bereich der nat. Zahlen entspringt
	public static int x = 2; // da ja x>=2 gelten soll.
	public static double a = 0;
	public static double b = 0;
	

	public static void main(String[] args) {
		a = arg(args)[0]; // für f(x)
		b = arg(args)[1]; // für g(x)

		while (true) {
			kill();
			if (f(x, a) < g(x, b)) {
				ausgabe();
				System.exit(0);
			} else {
				x++;
			}
		}
	}

	// f(x)
	public static double f(double x, double y) {
		return (double) Math.pow(x, y);
	}

	// g(x)
	public static double g(double x, double y) {
		return (double) Math.pow(y, x);
	}

	// Prüfen der args
	public static double[] arg(String[] space) {
		try {
			return new double[] { Double.parseDouble(space[0]), Double.parseDouble(space[1]) };
		} catch (Exception e) {
			System.err.println("Fehler: " + e.getMessage());
			System.exit(8);
		}
		return null;
	}

	// Ausgabe
	public static void ausgabe() {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("f(x,a) = " + f(x, a));
		System.out.println("g(x,b) = " + g(x, b));
		System.out.println("x = " + x);
		System.out.println(" ");
	}

	// Schutz
	public static void kill() {
		if (x >= Integer.MAX_VALUE - 1 || a >= Double.MAX_VALUE - 1 || b >= Double.MAX_VALUE - 1
				|| f(x, a) >= Double.MAX_VALUE - 1 || g(x, b) >= Double.MAX_VALUE - 1) {
			System.err.println("Die Bedingung wird nie erfüllt.");
			System.err.println("Aktuelle Berechnung: ");
			ausgabe();
			System.exit(8);
		}
	}

}
