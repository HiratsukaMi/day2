package somaDeDoisValores;

import java.util.Scanner;

public class SomaValores {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("-------- Soma de dois valores. --------");
		System.out.println(" ");
		System.out.println("Digite o primeiro valor: ");
		int n1 = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite o segundo valor: ");
		int n2 = sc.nextInt();
		sc.nextLine();
		
		int result = n1 + n2;
		
		System.out.printf("O resultado de %d + %d é igual a %d.", n1, n2, result);
		
		sc.close();

	}

}
