package UAS;

public class Koki extends Karyawan{
	private String special_menu;
	private int id_dapur;

	
	public Koki(String nama, int lama_kerja, String special_menu, int id_dapur) {
		super(nama,lama_kerja);
		this.special_menu = special_menu;
		this.id_dapur = id_dapur;
	}
	
	public Koki(String nama, int lama_kerja,String jabatan, String special_menu, int id_dapur) {
		super(nama,lama_kerja,jabatan);
		this.special_menu = special_menu;
		this.id_dapur = id_dapur;
	}
	
	public String getSpecialMenu() {
		return this.special_menu;
	}
	
	public int getIdDapur() {
		return this.id_dapur;
	}
}
