
public class ToKelvin {

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
}
