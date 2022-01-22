import java.util.Scanner;

public class ex21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();

		for (int i=0; i<N; i++) {

			int a = sc.nextInt();
			int b = sc.nextInt();
			if (b != 0) {
				double resultado = (double) a / b;
				System.out.println(resultado);
			} else {
				System.out.println("divisao impossivel");
			}
			
		}

	}

}
