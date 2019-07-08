package somaDeDoisValores;

import java.util.Scanner;

public class Diferenca {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o primeiro número: ");
		int n1 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Digite o segundo número: ");
		int n2 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Digite o terceiro número: ");
		int n3 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Digite o quarto número: ");
		int n4 = sc.nextInt();
		sc.nextLine();
		
		double result = (n1 * n2) - (n3 * n4);
		
		System.out.printf("%n%nA diferença entre %d * %d e %d * %d é: %.2f", n1, n2, n3, n4, result);
		
		sc.close();

	}

}
