package Tugas1;

import java.util.Scanner;

public class Main {

	static Barang[] barangs = new Barang[5];
	
	static Order[] orders = new Order[100];
	
	public static void seedData() {
		barangs[0] = new Barang(1,120,2000,"Pulpen Easy Gel 0.5mm");
		barangs[1] = new Barang(2,30,5000,"Penggaris 30cm");
		barangs[2] = new Barang(3,30,7000,"Tipe-x Roller");
		barangs[3] = new Barang(4,50,5000,"Pensil Mekanik");
		barangs[4] = new Barang(5,100,6000,"Buku Tulis");
	}
	
	public static void mainMenu() {
		System.out.println("--------Menu Toko Multiguna----------");
		System.out.println("1. Pesan Barang");
		System.out.println("2. Lihat Pesanan");
	}
	
	public static void showData() {
		System.out.println("Menu Pesan Barang\n");
		System.out.println("Daftar Barang Toko Multiguna");
		for(Barang barang : barangs) {
			System.out.println("ID	: "+barang.getId());
			System.out.println("Nama	: "+barang.getNama());
			System.out.println("Stock	: "+barang.getStock());
			System.out.println("Harga	: "+barang.getHarga());
			System.out.println("-----------------------------------------");
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		seedData();
		int menu;
		int id,jumlah,uang,total;
		int banyakorder = 0;
		
		for(;;) {
			mainMenu();
			System.out.print("Pilihan : ");
			menu = in.nextInt();
			if(menu == 1) {
				while(true) {
					total = 0;
					showData();
					System.out.println("Ketik 0 untuk batal");
					System.out.print("Pesan Barang(ID) :");
					id = in.nextInt();
					id = id-1;
					if(id < 0 || id > 4) {
						break;
					}
					while(true) {
						System.out.print("Masukkan Jumlah :");
						jumlah = in.nextInt();
						if(jumlah < 1 || jumlah > barangs[id].getStock()) {
							continue;
						}
						else {
							break;
						}
					}
					total = jumlah * barangs[id].getHarga();
					System.out.println(jumlah+" @ "+barangs[id].getNama()+" dengan total harga "+total);
					System.out.print("Masukkan jumlah uang : ");
					uang = in.nextInt();
					if(total <= uang) {
						orders[banyakorder] = new Order(banyakorder+1,barangs[id],jumlah);
						System.out.println("Berhasil dipesan");
						banyakorder++;
						break;
					}
					else {
						System.out.println("Jumlah uang tidak mencukupi\n");
						continue;
					}
				}
			}
			else if(menu == 2){
				System.out.println("Daftar Pesanan Toko Multiguna");
				for(int i = 0 ; i < banyakorder;i++) {
					System.out.println("ID	: "+orders[i].getId());
					System.out.println("Nama	: "+orders[i].getBarang().getNama());
					System.out.println("Jumlah	: "+orders[i].getJumlah());
					System.out.println("Total	: "+orders[i].getJumlah()*orders[i].getBarang().getHarga());
					System.out.println("-----------------------------------------");
				}
			}
			//in.close();
		}
	}

}
