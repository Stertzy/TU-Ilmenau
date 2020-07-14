import java.util.*;

public class fib {

	private static Scanner sc;

	/**
	 * @author Skopp, Jonathan
	 * @Matrikel 60128
	 */

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.print("n =");
		int n = sc.nextInt();
		System.out.println(fibo(n));
	}

	public static int fibo(int n) {
		// die Variablen e und f enthalten immer zwei aufeinanderfolgende
		// Fibonacci-Zahlen, am Anfang die ersten beiden
		int e = 1;
		int f = 1;
		for (int i = 0; i < n; ++i) {
			int tmp = f;
			f = e + f; // neues f ergibt sich aus der nächsten Fibonacci-Zahl
			e = tmp; // neues e ergibt sich aus dem alten f
		}
		return e; // wenn i = n gilt (siehe for-Schleife), ist e das Ergebnis
	}
}