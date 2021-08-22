package Model;

public class Order {
	private String id;
	private Voucher voucher;
	private Handphone handphone;
	private int jumlah;
	static public int total;
	
	public Order(String id,Voucher voucher,int jumlah) {
		this.id = id;
		this.voucher = voucher;
		this.jumlah = jumlah;
	}
	
	public Order(String id,Handphone handphone, int jumlah) {
		this.id = id;
		this.handphone = handphone;
		this.jumlah = jumlah;
	}
	
	public String getId() {
		return this.id;
	}
	
	public Voucher getVoucher() {
		return this.voucher;
	}
	
	public Handphone getHandphone() {
		return this.handphone;
	}
	
	public int getJumlah() {
		return jumlah;
	}
}
