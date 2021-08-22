package UAS;

public class Karyawan {
	
	private int id;
	private String nama;
	private int lama_kerja;
	private String jabatan;
	
	public Karyawan(String nama, int lama_kerja) {
		this.nama  = nama;
		this.lama_kerja = lama_kerja;
		this.jabatan = "Staff Reguler";
	}
	
	public Karyawan(String nama, int lama_kerja, String jabatan) {
		this.nama = nama;
		this.lama_kerja = lama_kerja;
		this.jabatan = jabatan;
	}
	
	public int getID() {
		return this.id;
	}
	
	public String getNama() {
		return this.nama;
	}
	
	public String getJabatan() {
		return this.jabatan;
	}
	
	public int getLamaKerja() {
		return this.lama_kerja;
	}
}
