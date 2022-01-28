/* 
	Escreva um programa que leia tr�s valores com ponto flutuante de dupla precis�o: 
	A, B e C. Em seguida, calcule e mostre:
	
	a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura.
	b) a �rea do c�rculo de raio C. (pi = 3.14159)
	c) a �rea do trap�zio que tem A e B por bases e C por altura.
	d) a �rea do quadrado que tem lado B.
	e) a �rea do ret�ngulo que tem lados A e B.
	Entrada
	O arquivo de entrada cont�m tr�s valores com um d�gito ap�s o ponto decimal.
	
	Sa�da
	O arquivo de sa�da dever� conter 5 linhas de dados. Cada linha corresponde a 
	uma das �reas descritas acima, sempre com mensagem correspondente e um espa�o 
	entre os dois pontos e o valor. O valor calculado deve ser apresentado com 3 
	d�gitos ap�s o ponto decimal.
	
	Exemplo de entrada: 
		3.0 4.0 5.2
	Exemplo de saida:
		TRIANGULO: 7.800
		CIRCULO: 84.949
		TRAPEZIO: 18.200
		QUADRADO: 16.000
		RETANGULO: 12.000
*/


import java.util.Locale;
import java.util.Scanner;

public class URI_1012 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo, PI;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		PI = 3.14159;
		
		triangulo = a * c / 2; // Base * altura / 2
		circulo = PI * c * c; // PI * raio elevado a 2
		trapezio = ((a + b) * c) / 2; // Base menor + base maior * altura / 2
		quadrado = b * b; // lado * lado ou lado elevado a 2
		retangulo = a * b; // lado A * lado B
		
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);
		
		sc.close();
	}

}
