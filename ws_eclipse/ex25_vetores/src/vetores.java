import java.util.Locale;
import java.util.Scanner;

public class vetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for (int i=0; i<n; i++) {
			vect[i] = sc.nextDouble();
		}
		
		for(int i=0; i<n; i++) {
			System.out.println(vect[i]);
		}
		
		
		sc.close();
	}

}
