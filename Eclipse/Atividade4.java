package progamacao_backend;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o código da peça 1: ");
		int codigo = sc.nextInt();
		
		System.out.println("O número de peças 1: ");
		int numero = sc.nextInt();
		
		System.out.println("E o valor unitário de cada peça 1: ");
		int valor = sc.nextInt();
		
		System.out.println("Informe o código da peça 2: ");
		int codigo2 = sc.nextInt();
		
		System.out.println("O número de peças 2: ");
		int numero2 = sc.nextInt();
		
		System.out.println("E o valor unitário de cada peça 2: ");
		int valor2 = sc.nextInt();
		
		System.out.printf("O valor total a ser pago é de: " + numero*valor + numero2*valor);
	}

}
