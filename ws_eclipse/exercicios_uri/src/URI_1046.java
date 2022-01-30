import java.util.Scanner;

public class URI_1046 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int hs; 
		if (x < y) {
			hs = y - x;
		} else {
			hs = 24 - x + y;
		}
		System.out.printf("O JOGO DUROU %d HORA(S)%n", hs);
		
		sc.close();
	}

}
