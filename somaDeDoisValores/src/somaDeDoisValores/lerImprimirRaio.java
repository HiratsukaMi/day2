package somaDeDoisValores;

import java.util.Scanner;

public class lerImprimirRaio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o raio do círculo: ");
		double raio = sc.nextDouble();
		sc.nextLine();
		
		double area = 3.14159 * (raio * raio);
		
		System.out.printf("A área da circunferência é: %.4f", area);
		
		sc.close();

	}

}
