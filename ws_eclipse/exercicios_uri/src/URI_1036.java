import java.util.Locale;
import java.util.Scanner;


public class URI_1036 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, r1, r2, x;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		x = Math.pow(b, 2) - 4 * a * c;
		r1 = (- b + Math.sqrt(x)) / (2 * a);
		r2 = (- b - Math.sqrt(x)) / (2 * a);
		
		if (a == 0.0 || x < 0.0) {
			System.out.println("Impossivel calcular");
		} else {
			System.out.printf("R1 = %.5f%n", r1);
			System.out.printf("R2 = %.5f%n", r2);
		}
		
		sc.close();
	}

}
