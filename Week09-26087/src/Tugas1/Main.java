package Tugas1;
import Model.Barang;
import Model.Order;
import Model.Handphone;
import Model.Voucher;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
	
	static int jumlahVoucher = 0,jumlahHandphone = 0,banyakorder = 0;
	
	
	static Voucher[] vouchers = new Voucher[20];
	static Handphone[] handphones = new Handphone[20];
	//
	
	
	//CASTING ARRAY IS BAD FROM INTERNET
	//https://www.neowin.net/forum/topic/1322268-upcasting-and-downcasting-an-array/
	//static Barang[] voucherss = new Voucher[20];
	//static Voucher[] vouchers = (Voucher)voucherss[];
	
	//static Handphone[] handphoness = new Handphone[20];
	//static Barang[] handphones = handphoness;
	
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
			System.out.println("ID	: "+vouchers[i].getId());
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
			System.out.println("ID	: "+handphones[i].getId());
			System.out.println("Nama	: "+handphones[i].getNama()+" "+handphones[i].getWarna());
			System.out.println("Stock	: "+handphones[i].getStok());
			System.out.println("Harga	: "+(long)handphones[i].getHarga());
			System.out.println("-----------------------------------------");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int menu,stok;
		String id;
		String nama,warna;
		double harga,pajak;
		DecimalFormat formatter = new DecimalFormat("00");
		char vORh;
		while(true) {
			mainMenu();
			System.out.print("Pilihan :");
			menu = in.nextInt();
			
			if(menu == 3) {
				System.out.print("Voucher / Handphone(V/H) : ");
				vORh = in.next().charAt(0);
				in.nextLine();
				if(vORh == 'H' || vORh == 'h' || vORh == 'V' || vORh == 'v') {
					System.out.print("Nama : ");
					nama = in.nextLine();
					System.out.print("Harga : ");
					harga = in.nextDouble();
					System.out.print("Stok : ");
					stok = in.nextInt();
					in.nextLine();
					if(vORh == 'H' || vORh == 'h') {
						System.out.print("Warna : ");
						warna = in.nextLine();
						handphones[jumlahHandphone] = new Handphone("H"+formatter.format(jumlahHandphone+1),nama,harga,stok,warna);
						jumlahHandphone++;
						System.out.println("Handphone telah berhasil diinput");
					}
					else if(vORh == 'V' || vORh == 'v'){
						System.out.print("PPN :");
						pajak = in.nextDouble();
						vouchers[jumlahVoucher] = new Voucher("V"+formatter.format(jumlahVoucher+1),nama,harga,stok,pajak);
						jumlahVoucher++;
						System.out.println("Voucher telah berhasil diinput");
					}
				}
				else {
					System.out.println("Input Wrong");
				}
			}
			else if(menu == 1){
				int jumlah = 0 , menuBarang;
				System.out.println("Daftar Barang Toko Voucher & HP");
				System.out.println("1. Handphone");
				System.out.println("2. Voucher");
				menuBarang = in.nextInt();
				in.nextLine();
				if(menuBarang == 1) {
					while(true) {
						double total = 0;
						showDataHandphone();
						System.out.println("Ketik 0 untuk batal");
						System.out.print("Pesan Barang(ID) :");
						id = in.nextLine();
						if(id.equals("0")) {
							break;
						}
						int idbaru = id.charAt(2) - '0';
						idbaru--;
						if(idbaru < 0) {
							break;
						}
						while(true) {
							System.out.print("Masukkan Jumlah :");
							 jumlah = in.nextInt();
							if(jumlah < 1 || jumlah > handphones[idbaru].getStok()) {
								continue;
							}
							else {
								break;
							}
						}
						total = jumlah * handphones[idbaru].getHarga();
						System.out.println(jumlah+" @ "+handphones[idbaru].getNama()+" dengan total harga "+total);
						System.out.print("Masukkan jumlah uang : ");
						int uang = in.nextInt();
						if(total <= uang) {
							orders[banyakorder] = new Order("O"+handphones[idbaru].getId()+"-"+(banyakorder+1),handphones[idbaru],jumlah);
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
						id = in.nextLine();
						int idbaru = id.charAt(2) - '0';
						idbaru--;
						if(idbaru < 0) {
							break;
						}
						while(true) {
							System.out.print("Masukkan Jumlah :");
							 jumlah = in.nextInt();
							if(jumlah < 1 || jumlah > vouchers[idbaru].getStok()) {
								continue;
							}
							else {
								break;
							}
						}
						total = jumlah * vouchers[idbaru].getHargaJual();
						System.out.println(jumlah+" @ "+vouchers[idbaru].getNama()+" dengan total harga "+total);
						System.out.print("Masukkan jumlah uang : ");
						int uang = in.nextInt();
						if(total <= uang) {
							orders[banyakorder] = new Order("O"+vouchers[idbaru].getId()+"-"+(banyakorder+1),vouchers[idbaru],jumlah);
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
						System.out.println("Nama	: "+orders[i].getHandphone().getNama()+" "+orders[i].getHandphone().getWarna());
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
		//in.close();
	}
	
}
