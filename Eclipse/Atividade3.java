package progamacao_backend;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Qual é o número do funcionário : ");
		int numero = sc.nextInt();
		
		System.out.println("Quantas horas foram trabalhadas: ");
		int hora = sc.nextInt();
		
		System.out.println("Quanto recebe: ");
		int recebe = sc.nextInt();
		
		System.out.printf("Funcionario " + numero + " O seu salario é de :" + hora*recebe + ".00");
		
		
		
		
		
		
	}
	

}
