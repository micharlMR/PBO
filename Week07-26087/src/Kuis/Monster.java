package Kuis;

public class Monster extends card{
	static public int total;
	
	private int atk;
	private int def;
	
	public Monster(String name,String effect,int qty, int buyPrice, int atk, int def) {
		super(name,effect,qty,buyPrice);
		this.atk = atk;
		this.def = def;
		total++;
	}
	
	public int getAtk(){
		return this.atk;
	}
	
	public int getDef() {
		return this.def;
	}
	
	public int getSellPrice() {
		int price = (int)Math.round(this.getBuyPrice() * 1.5);
		return price;
	}
}
