import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        
        int NUMBER;
        double HORAS, VALOR, SALARY;
        
        NUMBER = sc.nextInt();
        HORAS = sc.nextDouble();
        VALOR = sc.nextDouble();
        
        SALARY = HORAS * VALOR;
        
        System.out.println("NUMBER = " + NUMBER);
        System.out.printf("SALARY = U$ %.2f%n", SALARY);
        
        sc.close();

	}

}
