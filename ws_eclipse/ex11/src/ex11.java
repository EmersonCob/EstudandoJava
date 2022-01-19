import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int item, quant;
		double valor;
		valor = 0;
		
		item = sc.nextInt();
		quant = sc.nextInt();
		
		switch(item){
			case 1:
				valor = quant * 4.00;
				break;
			case 2:
				valor = quant * 4.50;
				break;
			case 3:
				valor = quant * 5.00;
				break;
			case 4:
				valor = quant * 2.00;
				break;
			case 5:
				valor = quant * 1.50;
				break;
		}
		
		System.out.printf("Total: R$ %.2f%n", valor);
		sc.close();
	}

}
