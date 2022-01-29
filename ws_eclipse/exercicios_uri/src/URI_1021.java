import java.util.Locale;
import java.util.Scanner;

public class URI_1021 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n = sc.nextDouble();
		double resto, saldo, moedas;
		int notas, moeda;
		
		System.out.println("NOTAS:");
		
		saldo = n;
		
		resto = saldo % 100.00;
		notas = (int) (saldo - resto) / 100;
		System.out.println(notas + " nota(s) de R$ 100.00");

		notas = (int) resto / 50;
		System.out.println(notas + " nota(s) de R$ 50.00");
		resto = resto % 50.00;
		
		notas = (int) resto / 20;
		System.out.println(notas + " nota(s) de R$ 20.00");
		resto = resto % 20.00;
		
		notas = (int) resto / 10;
		System.out.println(notas + " nota(s) de R$ 10.00");
		resto = resto % 10.00;
		
		notas = (int) resto / 5;
		System.out.println(notas + " nota(s) de R$ 5.00");
		resto = resto % 5.00;
		
		notas = (int) resto / 2;
		System.out.println(notas + " nota(s) de R$ 2.00");
		resto = resto % 2.00;
		
		System.out.println("MOEDAS:");
		
		notas = (int) resto / 1;
		System.out.println(notas + " moeda(s) de R$ 1.00");
		resto = resto % 1.00;
		
		saldo = resto;
		resto = saldo % 0.5;
		moedas = (saldo - resto) / 0.5;
		moeda = (int) moedas;
		System.out.println(moeda + " moeda(s) de R$ 0.50");
		
		moedas = resto / 0.25;
		moeda = (int) moedas;
		System.out.println(moeda + " moeda(s) de R$ 0.25");
		resto = resto % 0.25;
		
		moedas = resto / 0.10;
		moeda = (int) moedas;
		System.out.println(moeda + " moeda(s) de R$ 0.10");
		resto = resto % 0.10;
		
		moedas = resto / 0.05;
		moeda = (int) moedas;
		System.out.println(moeda + " moeda(s) de R$ 0.05");
		resto = resto % 0.05;
		
		moedas = resto;
		moeda = (int) moedas;
		System.out.println(moeda + " moeda(s) de R$ 0.01");
		
		sc.close();
	}

}
