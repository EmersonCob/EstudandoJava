import java.util.Scanner;

public class URI_1009 {

	public static void main(String[] args) {

		
        Scanner sc = new Scanner(System.in);
        
        String name = sc.next();
        double salary = sc.nextDouble();
        double vendas = sc.nextDouble();
        
        double comissao = (double) salary + (vendas *0.15);
        
        System.out.printf("TOTAL = R$ %.2f%n", comissao);
        sc.close();
		
		
	}

}
