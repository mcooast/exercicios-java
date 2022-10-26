package fundamentos.ExerciciosModulo1;

import java.util.Scanner;

public class QuadradoCubo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o número: ");

		double numero = scanner.nextDouble();

		double quadrado = Math.pow(numero, 2);

		double cubo = Math.pow(numero, 3);

		System.out.printf("Ao quadrado: " + quadrado + "\nAo cubo: " + cubo + ".");

		scanner.close();
	}

}
