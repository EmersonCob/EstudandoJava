import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Olá mundo!");
		int ano_nasci = 1989;
		int ano_atual = 2022;
		int idade_atual = ano_atual- ano_nasci;
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		System.out.println("A sua idade atual é: " + idade_atual);
		Locale.setDefault(Locale.US);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

	}

}
