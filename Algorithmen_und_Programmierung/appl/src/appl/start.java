package appl;

public class start {

	public static void main(String[] args) {
		int a = 2;
		int b = 3;

		// Ausagbe
		System.out.println(korekt(a, b));
	}

	public static double korekt(int x, int y) {
		if (x == 0) {
			return 1;
		} else if (y < 0) {
			return (1.0) / korekt(x, -y);
		} else if (y > 0) {
			return x * korekt(x, y - 1);
		} else {
			return -1; // extra für Java
		}
	}

}