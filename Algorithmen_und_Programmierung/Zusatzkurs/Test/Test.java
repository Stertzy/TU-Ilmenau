package level;

public class Test {
	
	private static int add(int x, int y) {
		return x+y;
	}
	
	
	 public static int mult(int a, int b) {
	        if(b == 1) {
	            return a;
	        } else {
	        	return add(mult(a,b-1),b);
	        }
	    }

	
	
	
	 private static int fakultaet(int n) {
	        if (n <= 1) {
	            return 1;
	        } else {
	        	System.out.println(n);
	            return fakultaet(n - 1) * n;
	        }
	    }
	 
	 
	   public static void main(String[] args) {
	        System.out.println(mult(3,4));
	    }
}
