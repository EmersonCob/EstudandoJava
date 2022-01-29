/*

Leia um valor inteiro correspondente � idade de uma pessoa em dias 
e informe-a em anos, meses e dias

Obs.: apenas para facilitar o c�lculo, considere todo ano com 365 dias 
e todo m�s com 30 dias. Nos casos de teste nunca haver� uma situa��o que 
permite 12 meses e alguns dias, como 360, 363 ou 364. Este � apenas um exerc�cio 
com objetivo de testar racioc�nio matem�tico simples.

Entrada
O arquivo de entrada cont�m um valor inteiro.

Sa�da
Imprima a sa�da conforme exemplo fornecido.

Exemplo de Entrada:

	400

Exemplo de Sa�da:

	1 ano(s)
	1 mes(es)
	5 dia(s)

*/
import java.util.Scanner;

public class URI_1020 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int dia, mes, ano, resto;
		
		resto = n % 365;
		
		ano = (n - resto) / 365;
		
		mes =  resto / 30 ;
		
		resto = resto % 30;
		
		dia = resto;
		
		System.out.println(ano + " ano(s)");
		System.out.println(mes + " mes(es)");
		System.out.println(dia + " dia(s)");
		
		sc.close();
	}

}
