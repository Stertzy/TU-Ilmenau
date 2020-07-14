package sort;

import java.util.*;

public class func {
	public static List<Integer> a = new ArrayList<Integer>();
	public static List<Integer> b = new ArrayList<Integer>();
	public static List<Integer> results = new ArrayList<Integer>();

	public static void main(String[] args) {
		a.add(1);
		a.add(2);
		a.add(4);
		b.add(3);
		b.add(5);
		b.add(6);

		// combine
		sort(a, b);

		// Umwandeln
		int[] arr = new int[results.size()];
		for (int i = 0; i < results.size(); i++) {
			if (results.get(i) != null) {
				arr[i] = results.get(i);
			}
		}

		// Sortieren
		bubbleSort(arr, arr.length);

	}

	public static void sort(List<Integer> x, List<Integer> y) {
		// für die x Werte
		for (int a = 0; a < x.size(); a++) {
			results.add(x.get(a));
		}

		// für die y Werte
		for (int a = 0; a < y.size(); a++) {
			results.add(y.get(a));
		}

	}

	static void bubbleSort(int arr[], int n) {

		// Base case
		if (n == 1)
			return;

		// One pass of bubble sort. After
		// this pass, the largest element
		// is moved (or bubbled) to end.
		for (int i = 0; i < n - 1; i++)
			if (arr[i] > arr[i + 1]) {
				// swap arr[i], arr[i+1]
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}

		// Largest element is fixed,
		// recur for remaining array
		bubbleSort(arr, n - 1);
	}
}
