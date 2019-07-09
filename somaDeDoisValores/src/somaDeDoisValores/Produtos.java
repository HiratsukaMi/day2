package somaDeDoisValores;

import java.util.Scanner;

public class Produtos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o produto: ");
		String produto1 = sc.nextLine();
		
		System.out.println("Digite o número de peças em estoque: ");
		double quant1 = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Digite o valor unitário do produto: ");
		double preco1 = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Digite o produto: ");
		String produto2 = sc.nextLine();
		
		System.out.println("Digite o número de peças em estoque: ");
		double quant2 = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Digite o valor unitário do produto: ");
		double preco2 = sc.nextDouble();
		sc.nextLine();
		
		double valorPagar = (preco1 * quant1) + (preco2 * quant2);
		
		System.out.printf("O valor total da compra é: %.2f", valorPagar);
		
		sc.close();

	}

}
