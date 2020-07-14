
public class Zahlen {

	public static void main(final String[] args) {
		int n = 1;
		while (true) {
			int t = 2;
			int s = 1;
			while (t * t < n) {
				if (n % t == 0) {
					s += t;
					s += n / t;
				}
				t++;
			}
			if (t * t == n)
				s += t;
			// s = T(n) = Summe der echten Teiler von n
			if (s > n) {
				t = 2;
				int f = 1;
				while (t * t < s) {
					if (s % t == 0) {
						f += t;
						f += s / t;
					}
					t++;
				}
				if (t * t == s)
					f += t;
				// f = T(s) = Summe der echten Teiler von s
				if (f == n)
					System.out.printf("%d, %d%n", n, s);
			}
			n++;
		}
	}
}