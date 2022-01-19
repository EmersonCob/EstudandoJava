import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int horaInicio, horaFinal;
		
		horaInicio = sc.nextInt();
		horaFinal = sc.nextInt();
		
		if (horaFinal <= horaInicio) {
			horaFinal += 24; 
		} 
		
		System.out.printf("O JOGO DUROU %d HORA(S)%n", horaFinal - horaInicio);
		
		sc.close();
	}

}
