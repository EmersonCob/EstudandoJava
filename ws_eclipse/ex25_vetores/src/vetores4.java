import java.util.Locale;
import java.util.Scanner;

public class vetores4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String[] name = new String[n];
		int[] age = new int[n];
		double[] heigth = new double[n];
		
		for(int i=0; i<n; i++) {
			name[i] = sc.next();
			age[i] = sc.nextInt();
			heigth[i] = sc.nextDouble();
		}
		
		double alturaMedia = 0.0;
		int people = 0;
		for(int i=0; i<n; i++) {
			alturaMedia += heigth[i];
			if(age[i] < 16) {
				people += 1;
			}
		}
		
		double media = (double) alturaMedia / n;
		double mediaPeople = (double) (people * 100) / n;
		
		System.out.printf("Altura média: %.2f%n", media);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", mediaPeople);
		
		
		sc.close();
	}

}
