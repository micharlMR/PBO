package Model;

public class Voucher extends Barang{
	private double pajak;
	static public int total;
	
	public Voucher() {
		
	}
	public Voucher(String id, String nama, double harga, int stok, double pajak) {
		super(id,nama,harga);
		this.stok = stok;
		this.pajak = pajak;
	}
	
	public double getPajak() {
		return this.pajak;
	}
	
	public double getHargaJual() {
		return this.harga + (this.pajak * this.harga);
	}
}
