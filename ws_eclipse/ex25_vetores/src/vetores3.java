import java.util.Locale;
import java.util.Scanner;

public class vetores3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double soma, media;
		
		double[] vet = new double[n];
		
		soma = 0.0;
		for(int i=0; i<n; i++) {
			vet[i] = sc.nextDouble();
		}
		
		for(int i=0; i<n; i++) {
			System.out.print(vet[i] + " ");
			soma += vet[i];
		}
		System.out.println();
		media = (double) soma / n;
		System.out.printf("%.2f%n", soma);
		System.out.printf("%.2f%n", media);
		
		sc.close();
	}

}
