package Jennie.umn.ac.id;

import java.util.*;

public class main {

	static matkul[] matkuls = new matkul[9]; //bkin static array of object
	public static void seedData() {
		matkuls[0] = new matkul("IF402", "PBO", 3);
		matkuls[1] = new matkul("IF100", "DasProg", 3);
		matkuls[2] = new matkul("IF534", "AI", 3);
		matkuls[3] = new matkul("CE121", "ALin", 3);
		matkuls[4] = new matkul("CE441", "JarKom", 3);
		matkuls[5] = new matkul("CE232", "SisDig", 3);
		matkuls[6] = new matkul("UM162", "Pancasila", 2);
		matkuls[7] = new matkul("UM152", "Agama", 2);
		matkuls[8] = new matkul("UM142", "B.Indo", 2);
	}
	
	public static void mainMenu() {
		System.out.println("-------Daftar Mata Kuliah-------\n");
		System.out.println("1. Lihat Semua Mata Kuliah");
		System.out.println("2. Lihat Mata Kuliah kode IF");
		System.out.println("3. Lihat Mata Kuliah kode CE");
		System.out.println("4. Lihat Mata Kuliah kode UM");
		System.out.print("\n");
	}
	
	public static void showData() {
		System.out.println("Daftar Mata Kuliah\n");
		for(matkul mk : matkuls) {
			System.out.println("-----------------------------");
			System.out.println("Kode\t\t: "+mk.getKode());
			System.out.println("Nama\t\t: "+mk.getNama());
			System.out.println("Jumlah SKS\t: "+mk.getSKS());
			System.out.print("\n");
		}
	}
	
	public static void filterData(String kode) {
		for(matkul mk : matkuls) {
			if(mk.getKode().contains(kode)) {
				System.out.println("-----------------------------");
				System.out.println("Kode\t\t: "+mk.getKode());
				System.out.println("Nama\t\t: "+mk.getNama());
				System.out.println("Jumlah SKS\t: "+mk.getSKS());
				System.out.print("\n");
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		seedData();
		int menu;
		for(;;) {
			mainMenu();
			System.out.print("Pilihan : ");
			menu = in.nextInt();
			switch(menu){
			case 1 :
				showData();
				break;
			case 2 :
				filterData("IF");
				break;
			case 3 :
				filterData("CE");
				break;
			case 4 :
				filterData("UM");
				break;
			default :
				System.out.println("Invalid input!");	
			}
		}
	}
}
