import java.util.Locale;
import java.util.Scanner;

public class ex20 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		double nt1, nt2, nt3, media;

		for (int i=0; i<N; i++) {
			nt1 = sc.nextDouble(); 
			nt2 = sc.nextDouble(); 
			nt3 = sc.nextDouble(); 
			
			media = (nt1 * 2.0 + nt2 * 3.0 + nt3 * 5.0) / 10;
			
			System.out.printf("%.1f%n", media);
		}

	}

}
