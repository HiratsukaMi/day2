package somaDeDoisValores;

import java.util.Scanner;

public class lerImprimirRaio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o raio do c�rculo: ");
		double raio = sc.nextDouble();
		sc.nextLine();
		
		double area = 3.14159 * (raio * raio);
		
		System.out.printf("A �rea da circunfer�ncia �: %.4f", area);
		
		sc.close();

	}

}
