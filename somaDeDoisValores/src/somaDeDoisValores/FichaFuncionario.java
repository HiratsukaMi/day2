package somaDeDoisValores;

import java.util.Scanner;

public class FichaFuncionario {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o ID de um funcionário: ");
		int id = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Digite o número de horas trabalhadas do funcionário: ");
		double hora = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Digite o valor que o funcionário recebe por hora: ");
		double sHora = sc.nextDouble();
		sc.nextLine();
		
		double sMes = hora * sHora;
		
		System.out.printf("O funcionário de número %d trabalhou %.2f horas e recebeu no fim do mês: %.2f", id, hora, sMes);
		
		sc.close();

	}

}
