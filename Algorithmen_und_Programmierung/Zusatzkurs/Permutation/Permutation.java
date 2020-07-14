
package Snippet;

import java.util.*;

public class Gleichheit {

	public static void main(String[] args) {

		// Länge festlegen
		System.out.print("n = ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		// Vars
		int[] base = new int[n]; // Basis der Zahlen
		int[] permut = new int[n]; // Permutation
		int[] sort_base = new int[n]; // Sortierung der Basis
		int[] sort_permut = new int[n]; // Sortierung der Permutation
		boolean test = true; // ist es eine Permutation ?!

		// Basis einlesen
		System.out.println("\nArray 1 einlesen");
		for (int y = 0; y < n; y++) {
			base[y] = sc.nextInt();
		}

		// Permutation einlesen
		System.out.println("\nArray 2 einlesen");
		for (int y = 0; y < n; y++) {
			permut[y] = sc.nextInt();
		}

		// Override
		for (int y = 0; y < n; y++) {
			sort_permut[y] = permut[y];
			sort_base[y] = base[y];
		}

		// Sortieren
		// base sort
		int i = 1;
		while (i < n) {
			if (i == 0 || sort_base[i - 1] <= sort_base[i]) {
				i++;
			} else {
				int tmp = sort_base[i];
				sort_base[i] = sort_base[i - 1];
				sort_base[--i] = tmp;
			}
		}

		// Permutation sort
		i = 1;
		while (i < n) {
			if (i == 0 || sort_permut[i - 1] <= sort_permut[i]) {
				i++;
			} else {
				int tmp = sort_permut[i];
				sort_permut[i] = sort_permut[i - 1];
				sort_permut[--i] = tmp;
			}
		}

		// Vergleich
		for (int y = 0; y < n; y++) {
			if (sort_base[y] != sort_permut[y] && test) {
				test = false;
			}
		}

		// Ausgabe
		if (test) {
			System.out.println("Es ist eine Permutation");
		} else {
			System.out.println("Es ist keine Permutation");
		}

		// Ganz tolle Ausgabe
		System.out.println("\nB\tP\tBS\tBP");
		for (int y = 0; y < n; y++) {
			System.out.println(base[y] + "\t" + permut[y] + "\t" + sort_base[y] + "\t" + sort_permut[y]);
		}
	}

}
