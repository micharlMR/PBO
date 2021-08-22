package Kuis;

public class card {

	protected int idx;
	
	static private int counter = 0;
	
	private String name;
	
	private String effect;
	
	private int qty;
	
	protected int buyPrice;
	
	public card(String name,String effect, int qty, int buyPrice) {
		this.idx = counter++;
		this.name = name;
		this.effect = effect;
		this.qty = qty;
		this.buyPrice = buyPrice;
	}
	
	public int getIdx() {
		return this.idx;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getEffect() {
		return this.effect;
	}
	
	public int getQty() {
		return this.qty;
	}
	
	public int getBuyPrice() {
		return this.buyPrice;
	}
	
	public void minusQty(int qty) {
		this.qty = this.qty - qty;
	}
}
