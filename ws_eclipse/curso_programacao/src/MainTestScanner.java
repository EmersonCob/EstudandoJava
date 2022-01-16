import java.util.Locale;
import java.util.Scanner;

public class MainTestScanner {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next();
		System.out.println("Você digitou: " + x);
		
		int y;
		y = sc.nextInt();
		System.out.println(x + " digitou: " + y);
		
		double w;
		w = sc.nextDouble();
		System.out.println(x + " quer dividir " + y + " por " + w);
		
		char z;
		z = sc.next().charAt(0); // Para esse exemplo só será armazenado apenas o primeiro 
		System.out.println(z);	// caractere inserido pelo usuário.
		
		// Inserindo varias dados na mesma linha
		int a;
		double b;
		String c;
		// Neste exemplo a entrada de dados pode ser feita em apenas uma linha 
		// separando os valores por um espaço cada.
		a = sc.nextInt();
		b = sc.nextDouble();
		c = sc.next();
		System.out.println("Dados digitados:");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
		sc.close();
	}

}
