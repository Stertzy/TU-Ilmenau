import java.io.*;

public class Zeitformatierung {

	
	public static void main(String[] args) throws Exception {
		int min = (60);
		int std = (60*min);
		int tag = (24*std);
		int jah = (365*tag);
		
		System.out.println("Sekunden: ");
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int sek = Integer.parseInt(sc.readLine());
		
		System.out.print("Jahre: ");
		System.out.println(sek/(tag)/365);
		System.out.print("Tage: ");
		System.out.println((sek%jah)/(tag));
		System.out.print("Stunden: ");
		System.out.println((sek%tag)/(std));
		System.out.print("Minuten: ");
		System.out.println((sek%std)/(min));
		System.out.print("Sekunden: ");
		System.out.println((sek%min));

	}

}
