/*

Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C e se D for maior do que A, 
e a soma de C com D for maior que a soma de A e B e se C e D, ambos, forem positivos e se a 
vari�vel A for par escrever a mensagem "Valores aceitos", sen�o escrever "Valores nao aceitos".

Entrada
Quatro n�meros inteiros A, B, C e D.

Sa�da
Mostre a respectiva mensagem ap�s a valida��o dos valores.

Exemplo de Entrada:
5 6 7 8

2 3 2 6

Exemplo de Sa�da:
Valores nao aceitos

Valores aceitos

*/

import java.util.Scanner;

public class URI_1035 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int somacd, somaab;
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		somacd = c + d;
		somaab = a + b;
		
		if (b > c && d > a && somacd > somaab && c > 0 && d > 0) {
			System.out.println("Valores aceitos");
		} else {
			System.out.println("Valores nao aceitos");
		}
		
		sc.close();
	}

}
