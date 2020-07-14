import java.util.*;

public class Maximum {

	public static void main(int[] args) {

		// Array anlegen
		System.out.print("n =");
		Scanner sc = new Scanner(System.in);
		int[] dummy = new int[sc.nextInt()];

		// Array befüllen
		System.out.println("\n Inhalt: ");
		for (int i = 0; i <= dummy.length - 1; i++) {
			dummy[i] = sc.nextInt();
		}

	}

}
