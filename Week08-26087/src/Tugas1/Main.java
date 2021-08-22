package Tugas1;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Main {
	
	
	
	static int jumlahManager = 0, jumlahTetap = 0, jumlahMagang = 0;
	
	static Manager[] managers = new Manager[20];
	
	static Tetap[] tetaps = new Tetap[20];
	
	static Magang[] magangs = new Magang[100];
	
	public static void menuUtama() {
		System.out.println("-----Program Data Karyawan------");
		System.out.println("1. Lihat Karyawan");
		System.out.println("2. Tambah Karyawan");
		System.out.println("3. Keluar");
	}
	
	public static void menuTambah() {
		System.out.println("-----Tambah Karyawan------");
		System.out.println("1. Manajer");
		System.out.println("2. Karyawan Tetap");
		System.out.println("3. Karyawan Magang");
	}
	
	public static void dataManager() {
		DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
		DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

		formatRp.setCurrencySymbol("Rp. ");
		formatRp.setMonetaryDecimalSeparator(',');
		formatRp.setGroupingSeparator('.');

		kursIndonesia.setDecimalFormatSymbols(formatRp);
		
		System.out.println("-----Daftar Manager------");
		if(jumlahManager != 0) {
			for(int i = 0;i < jumlahManager;i++) {
				System.out.println("ID	: "+managers[i].getId());
				System.out.println("Nama	: "+managers[i].getNama());
				System.out.println("Gaji	: "+kursIndonesia.format(managers[i].getGaji()));
				System.out.println("-----------------------------------------");
			}
		}
		else {
			System.out.println("Tidak ada");
		}
		System.out.println("");
	}
	public static void dataTetap() {
		DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
		DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

		formatRp.setCurrencySymbol("Rp. ");
		formatRp.setMonetaryDecimalSeparator(',');
		formatRp.setGroupingSeparator('.');

		kursIndonesia.setDecimalFormatSymbols(formatRp);
		
		System.out.println("-----Daftar Karyawan Tetap------");
		if(jumlahTetap != 0) {
			for(int i = 0;i < jumlahTetap;i++) {
				System.out.println("ID	: "+tetaps[i].getId());
				System.out.println("Nama	: "+tetaps[i].getNama());
				System.out.println("Gaji	: "+kursIndonesia.format(tetaps[i].getGaji()));
				System.out.println("-----------------------------------------");
			}
		}
		else {
			System.out.println("Tidak ada");
		}
		System.out.println("");
	}
	public static void dataMagang() {
		DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
		DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

		formatRp.setCurrencySymbol("Rp. ");
		formatRp.setMonetaryDecimalSeparator(',');
		formatRp.setGroupingSeparator('.');

		kursIndonesia.setDecimalFormatSymbols(formatRp);
		
		System.out.println("-----Daftar Karyawan Magang------");
		if(jumlahMagang != 0) {
			for(int i = 0;i < jumlahMagang;i++) {
				System.out.println("ID	: "+magangs[i].getId());
				System.out.println("Nama	: "+magangs[i].getNama());
				System.out.println("Gaji	: "+kursIndonesia.format(magangs[i].getGaji()));
				System.out.println("-----------------------------------------");
			}
		}
		else {
			System.out.println("Tidak ada");
		}
		System.out.println("");
	}

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pilih;
		Scanner in = new Scanner(System.in);
		
		for(;;) {
			menuUtama();
			System.out.print("Pilih : ");
			pilih = in.nextInt();
			in.nextLine();
			if(pilih == 3) {
				break;
			}
			else if(pilih == 2) {
				String nama;
				menuTambah();
				System.out.print("Pilih : ");
				pilih = in.nextInt();
				in.nextLine();
				System.out.print("Nama : ");
				nama = in.nextLine();
				if(pilih == 1) {
					managers[jumlahManager] = new Manager("M"+(jumlahManager+1),nama);
					jumlahManager++;
				}
				else if(pilih == 2) {
					tetaps[jumlahTetap] = new Tetap("R"+(jumlahTetap+1),nama);
					jumlahTetap++;
				}
				else if(pilih == 3) {
					magangs[jumlahMagang] = new Magang("I"+(jumlahMagang+1),nama);
					jumlahMagang++;
				}
			}
			else if(pilih == 1) {
				dataManager();
				dataTetap();
				dataMagang();
			}
		}
		in.close();
	}
}
