package Tutorial;

public class MataKuliah {
	
	private String kode;
	private String nama;
	private int sks;
	
	public MataKuliah() {}
	public MataKuliah(String kode, String nama, int sks) {
		this.kode = kode;
		this.nama = nama;
		this.sks = sks;
	}
	
	public void setKode(String kode) {
		this.kode = kode;
	}
	
	public void setNama(String nama) {
		this.nama = nama;
	}
	
	public String getKode() {
		return kode;
	}
	
	public String getNama() {
		return nama;
	}
	
	public int getSKS() {
		return sks;
	}
}
