package fundamentos.ExerciciosModulo1;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o peso: ");

		double peso = scanner.nextDouble();

		System.out.println("Digite a altura: ");

		double altura = scanner.nextDouble();

		double imc = peso / (altura * altura);

		System.out.printf("O IMC é de: " + imc);

		scanner.close();
	}

}
