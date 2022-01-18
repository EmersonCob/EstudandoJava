import java.util.Scanner;
import java.util.Locale;

public class ex05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int code1, item1, code2, item2;
        double valorUnit1, valorUnit2, valorTotal;
        
        code1 = sc.nextInt();
        item1 = sc.nextInt();
        valorUnit1 = sc.nextDouble();
        
        code2 = sc.nextInt();
        item2 = sc.nextInt();
        valorUnit2 = sc.nextDouble();
        
        valorTotal = (item1 * valorUnit1) + (item2 * valorUnit2);
        
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal);
        
        sc.close();
        
	}

}
