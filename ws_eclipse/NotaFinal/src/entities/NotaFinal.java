package entities;

public class NotaFinal {
	
	public String name;
	public double nPrimeiroTrimestre;
	public double nSegundoTrimestre;
	public double nTerceiroTrimestre;
	
	public String nomeAluno() {
		return name;
	}
	
	public double resultadoFinal() {
		return nPrimeiroTrimestre + nSegundoTrimestre + nTerceiroTrimestre; 
	}
	
	public String toString() {
		double nota = resultadoFinal();
		String resultado_final;
		if (nota < 60.00) {
			resultado_final = "FAILED";
		} else {
			resultado_final = "PASS";
		}
		return resultado_final;
	}
}
