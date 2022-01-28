/*
 Leia um valor inteiro, que � o tempo de dura��o em segundos de um determinado 
 evento em uma f�brica, e informe-o expresso no formato horas:minutos:segundos.

Entrada
O arquivo de entrada cont�m um valor inteiro N.

Sa�da
Imprima o tempo lido no arquivo de entrada (segundos), convertido para 
horas:minutos:segundos, conforme exemplo fornecido.

Exemplo de Entrada:


	140153

Exemplo de sa�da:

	38:55:53

*/

import java.util.Scanner;

public class URI_1019 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, h, m, s;
		n = sc.nextInt();
		
		h = n / 3600; 
		m = (n - (h * 3600)) / 60; 
		s = n - (m * 60  + h * 3600);
		
		System.out.println(h + ":" + m + ":" + s);
		
		sc.close();
	}

}
