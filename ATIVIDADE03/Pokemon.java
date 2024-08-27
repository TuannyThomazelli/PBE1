package prjPokemon;

public class Pokemon {

	//atributo
	String Nome;
	String Elemento;
	String Evolucao;
	int Hp;
	
	//construtores
	public Pokemon() {
		
	}
	 public Pokemon(String parametroNome, String parametroElemento, String parametroEvolucao, int parametroHp)  {
		 this.Nome = parametroNome;
		 this.Elemento = parametroElemento;
		 this.Evolucao = parametroEvolucao;
		 this.Hp = parametroHp;

	 }

//Metodos 
	 public void metodoAtacar() {
		 System.out.println(this.Nome + " Atacou");
	 }
	 public void metodoEvoluir() {
		 System.out.println(this.Nome + " Evoluiu");
	 }
    
	 public void exibirInfo() {
		 System.out.println("Nome: " + this.Nome);
		 System.out.println("Elemento: " + this.Elemento);
		 System.out.println("Evolucao: " + this.Evolucao);
		 System.out.println("Hp: " + this.Hp);

	 }




}


	 
