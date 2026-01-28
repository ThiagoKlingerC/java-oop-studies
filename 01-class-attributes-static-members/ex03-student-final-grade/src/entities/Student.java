package entities;

public class Student {
	
	public String name;
	public double nota1, nota2, nota3;
	
	public double somaNota() {
		return nota1 + nota2 + nota3;
	}
	
	public double pontosFaltando() {
		if (somaNota()<60) {
			return 60 - somaNota();
		}
		else {
			return 0.0;
		}
	}
}
