import java.util.Scanner;

public class ex24 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int quadrado, cubo;
		
		for (int i=1; i<=n; i++) {
			quadrado = (int) Math.pow(i, 2);
			cubo = (int) Math.pow(i, 3);
			System.out.print(i + " ");			
			System.out.print(quadrado + " ");			
			System.out.println(cubo);			
		}
		
	}

}
