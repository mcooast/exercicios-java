package fundamentos.ExerciciosModulo1;

import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Qual a base?  ");

		double base = scanner.nextDouble();

		System.out.println("Qual a altura?  ");

		double altura = scanner.nextDouble();

		double areaTriangulo = (base * altura) / 2;

		System.out.printf("A área do triangulo é: " + areaTriangulo);

		scanner.close();
	}
}
