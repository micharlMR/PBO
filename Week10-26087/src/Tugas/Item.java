package Tugas;

public class Item {
	private String nama;
	private String type;
	private int price;
	
	Item(){}
	
	Item(String nama,String type, int price){
		this.nama = nama;
		this.type = type;
		this.price = price;
	}
	
	public String getName() {
		return this.nama;
	}
	
	public String getType() {
		return this.type;
	}
	
	public int getPrice() {
		return this.price;
	}
}
