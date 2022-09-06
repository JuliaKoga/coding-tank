import java.util.Scanner;

public class Temperatura {

	public static UnityTemp getUnityTemp(String io) {
		int numero;		
        Scanner input = new Scanner(System.in);
        System.out.println("________________________");
        System.out.println("|         MENU         |");
        System.out.println("|______________________|");
        System.out.println("                        ");
        System.out.println("digite opção de " + io);
        System.out.println("________________________");
        System.out.println("| 1 - Celsius          |");
        System.out.println("| 2 - Fahrenheit       |");
        System.out.println("| 3 - Kelvin           |");
        System.out.println("|______________________|");
        String typeString = input.nextLine();
        
        try{
        numero = Integer.parseInt(typeString);
        
        if(numero == 1) {
        return UnityTemp.CELSIUS;
        } else if(numero == 2) {
        return UnityTemp.FAHRENHEIT;	
        } else if(numero == 3) {
        return UnityTemp.KELVIN;	
        } else {
        return getUnityTemp(io);
        }
        
    
        } catch(Exception e) {
        System.err.println("Número inválido.");
        return getUnityTemp(io);
        }
	}
}
