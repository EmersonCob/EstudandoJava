/*
	Fa�a um programa que leia tr�s valores e apresente o maior dos 
	tr�s valores lidos seguido da mensagem �eh o maior�. Utilize a f�rmula:
	
	MaiorAB = (a+b+abs(a-b))/2
	
	Obs.: a f�rmula apenas calcula o maior entre os dois primeiros (a e b). 
	Um segundo passo, portanto � necess�rio para chegar no resultado esperado.
	
	Entrada
	O arquivo de entrada cont�m tr�s valores inteiros.
	
	Sa�da
	Imprima o maior dos tr�s valores seguido por um espa�o e a mensagem "eh o maior". 
 */
import java.util.Scanner;


public class URI_1013 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, maior, x;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		x = (a+b+Math.abs(a-b))/2;
		maior = (x+c+Math.abs(x-c))/2;
		
		System.out.println(maior + " eh o maior");
		
		sc.close();

	}

}
