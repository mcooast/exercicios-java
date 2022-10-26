package fundamentos.ExerciciosModulo1;

import java.util.Scanner;

public class Temperatura2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Fahrenheit para Celsius

		System.out.println("Digite a temperatura em Celsius: ");

		double celsius = scanner.nextDouble();

		double conversao = celsius * 1.8 + 32;

		System.out.println("Valor em Fahrenheit: " + conversao);

		// Celsius para Fahrenheit
		System.out.println("Digite a temperatura em Fahrenheit : ");

		double fahrenheit = scanner.nextDouble();

		double conversao2 = (fahrenheit - 32) / 1.8;

		System.out.println("Valor em Celsius: " + conversao2);

		scanner.close();

	}

}
