package somaDeDoisValores;

import java.util.Scanner;

public class Diferenca {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		int n1 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Digite o segundo n�mero: ");
		int n2 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Digite o terceiro n�mero: ");
		int n3 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Digite o quarto n�mero: ");
		int n4 = sc.nextInt();
		sc.nextLine();
		
		double result = (n1 * n2) - (n3 * n4);
		
		System.out.printf("%n%nA diferen�a entre %d * %d e %d * %d �: %.2f", n1, n2, n3, n4, result);
		
		sc.close();

	}

}
