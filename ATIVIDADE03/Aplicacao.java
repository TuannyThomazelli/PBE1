package prjPokemon;

public class Aplicacao {

	public static void main(String[] args) {
	
		Pokemon pikachu = new Pokemon();
		pikachu.Nome = "Pikachu";
		pikachu.Elemento = "Eletrico";
		pikachu.Evolucao= "2º";
		pikachu.Hp = 60;
		
		Pokemon Jigglypuff = new Pokemon();
		Jigglypuff.Nome = "Jigglypuff";
		Jigglypuff.Elemento = "Normal/Fada";
		Jigglypuff.Evolucao= "2º";
		Jigglypuff.Hp = 115;
		
		Pokemon Meowth = new Pokemon();
		Meowth.Nome = "Meowth";
		Meowth.Elemento = "Normal";
		Meowth.Evolucao= "1º";
		Meowth.Hp = 40;
		
		Pokemon Charizard = new Pokemon();
		Charizard.Nome = "Charizard";
		Charizard.Elemento = "Fogo";
		Charizard.Evolucao= "3º";
		Charizard.Hp = 78;
		
		Pokemon Espeon = new Pokemon();
		Espeon.Nome = "Espeon";
		Espeon.Elemento = "Psychic";
		Espeon.Evolucao= "2º";
		Espeon.Hp = 65;
		
		pikachu.exibirInfo();
		pikachu.metodoAtacar();
		pikachu.metodoEvoluir();
		
		Jigglypuff.exibirInfo();
		Jigglypuff.metodoAtacar();
		Jigglypuff.metodoEvoluir();
		
		Meowth.exibirInfo();
		Meowth.metodoAtacar();
		Meowth.metodoEvoluir();
		
		Charizard.exibirInfo();
		Charizard.metodoAtacar();
		Charizard.metodoEvoluir();
		
		Espeon.exibirInfo();
		Espeon.metodoAtacar();
		Espeon.metodoEvoluir();
		

	}

}
