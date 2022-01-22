import java.util.Scanner;

public class ex18 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        
        int X = sc.nextInt();
        int soma = 0;
        
        for (int i=0; i<=X; i++) {
        	if (soma % 2 == 0) {
        		soma += 1;
        	} else {
        		System.out.println(soma);
        		soma +=1;
        	}
        }

	}

}
