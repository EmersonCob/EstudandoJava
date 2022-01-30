/*	
Tempo de um Evento

Pedrinho est� organizando um evento em sua Universidade. O evento dever� ser no m�s de Abril, 
iniciando e terminando dentro do m�s. O problema � que Pedrinho quer calcular o tempo que o evento 
vai durar, uma vez que ele sabe quando inicia e quando termina o evento.

Sabendo que o evento pode durar de poucos segundos a v�rios dias, voc� dever� ajudar Pedrinho a calcular 
a dura��o deste evento.

Entrada

Como entrada, na primeira linha vai haver a descri��o �Dia�, seguido de um espa�o e o dia do m�s no qual 
o evento vai come�ar. Na linha seguinte, ser� informado o momento no qual o evento vai iniciar, 
no formato hh : mm : ss. Na terceira e quarta linha de entrada haver� outra informa��o no mesmo formato 
das duas primeiras linhas, indicando o t�rmino do evento.

Sa�da

Na sa�da, deve ser apresentada a dura��o do evento, no seguinte formato:

W dia(s)
X hora(s)
Y minuto(s)
Z segundo(s)

Obs: Considere que o evento do caso de teste para o problema tem dura��o m�nima de 1 minuto.
 
				 		
Exemplo de Entrada:  #   Exemplo de Sa�da:
					 #
	Dia 5			 #  	3 dia(s)
	08 : 12 : 23     #  	22 hora(s)
	Dia 9			 #  	1 minuto(s)
	06 : 13 : 23     #  	0 segundo(s)

*/
import java.util.Scanner;

public class URI_1061 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int w1, x1, y1, z1, w2, x2, y2, z2, w, x, y, z, inicio, fim, duracao, resto, dia, hora, minuto;
		String s;

		s = sc.next();
		w1 = sc.nextInt(); // dias
		x1 = sc.nextInt(); // horas
		s = sc.next();
		y1 = sc.nextInt(); // minutos
		s = sc.next();
		z1 = sc.nextInt(); // segundos
		s = sc.next();
		w2 = sc.nextInt(); // dias
		x2 = sc.nextInt(); // horas
		s = sc.next();
		y2 = sc.nextInt(); // minuntos
		s = sc.next();
		z2 = sc.nextInt(); // segundos
		
		dia = 24*60*60; // transforma o dia em segundos
		hora = 60*60; // tranforma hora em segundos
		minuto = 60; // minuto em segundos
		
		inicio = w1 * dia + x1 * hora + y1 * minuto + z1; // soma tudo ap�s converter em segundos.
		fim = w2 * dia + x2 * hora + y2 * minuto + z2; // soma tudo ap�s converter em segundos.
		
		duracao = fim - inicio; // obtem o tempo em segundos do evento.
		
		// nas pr�ximas etapas divide os segundos por hora, minuto, segundo usando o mod.
		
		w = duracao / dia;
		resto = duracao % dia;
		
		x = resto / hora;
		resto = resto % hora;
		
		y = resto / minuto;
		resto = resto % minuto;
		
		z = resto;
		
		System.out.println(w + " dia(s)");
		System.out.println(x + " hora(s)");
		System.out.println(y + " minuto(s)");
		System.out.println(z + " segundo(s)");

		
		sc.close();
	}

}
