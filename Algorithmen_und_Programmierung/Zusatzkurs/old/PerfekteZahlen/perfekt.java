public class perfekt {
	public static void main(String[] args) {

		long summe = 0;
		long teiler = 0;

		// Das Programm soll bewusst nicht unendlich laufen. Das wäre irgendwie dumm. :)
		for (long i = 1; i < Long.MAX_VALUE; i++) {
			for (teiler = 2; teiler < i; teiler++) {
				if (i % teiler == 0) {
					summe += (i / teiler);
				}
			}
			if (summe+1 == i && i != 1) {
				System.out.println(" " + i + " ist eine perfekte Zahl!");
			} else {
			//	System.out.println(" " + i + " ist keine perfekte Zahl! " + summe);
			}
			summe = 0;
			teiler = 0;
		}
	}
}