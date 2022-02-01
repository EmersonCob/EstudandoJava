import java.util.Scanner;

public class matriz2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] mat = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("DIAGONAL PRINCIPAL: ");
		
		int cont = 0;
		
		for(int i=0; i<n; i++) {
			System.out.print(mat[i][i] + " ");
			for(int j=0; j<n; j++) {
				if(mat[i][j] < 0) {
					cont += 1;
				}
			}
		}
		System.out.println();
		System.out.println("QUANTIDADE DE NAGATIVOS = " + cont);
		
		sc.close();
	}

}
