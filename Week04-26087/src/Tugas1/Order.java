package Tugas1;

public class Order {
	//Attribute
	private int id, jumlah;
	
	private Barang barang;
	
	public static int total = 0;
	
	//Method
	public Order() {}
	public Order(int id,Barang barang,int jumlah) {
		this.id = id;
		this.barang = barang;
		this.jumlah = jumlah;
	}
	
	public int getId() {
		return id;
	}
	
	public int getJumlah() {
		return jumlah;
	}
	
	public Barang getBarang() {
		return barang;
	}

}
