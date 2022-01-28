/*

Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) 
no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. 
A seguir mostre o valor lido e a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

Saída
Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias, 
conforme o exemplo fornecido.

Exemplo de Entrada:

	576

Exemplo de Saída:

	576
	5 nota(s) de R$ 100,00
	1 nota(s) de R$ 50,00
	1 nota(s) de R$ 20,00
	0 nota(s) de R$ 10,00
	1 nota(s) de R$ 5,00
	0 nota(s) de R$ 2,00
	1 nota(s) de R$ 1,00

*/

import java.util.Scanner;
public class URI_1018 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        
        int notas = sc.nextInt();
        
        int n100, n50, n20, n10, n5, n2, n1, dif100, dif50, dif20, dif10, dif5, dif2, dif1;
        
        dif100 = notas % 100;
        n100 = (notas - dif100) /100;
        dif50 = dif100 % 50;
        n50 = (dif100 - dif50) / 50;
        dif20 = dif50 % 20;
        n20 = (dif50 - dif20) / 20;
        dif10 = dif20 % 10;
        n10 = (dif20 - dif10) / 10;
        dif5 = dif10 % 5;
        n5 = (dif10 - dif5) / 5;
        dif2 = dif5 % 2;
        n2 = (dif5 - dif2) / 2;
        dif1 = dif2 % 1;
        n1 = (dif2 - dif1) / 1;
        
        System.out.println(notas);
        System.out.println(n100 +" nota(s) de R$ 100,00");
        System.out.println(n50 + " nota(s) de R$ 50,00");
        System.out.println(n20 + " nota(s) de R$ 20,00");
        System.out.println(n10 + " nota(s) de R$ 10,00");
        System.out.println(n5 + " nota(s) de R$ 5,00");
        System.out.println(n2 + " nota(s) de R$ 2,00");
        System.out.println(n1 + " nota(s) de R$ 1,00");
        
        sc.close();
	}

}
