public class Hauptklasse {

	public static void main(String[] args) {

		// kleiner BugFix
		if (args.length == 0) {
			System.out.println("Das Programm hat keine Parameter.");
			System.exit(0);
		}

		// Das Array wird nun umgewandelt
		int[] dashier = convertArray(args);

		// Das Array wird nun sortiert
		dashier = bubblesort(dashier);

		// Ausgabe des Ganzen Gedöns
		System.out.println("args: ");
		for (int x = 0; x <= dashier.length - 1; x++) {
			System.out.print(args[x] + ",");
		}
		System.out.println("\nsort: ");
		for (int x = 0; x <= dashier.length - 1; x++) {
			System.out.print(dashier[x] + ",");
		}
	}

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
