package progamacao_backend;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	
		
		
		System.out.print("Digite um número ");
		int x = sc.nextInt();
		
		System.out.print("Digite outro número  ");
		int y = sc.nextInt();
		
		System.out.println("A soma dos numeros é de : " + (x+y));
	
	}

}