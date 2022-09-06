
import java.util.Scanner;

public class Quantidade {

	public static int getQtd() {
		Scanner input = new Scanner(System.in);		
	    System.out.println("Digite a quantidade de números a serem convertidos.");
	    String typeString = input.nextLine();
	    
	    try {
	    return Integer.parseInt(typeString);	
	    } catch(Exception e) {
	    System.err.println("Valor inválido.");
	    return getQtd();
	    }
		
	}
	
}
