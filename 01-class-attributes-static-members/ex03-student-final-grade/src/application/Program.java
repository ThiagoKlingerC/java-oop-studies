package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student aluno = new Student();
		aluno.name = sc.nextLine();
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();
		System.out.println("FINAL GRADE = " + String.format("%.2f", aluno.somaNota()));
		if(aluno.somaNota()>=60) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAILED");
			System.out.println("MISSING " + String.format("%.2f", aluno.pontosFaltando()) + " POINTS");
		}
		sc.close();
	}
}
