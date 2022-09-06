import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		initialize();
		
		int quantidade = getQtd();
		double[] temp = new double[quantidade];
		double[] result = new double[quantidade];
        ToFahrenheit toFahrenheitTransform = new ToFahrenheit();
        ToCelsius toCelsiusTransform = new ToCelsius();
        ToKelvin toKelvinTransform = new ToKelvin();
        Temperatura getUnityTemp = new Temperatura();
        
        UnityTemp unityInput = getUnityTemp("entrada");
        UnityTemp unityOutput = getUnityTemp("saída");
     
        
        for (int i=0;i<temp.length;i++) {
        	temp[i] = getDouble(i);
        }
        
        
        if(unityOutput == UnityTemp.FAHRENHEIT) {
        	for (int i=0;i<temp.length;i++) {
        		result[i] = toFahrenheitTransform(unityInput, temp[i]);
        	}
        	
        } else if(unityOutput == UnityTemp.CELSIUS) {
        	for (int i=0;i<temp.length;i++) {
        		result[i] = toCelsiusTransform(unityInput, temp[i]);
        	}
        } else {
        	for (int i=0;i<temp.length;i++) {
        		result[i] = toKelvinTransform(unityInput, temp[i]);
        	}        	        	
        }
        
        double mediaEntrada = getMedia(temp);
    	double mediaSaida = getMedia(result);
    	
    	System.out.println("------------------------------------");
        System.out.println("\nUnidade de entrada: "+ unityInput);
        System.out.print("Valores de entrada: ");
        for (double numeros : temp) {
        	System.out.print(numeros + "  ");
        }
        System.out.println("\nMédia de valores de entrada: "+ mediaEntrada);
        System.out.println("\n\nUnidade de saída: "+ unityOutput);
        System.out.print("Valores de saída: ");
        for (double numeros : result) {
        	System.out.print(numeros + "  ");
        }
        System.out.println("\nMédia de valores de saída: "+ mediaSaida);
        
    }

    
	private static void initialize() {
		System.out.println("__________________________________________________");
        System.out.println("| Bem vindo ao nosso conversor de temperaturas!!! |");
        System.out.println("|_________________________________________________| ");
        System.out.println(" ");
    }


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
            System.err.println("Número inválido.");
            return getUnityTemp(io);
            }
            
        
            } catch(Exception e) {
            System.err.println("Número inválido.");
            return getUnityTemp(io);
            }
    	}
    
    public static int getQtd() {
		Scanner input = new Scanner(System.in);	
		int num;
	    System.out.println("Digite a quantidade de números a serem convertidos.");
	    String typeString = input.nextLine();	    
	    try {
	    num = Integer.parseInt(typeString);	
	    if (num > 0) {
	    	return num;	    
	    }else {
	    	System.err.println("Valor inválido");
	    	return getQtd();
	    }
	    } catch(Exception e) {
	    System.err.println("Valor inválido");
	    return getQtd();
	    }
	    
	}
    
    public static double toCelsiusTransform(UnityTemp type, double temp) {
        if (type == UnityTemp.FAHRENHEIT) {
            return (temp - 32) / 1.8;
        } else if(type == UnityTemp.KELVIN) {
            return temp - 273.15;
        } else {
            return temp;
        }
    }
    
    public static double toFahrenheitTransform(UnityTemp type , double temp) {
	    if (type == UnityTemp.CELSIUS) {
	    	return temp * 9.0 / 5 + 32;
	    } else if(type == UnityTemp.KELVIN) {
	    	   return (temp - 273.15) * 9/5 + 32;
	    } else {
	    	   return temp;
	    }
	}
    
    
    public static double toKelvinTransform(UnityTemp type, double temp) {
    	switch (type) {
    	case CELSIUS:
    		return temp + 273.15;
    	case FAHRENHEIT:
    		return (temp - 32)* 5/9 + 273.15;
    	default:
    		return temp;
    	}
    }
    
    public static double getMedia(double[] num) {
		double total=0;
		double media;
		for(int i=0; i<num.length; i++) {
			total += num[i];			
		}
		media = total/num.length;
		return media;
	}
    
 }
		
	
	
	

