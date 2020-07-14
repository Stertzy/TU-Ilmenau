public class Hauptklasse {

	public static void main(String[] args) {

		// kleiner BugFix
		if (args.length != 0) {
			System.out.println("Das Programm hat keine Parameter.");
			System.exit(0);
		}

		// Das Array wird nun umgewandelt
		int[] dashier = convertArray(args);

		// Berechnung der Summe des Arrays
		int summe = 0;
		for (int x = 0; x <= dashier.length - 1; x++) {
			summe += dashier[x];
		}

		// Berechnung des Mittelwertes
		double mittelwert = summe / dashier.length;

		// Ausgabe des Ganzen Gedöns
		System.out.println("args: ");
		for (int x = 0; x <= args.length - 1; x++) {
			System.out.print(args[x] + ",");
		}
		System.out.println("\nMittelwert: " + mittelwert);

	}

	public static int[] convertArray(String[] array) {
		// wandelt das Array um. Sollte es ein int Array sein, wird es nicht beachtet
		int[] b = new int[array.length];
		for (int i = 0; i < b.length; i++) {
			b[i] = Integer.parseInt(array[i]);
		}
		return b;
	}

	public static int[] convertArray(int[] array) {
		// Trick 17b
		return array;

	}
}
