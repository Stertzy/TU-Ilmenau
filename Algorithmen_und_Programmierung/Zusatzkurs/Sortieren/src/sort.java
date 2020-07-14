import java.util.Scanner;

public class sort {

	public static void main(String[] args) throws Exception {
		// Array anlegen

		System.out.print("n = ");
		Scanner sc = new Scanner(System.in);
		int[] dummy = new int[sc.nextInt()];

		// Array befüllen
		for (int i = 0; i <= dummy.length - 1; i++) {
			dummy[i] = sc.nextInt();
		}
		int[] ar = dummy;

		// Ausgabe
		System.out.print("Array := [ ");
		for (int y = 0; y < ar.length; y++) {
			System.out.print(ar[y] + " ");
		}
		System.out.println("]");

		// Array sortieren
		// Gnome sort
		int i = 1;
		int n = ar.length;
		while (i < n) {
			if (i == 0 || ar[i - 1] <= ar[i]) {
				i++;
			} else {
				int tmp = ar[i];
				ar[i] = ar[i - 1];
				ar[--i] = tmp;
			}
		}
		// Array ausgeben
		System.out.println("T = O(n²)");
		System.out.print("sort := [ ");
		for (int y = 0; y < ar.length; y++) {
			System.out.print(ar[y] + " ");
		}
		System.out.println("]");
	}

}
