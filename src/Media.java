
public class Media {

	public static double getMedia(double num[]) {
		double total = 0;
		double media;
		for(int i=0; i<num.length; i++) {
			total += num[i];
		}
		media = total/num.length;
		return media;
	}
}
