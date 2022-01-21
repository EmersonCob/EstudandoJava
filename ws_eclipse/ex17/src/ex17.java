import java.util.Scanner;

public class ex17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int codigo, alcool, gasolina, diesel;
		
		codigo = sc.nextInt();
		alcool = 0;
		gasolina = 0;
		diesel = 0;
		while (codigo != 4) {
			codigo = sc.nextInt();
			if (codigo == 1) {
				alcool += 1;
			} else if (codigo == 2) {
				gasolina += 1;
			} else if (codigo == 3) {
				diesel += 1;
			}
		}
		System.out.println("MUITO OBRIGADO");
		System.out.printf("Alcool: %d%n", alcool);
		System.out.printf("Gasolina: %d%n", gasolina);
		System.out.printf("Diesel: %d%n", diesel);
	}

}
