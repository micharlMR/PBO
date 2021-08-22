package Tugas1;

import java.util.Scanner;

public class Main {
	
	static int jumlahVoucher = 0,jumlahHandphone = 0,banyakorder = 0;
	
	static Voucher[] vouchers = new Voucher[20];
	
	static Handphone[] handphones = new Handphone[20];
	
	static Order[] orders = new Order[100];
	
	public static void mainMenu() {
		System.out.println("--------Menu Toko Voucher & HP----------");
		System.out.println("1. Pesan Barang");
		System.out.println("2. Lihat Pesanan");
		System.out.println("3. Barang Baru");
	}
	
	public static void showData() {
		System.out.println("Menu Pesan Barang\n");
		System.out.println("Daftar Barang Toko Multiguna");
		for(int i = 0;i < jumlahVoucher;i++) {
			System.out.println("ID	: "+vouchers[i].getId() + 1);
			System.out.println("Nama	: "+vouchers[i].getNama());
			System.out.println("Stock	: "+vouchers[i].getStok());
			System.out.println("Harga	: "+vouchers[i].getHargaJual());
			System.out.println("-----------------------------------------");
		}
	}
	
	public static void showDataHandphone() {
		System.out.println("Menu Pesan Barang\n");
		System.out.println("Daftar Barang Toko Multiguna");
		for(int i = 0;i < jumlahHandphone;i++) {
			System.out.println("ID	: "+handphones[i].getId() + 1);
			System.out.println("Nama	: "+handphones[i].getNama()+" "+handphones[i].getWarna());
			System.out.println("Stock	: "+handphones[i].getStok());
			System.out.println("Harga	: "+(long)handphones[i].getHarga());
			System.out.println("-----------------------------------------");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int menu, id,stok;
		String nama,warna;
		double harga,pajak;
		char vORh;
		while(true) {
			mainMenu();
			System.out.print("Pilihan :");
			menu = in.nextInt();
			
			if(menu == 3) {
				System.out.print("Voucher / Handphone(V/H) : ");
				vORh = in.next().charAt(0);
				in.nextLine();
				System.out.print("Nama : ");
				nama = in.nextLine();
				System.out.print("Harga : ");
				harga = in.nextDouble();
				System.out.print("Stok : ");
				stok = in.nextInt();
				in.nextLine();
				if(vORh == 'H') {
					System.out.print("Warna : ");
					warna = in.nextLine();
					handphones[jumlahHandphone] = new Handphone(jumlahHandphone,nama,harga,stok,warna);
					jumlahHandphone++;
					System.out.println("Handphone telah berhasil diinput");
				}
				else {
					System.out.print("PPN :");
					pajak = in.nextDouble();
					vouchers[jumlahVoucher] = new Voucher(jumlahVoucher,nama,harga,stok,pajak);
					jumlahVoucher++;
					System.out.println("Voucher telah berhasil diinput");
				}
			}
			else if(menu == 1){
				int jumlah = 0 , menuBarang;
				System.out.println("Daftar Barang Toko Voucher & HP");
				System.out.println("1. Handphone");
				System.out.println("2. Voucher");
				menuBarang = in.nextInt();
				if(menuBarang == 1) {
					while(true) {
						double total = 0;
						showDataHandphone();
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
							if(jumlah < 1 || jumlah > handphones[id].getStok()) {
								continue;
							}
							else {
								break;
							}
						}
						total = jumlah * handphones[id].getHarga();
						System.out.println(jumlah+" @ "+handphones[id].getNama()+" dengan total harga "+total);
						System.out.print("Masukkan jumlah uang : ");
						int uang = in.nextInt();
						if(total <= uang) {
							orders[banyakorder] = new Order("OH"+banyakorder+1,handphones[id],jumlah);
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
				else if(menuBarang == 2){
					while(true) {
						double total = 0;
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
							if(jumlah < 1 || jumlah > vouchers[id].getStok()) {
								continue;
							}
							else {
								break;
							}
						}
						total = jumlah * vouchers[id].getHargaJual();
						System.out.println(jumlah+" @ "+vouchers[id].getNama()+" dengan total harga "+total);
						System.out.print("Masukkan jumlah uang : ");
						int uang = in.nextInt();
						if(total <= uang) {
							orders[banyakorder] = new Order("OV"+banyakorder,vouchers[id],jumlah);
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
			}
			else if(menu == 2){
				System.out.println("Daftar Pesanan Toko Multiguna");
				for(int i = 0 ; i < banyakorder;i++) {
					System.out.println("ID	: "+orders[i].getId());
					if(orders[i].getId().charAt(1)== 'V') {
						System.out.println("Nama	: "+orders[i].getVoucher().getNama());
					}
					else {
						System.out.println("Nama	: "+orders[i].getHandphone().getNama());
					}
					System.out.println("Jumlah	: "+orders[i].getJumlah());
					if(orders[i].getId().charAt(1)== 'V') {
						System.out.println("Total	: "+orders[i].getJumlah()*orders[i].getVoucher().getHarga());
					}
					else {
						System.out.println("Total	: "+orders[i].getJumlah()*orders[i].getHandphone().getHarga());
					}
					System.out.println("-----------------------------------------");
				}
			}
		}
	}

}
