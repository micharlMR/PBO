package Tugas1;

public class Karyawan {
	protected String id;
	protected String nama;
	protected int gaji;
	
	public Karyawan() {}
	public Karyawan(String id, String nama) {
		this.id = id;
		this.nama = nama;
	}
	
	public String getId() {
		return this.id;
	}
	
	public String getNama() {
		return this.nama;
	}
	
	public int getGaji() {
		return 0;
	}
}
