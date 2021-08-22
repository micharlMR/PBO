package Tugas1;

public class Barang {
	protected int id;
	protected double harga;
	protected String nama;
	protected int stok;
	
	public Barang() {
		
	}
	public Barang(int id, String nama, double harga) {
		this.id = id;
		this.nama = nama;
		this.harga = harga;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getNama() {
		return this.nama;
	}
	
	public double getHarga(){
		return this.harga;
	}
	
	public int getStok() {
		return this.stok;
	}

	public void minusStok(int jumlah) {
		this.stok = this.stok - jumlah;
	}
}
