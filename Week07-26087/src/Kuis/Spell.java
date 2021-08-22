package Kuis;

public class Spell extends card{
	static public int total;

	public Spell (String name,String effect, int qty, int buyPrice) {
		super(name,effect,qty,buyPrice);
		total++;
	}
	
	public int getPrice() {
		int price = (int)Math.round(this.getBuyPrice() * 1.25);
		return price;
	}
}
