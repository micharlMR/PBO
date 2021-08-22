package UAS;

import java.util.Random;

public class Pramusaji extends Karyawan{

	private int shift;
	private String PJ;
	
	Random objGenerator = new Random();
	
	public Pramusaji(String nama, int lama_kerja, int shift, String Pj) {
		super(nama,lama_kerja);
		this.shift = shift;
		this.PJ = Pj;
	}
	
	public Pramusaji(String nama, int lama_kerja, String jabatan, int shift, String Pj) {
		super(nama,lama_kerja,jabatan);
		this.shift = shift;
		this.PJ = Pj;
	}
	
	public String getPJ() {
		return this.PJ;
	}
	
	public int getShift() {
		return this.shift;
	}
}
