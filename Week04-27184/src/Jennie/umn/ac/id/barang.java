package Jennie.umn.ac.id;

public class barang {
	private int id;
	private int stock;
	private int harga;
	private String nama;
	
	public barang() {}
	public barang(int id, int stock, int harga, String nama) {
		this.id = id;
		this.stock = stock;
		this.harga = harga;
		this.nama = nama;
	}
	
	public void setId() {
		this.id = id;
	}
	
	public void setStock() {
		this.stock = stock;
	}
	
	public void setHarga() {
		this.harga = harga;
	}
	
	public void setNama() {
		this.nama = nama;
	}
	
	public int getId() {
		return id;
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
	
	public void minusStock(int qty) {
		this.stock = this.stock - qty;
	}
}
