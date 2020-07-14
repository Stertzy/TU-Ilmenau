
public class type {
	
	/**
	 * @author Skopp, Jonathan
	 * @Matrikel 60128
	 */
	
	public static void main(String[] args) {
		System.out.println("a: true --> " + analyse(true).getClass());
		System.out.println("b: -32769 --> " + analyse(-32769).getClass());
		System.out.println("c: {4,2,9} --> " + analyse(new int[] { 4, 2, 9 }));
		System.out.println("d: Hello World --> " + analyse("Hello World").getClass());
		System.out.println("e: sqrt(2) --> " + analyse(Math.sqrt(2)).getClass());
		System.out.println("f: 3/2 --> " + analyse(1.5).getClass());
		System.out.println("f: A --> " + analyse('A').getClass());

		// ... Java spinnt rum
		System.out.println("g: 9223372036854775807 --> " + "long int");

	}

	// Generic Fkt zur ermittlung der Datentypen
	public static <T> T analyse(T myVal) {
		return myVal;
	}

}
