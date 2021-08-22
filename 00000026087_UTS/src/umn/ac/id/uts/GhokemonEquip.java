package umn.ac.id.uts;

public class GhokemonEquip extends Ghokemon{
	private String type;
	
	public GhokemonEquip() {}
	public GhokemonEquip(String Nama, String Panggilan, int EXP, int Attack, String type) {
		super(Nama,Panggilan,EXP,Attack);
		this.type = type;
	}
	
	public String getType() {
		return this.type;
	}
}
