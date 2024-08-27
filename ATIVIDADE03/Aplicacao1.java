package prjZoologico;

public class Aplicacao {

	public static void main(String[] args) {
		ClassesAnimal elefante = new ClassesAnimal();
		elefante.atributoNome = "Dumbo";
		elefante.atributoRaca = "Africano";
		elefante.atributoSexo = "Macho";
		elefante.atributoPeso = 170;
		
		ClassesAnimal girafa = new ClassesAnimal("Melman","Africana","Macho", 160);
		
		SubclasseCarnivora leao = new SubclasseCarnivora ();
		leao.atributoNome = "Nala";
		leao.atributoRaca = "Africana";
		leao.atributoSexo = "Fêmea";
		leao.atributoPeso = 130;
		
		leao.exibirInfo();
		leao.metodoCacar();
		
		
		elefante.exibirInfo();
			
		elefante.metodoExercitar();
		
		elefante.exibirInfo();

		girafa.exibirInfo();
		
		girafa.metodoComer();
		
		girafa.exibirInfo();
		
		
		

	}

}
