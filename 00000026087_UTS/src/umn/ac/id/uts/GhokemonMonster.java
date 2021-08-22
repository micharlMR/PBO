package umn.ac.id.uts;

public class GhokemonMonster extends Ghokemon {
	private int defense;
	
	public GhokemonMonster() {};
	public GhokemonMonster(String Nama, String Panggilan, int EXP, int Attack,int Defense) {
		super(Nama,Panggilan,EXP,Attack);
		this.defense = Defense;
	}
	
	public int getDef() {
		return this.defense;
	}
}
