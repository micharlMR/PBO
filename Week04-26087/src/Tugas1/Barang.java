package Tugas1;

public class Barang {
	private int Id;
	private int stock;
	private int harga;
	private String nama;
	
	public Barang() {}
	public Barang(int Id, int stock, int harga,String nama) {
		this.Id = Id;
		this.stock = stock;
		this.harga = harga;
		this.nama = nama;
	}
	
	public int getId() {
		return Id;
	}
	
	public int getStock() {
		return stock;
	}
	
	public int getHarga() {
		return harga;
	}
	
	public String getNama() {
		return nama;
	}
	
	public void minusStock(int qty){
		stock = stock - qty;
	}
}
