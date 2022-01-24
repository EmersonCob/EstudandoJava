package applicaton;

import java.util.Locale;
import java.util.Scanner;

import entities.NotaFinal;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		NotaFinal notafinal = new NotaFinal();
		
		System.out.print("Entre com o nome do aluno(a): ");
		notafinal.name = sc.nextLine();
		System.out.print("Entre com a nota do primeiro trimestre: ");
		notafinal.nPrimeiroTrimestre = sc.nextDouble();
		System.out.print("Entre com a nota do segundo trimestre: ");
		notafinal.nSegundoTrimestre = sc.nextDouble();		
		System.out.print("Entre com a nota do terceiro trimestre: ");
		notafinal.nTerceiroTrimestre = sc.nextDouble();
		
		System.out.println();
		System.out.println("RESULTADO FINAL");
		System.out.println("NAME: " + notafinal.nomeAluno());
		System.out.printf("FINAL GRADE: %.2f%n", notafinal.resultadoFinal());
		System.out.println("STATUS: " + notafinal.toString());
		
		

	}

}
