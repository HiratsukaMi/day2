package somaDeDoisValores;

import java.util.Scanner;

public class FichaFuncionario {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o ID de um funcion�rio: ");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Digite o n�mero de horas trabalhadas do funcion�rio: ");
		double hora = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Digite o valor que o funcion�rio recebe por hora: ");
		double sHora = sc.nextDouble();
		sc.nextLine();
		
		double sMes = hora * sHora;
		
		System.out.printf("O funcion�rio de n�mero %d trabalhou %.2f horas e recebeu no fim do m�s: %.2f", id, hora, sMes);
		
		sc.close();

	}

}
