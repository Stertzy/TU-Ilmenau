import java.util.ArrayList;

public class Develop {

	// bitte geben sie an welche Aufgabe sie ausfuehren wollen

	public static String lvl = "a"; // a,b,c,d,e,f

	public static void main(String[] args) {
		switch (lvl) {
		case "a":
			System.out.println("Aufgabe 1a: \n");
			AufgabeA();
			break;
		case "b":
			System.out.println("Aufgabe 1b \n");
			AufgabeB(args);
			break;
		case "c":
			System.out.println("Aufgabe 1c \n");
			AufgabeC(args);
		default:
			break;
		}

	}

	public static void AufgabeA() {
		System.out.println("Hello World!!!");
		System.exit(0);
	}

	public static void AufgabeB(String lvl[]) {
		if (lvl.length == 2) {
			String vorname = lvl[0];
			String nachname = lvl[1];
			System.out.println("Hallo " + nachname + " " + vorname);
		} else {
			System.out.println("Falsche Eingabe");
		}
		System.exit(0);
	}

	public static void AufgabeC(String lvl[]) {
		double z0 = Double.parseDouble(lvl[0]);
		double z1 = Double.parseDouble(lvl[1]);
		if (z0 > z1) {
			System.out.println(z0);
		} else if (z0 < z1) {
			System.out.println(z1);
		} else if (z0 == z1) {
			System.out.println("Beide Zahlen sind gleich gro�");
		}
	}

	public static void AufgabeD(String lvl[]) {
		int[] zahlen = new ArrayList<>();
		for (int x = 0; x <= lvl.length; x++) {
			zahlen.add(Integer.parseInt(lvl[0]));
		}
		java.util.Arrays.sort(zahlen);
		
		int min = zahlen.get(0);
		int max = zahlen.get(zahlen.size()-1);
		int durch = ;
	}
}
