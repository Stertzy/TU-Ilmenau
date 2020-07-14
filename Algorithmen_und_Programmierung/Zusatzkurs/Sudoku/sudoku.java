
public class sudoku {

	public static void main(String[] args) {
		int[][] sudo = { { 1, 0, 0, 6, 0, 0, 0, 0, 0 }, { 0, 2, 0, 0, 0, 0, 9, 0, 0 }, { 0, 0, 3, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 4, 0, 0, 0, 1, 0 }, { 0, 4, 0, 0, 5, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 6, 0, 9, 0 },
				{ 0, 0, 2, 0, 0, 0, 7, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 8, 0 }, { 3, 0, 0, 5, 0, 0, 0, 0, 9 } };
		for (int i = 0; i < sudo.length; i++) {
			for (int j = 0; j < sudo[i].length; j++) {
				System.out.print(sudo[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("------------------------");
		boolean bool = new solve().solve(sudo);
		if (bool) {
			for (int i = 0; i < sudo.length; i++) {
				for (int j = 0; j < sudo[i].length; j++) {
					System.out.print(sudo[i][j] + " ");
				}
				System.out.println();
			}
		} else {
			System.out.println("Ungueltige Vorgabe");
		}
	}

}
