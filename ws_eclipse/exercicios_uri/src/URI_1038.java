import java.util.Scanner;
public class URI_1038 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double total;
		
		int cod = sc.nextInt();
		int qtd = sc.nextInt();
		
		total = 0;
		switch(cod) {
		case 1:
			total = qtd * 4.00;
			break;
		case 2:
			total = qtd * 4.50;
			break;
		case 3:
			total = qtd * 5.00;
			break;
		case 4:
			total = qtd * 2.00;
			break;
		case 5:
			total = qtd * 1.50;
			break;
		default:
			break;
		}
		
		System.out.printf("Total: R$ %.2f%n", total);
		
		sc.close();
	}

}
