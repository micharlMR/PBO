package UAS;

import java.lang.Math;
import java.util.Scanner;

public class Main {
	
	static Karyawan[] karyawan = new Karyawan[7];
	
	public static void seedData() {
		karyawan[0] = new Koki("Michael Roni",4,"Kepala Divisi","Nasi goreng VapoRub",(int)(Math.random() * 2) + 1 );
		karyawan[1] = new Koki("Jack the Drought",3,"Bala-bala Dragonball",(int)(Math.random() * 2) + 1 );
		karyawan[2] = new Koki("Malika",1,"Rendang kecap",(int)(Math.random() * 2) + 1 );
		karyawan[3] = new Koki("Dio",1,"Nasi Goreng Korea",(int)(Math.random() * 2) + 1 );
		karyawan[4] = new Pramusaji("Austyn Eugene",2,"Kepala Divisi",(int)(Math.random() * 2) + 1 ,String.valueOf((Math.random() * 3) + 1));
		karyawan[5] = new Pramusaji("Cing Chen Han Ji",1,(int)(Math.random() * 2) + 1 ,String.valueOf((Math.random() * 3) + 1));
		karyawan[6] = new Pramusaji("Roselia",2,(int)(Math.random() * 2) + 1 ,String.valueOf((Math.random() * 3) + 1));
	}
	
	public static void mainMenu() {
		System.out.println("--------Restoran WFH(Wuhan Feels Home)----------");
		System.out.println("1. Lihat Seluruh Karyawan");
		System.out.println("2. Lihat Dapur Aktif");
		System.out.println("3. Lihat Waktu Aktif");
	}
	
	public static void printKoki() {
		System.out.println("Daftar Koki");
		System.out.println("------------------------------------------------");
		for(int i = 0; i < 4; i++) {
			Koki koki = (Koki)karyawan[i];
			System.out.println("Nama : " + karyawan[i].getNama());
			System.out.println("Lama Kerja : " + karyawan[i].getLamaKerja());
			System.out.println("Jabatan : " + karyawan[i].getJabatan());
			System.out.println("Special menu : " + koki.getSpecialMenu());
			System.out.println("ID Dapur : "+koki.getIdDapur());	
			System.out.println("");
		}
	}
	
	public static void printPramusaji() {
		System.out.println("Daftar Pramusaji");
		System.out.println("------------------------------------------------");
		for(int i = 4; i < 7; i++) {
			Pramusaji pram = (Pramusaji)karyawan[i];
			System.out.println("Nama : " + karyawan[i].getNama());
			System.out.println("Lama Kerja : " + karyawan[i].getLamaKerja());
			System.out.println("Jabatan : " + karyawan[i].getJabatan());
			System.out.println("Shift : " + pram.getShift());
			System.out.println("PJ : "+pram.getPJ());
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*for(int i = 0 ; i < 10; i++) {
			System.out.print((int)(Math.random() * 2) + 1 + " ");
		}*/
		
		Scanner in = new Scanner(System.in);
		seedData();
		int pil;
		for(;;) {
			mainMenu();
			System.out.print("Pilih : ");
			pil = in.nextInt();
			in.nextLine();
			if(pil == 1) {
				printKoki();
				printPramusaji();
			}
			else if(pil == 2) {
				int total1biasa = 0;
				int total1bos = 0;
				int total2biasa = 0;
				int total2bos = 0;
				for(int i = 0; i < 4; i++) {
					Koki koki = (Koki)karyawan[i];
					if(koki.getIdDapur() == 1) {
						if(koki.getJabatan().equals("Staff Reguler")) {
							total1biasa++;
						}
						else {
							total1bos++;
						}
					}
					else if(koki.getIdDapur() == 2) {
						if(koki.getJabatan().equals("Staff Reguler")) {
							total2biasa++;
						}
						else {
							total2bos++;
						}
					}
				}
				
				if(total1biasa >= 1 && total1bos >= 1) {
					System.out.print("Dapur Aktif : 1");
				}
				if(total2biasa >= 1 && total2bos >= 1) {
					System.out.print("Dapur Aktif : 2");
				}
			}
			else if(pil == 3){
				int total1Shift = 0;
				int total2Shift = 0;
				
				for(int i = 4; i < 7; i++) {
					Pramusaji pram = (Pramusaji)karyawan[i];
					if(pram.getShift() == 1) {
						total1Shift++;
					}
					else if(pram.getShift() == 2) {
						total2Shift++;
					}
				}
				
				if(total1Shift >= 2) {
					System.out.print("Waktu Aktif : 1");
				}
				if(total2Shift >= 2) {
					System.out.print("Waktu Aktif : 2");
				}
			}
		}
	}

}
