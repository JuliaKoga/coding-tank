import java.util.Scanner;

public class Numeros {

	public static double getDouble(int i) {
		Scanner input = new Scanner(System.in);	
		System.out.printf("digite %d° número.", i+1);
		String typeString = input.nextLine();
		
		try {
		return Double.parseDouble(typeString);	
		} catch(Exception e) {
		System.err.println("Número inválido.");
		return getDouble(i);	
		}
		
	}
	
	
}
