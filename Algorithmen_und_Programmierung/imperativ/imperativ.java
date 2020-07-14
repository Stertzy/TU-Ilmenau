package impl;

import java.util.*;

public class Hauptklasse {

	protected static Scanner sc = new Scanner(System.in);
	public static int n = 0;
	public static int q = 0;

	public static void main(String[] args) {

		// eingabe von n
		System.out.print("n= ");
		n = sc.nextInt();

		// Algo
		while (n > 0) {
			q = q + n + n - 1;
			n = n - 1;
			ausgabe();
		}
	}

	public static void ausgabe() {
		System.out.println("n = " + n);
		System.out.println("q = " + q + "\n");
	}

}
