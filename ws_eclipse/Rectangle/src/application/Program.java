package application;

import java.util.Locale;
import java.util.Scanner;

import entities.RectangleTeste;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		RectangleTeste rectangle = new RectangleTeste();
		
		System.out.println("Enter Rectangle Widht and Height: ");
		System.out.print("Width: ");
		rectangle.width = sc.nextDouble();
		System.out.print("Height: ");
		rectangle.height = sc.nextDouble();
		System.out.printf("AREA = %.2f%n", rectangle.area());
		System.out.printf("PERIMETER = %.2f%n", rectangle.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", rectangle.diagonal());
		
		
		sc.close();
	}

}
