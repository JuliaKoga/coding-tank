
public class ToFahrenheit {
	
	public static double toFahrenheitTransform(UnityTemp type , double temp) {
	       if (type == UnityTemp.CELSIUS) {
	    	return temp * 9.0 / 5 + 32;
	       } else if(type == UnityTemp.KELVIN) {
	    	   return (temp - 273.15) * 9/5 + 32;
	       } else {
	    	   return temp;
	       }
	}       
}
