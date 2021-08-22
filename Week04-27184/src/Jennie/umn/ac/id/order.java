package Jennie.umn.ac.id;

public class order {

	private int id;
	private int jumlah;
	private barang barang;
	public int total;
	
	public order() {}
	public order(int id, int jumlah, barang barang) {
		this.id = id;
		this.jumlah = jumlah;
		this.barang = barang;
		this.total = jumlah * barang.getHarga();
	}
	
	public void setId() {
		this.id = id;
	}
	
	public void setJumlah() {
		this.jumlah = jumlah;
	}
	
	public void setBarang() {
		this.barang = barang;
	}
	
	public int getId() {
		return id;
	}
	
	public int getJumlah() {
		return jumlah;
	}
	
	public barang getBarang() {
		return barang;
	}
	public int getTotal() {
		return total;
	}
}
