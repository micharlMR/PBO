package umn.ac.id.uts;

public class Ghokemon {
	private String Nama;
	private String Panggilan;
	private int EXP;
	private int Attack;
	
	public Ghokemon() {}
	
	public Ghokemon(String Nama, String Panggilan, int EXP, int Attack) {
		this.Nama = Nama;
		this.Panggilan = Panggilan;
		this.EXP = EXP;
		this.Attack = Attack;
	}
	
	public String getNama() {
		return Nama;
	}
	
	public String getPanggilan() {
		return Panggilan;
	}
	
	
	public int getEXP() {
		return EXP;
	}
	
	public int getAttack() {
		return Attack;
	}
	
	
	public void plusEXP(int plus){
		EXP += plus;
	}
	
}
