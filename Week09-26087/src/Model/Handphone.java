package Model;

public class Handphone extends Barang{
	private String warna;
	static public int total;
	
	public Handphone() {
		
	}
	public Handphone(String id, String nama, double harga, int stok, String warna) {
		super(id,nama,harga);
		this.stok = stok;
		this.warna = warna;
	}
	
	public String getWarna() {
		return this.warna;
	}
}
