
import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int resultado;
		String str1 = "0";
		String str2 = "0";
		
		if (args.length == 0)
				{
			System.out.println("Digite primeiro número");
			str1 = input.nextLine();
			System.out.println("Digite segundoo número");
			str2 = input.nextLine();
		}
		else if (args.length == 1) {
			System.out.println("Digite mais um número");
			str1 = args[0];
			str2 = input.nextLine();
		}
		else if (args.length == 2) {
			str1 = args[0];
			str2 = args[1];
		}
		else{
			System.out.println("valor inválido");
		}
		
		int numero1 = Integer.parseInt(str1);
		int numero2 = Integer.parseInt(str2);
		resultado = numero1 + numero2;
		System.out.println(resultado);
		
		}
			
	}