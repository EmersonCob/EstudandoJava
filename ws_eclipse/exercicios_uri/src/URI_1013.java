/*
	Faça um programa que leia três valores e apresente o maior dos 
	três valores lidos seguido da mensagem “eh o maior”. Utilize a fórmula:
	
	MaiorAB = (a+b+abs(a-b))/2
	
	Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). 
	Um segundo passo, portanto é necessário para chegar no resultado esperado.
	
	Entrada
	O arquivo de entrada contém três valores inteiros.
	
	Saída
	Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior". 
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
