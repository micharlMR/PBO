package Jennie.umn.ac.id;

import java.util.*;

public class mainMenu {
	
	static barang[] barangs = new barang[5];
	public static void insertData() {
		
		barangs[0] = new barang(1,120,2000,"Pulpen Easy Gel 0.5mm");
		barangs[1] = new barang(2,30,5000,"Penggaris 30cm");
		barangs[2] = new barang(3,30,7000,"Tipe-x Roller");
		barangs[3] = new barang(4,50,5000,"Pensil Mekanik");
		barangs[4] = new barang(5,100,6000,"Buku Tulis");
		
	}
	
	public static void menu() {
		
		System.out.println("----------Menu Toko Multiguna----------\n");
		System.out.println("1. Pesan Barang");
		System.out.println("2. Lihat Pesanan\n");
		System.out.print("Pilihan : ");
		
	}
	
	public static void listBarang() {
		
		System.out.println("Daftar Barang Toko Multiguna\n");
		for(barang brg : barangs) {
			System.out.println("ID\t: " +brg.getId());
			System.out.println("Nama\t: " +brg.getNama());
			System.out.println("Stock\t: " +brg.getStock());
			System.out.println("Harga\t: " +brg.getHarga());
			System.out.println("----------------------------------");
		}
		
	}
	
	public static void inputOrder() {
		ArrayList<barang> l_order = new ArrayList<barang>();
	}

	public static void listOrder() {
		
	}
	
	public static void main(String[] args) {
		int choice;
		insertData();
		ArrayList<order> l_order = new ArrayList<order>();
		Scanner scan = new Scanner(System.in);
		
		for(;;) {
			menu();
			choice = scan.nextInt();
			
			switch(choice) {
			case 1 :
				listBarang();
				
				int choiceId, choiceQty, idx, jumlahTemp, i=1, uang;
				Scanner in = new Scanner(System.in);
				
				System.out.println("Ketik 0 untuk batal");
				System.out.print("Pesan Barang(ID) : ");
				choiceId = in.nextInt();
				if(choiceId<1 || choiceId >5) {
					continue;
				}
				idx = choiceId-1;
				System.out.print("Masukkan jumlah : ");
				choiceQty = in.nextInt();
				if(choiceQty>barangs[idx].getStock()) {
					while(choiceQty>barangs[idx].getStock()) {
						System.out.print("Masukkan jumlah : ");
						choiceQty = in.nextInt();
					}
				}
				jumlahTemp = choiceQty*barangs[idx].getHarga();
				System.out.println(choiceQty + " @ " + barangs[idx].getNama() + " dengan total harga " + jumlahTemp);
				System.out.println("Masukan jumlah uang : ");
				uang = in.nextInt();
				if(uang<jumlahTemp) {
					System.out.println("Jumlah uang tidak mencukupi");
					continue;
				}
				else {
					barangs[idx].minusStock(choiceQty);
					l_order.add(new order(i, choiceQty, barangs[idx]));
				}
				i++;
				
				break;
			case 2 :
				System.out.println("Daftar Pesanan Toko Multiguna");
				for (int j = 0; j < l_order.size(); j++) {
					System.out.println("ID\t: " + (j+1));
					System.out.println("Nama\t: " + l_order.get(j).getBarang().getNama());
					System.out.println("Jumlah\t: " + l_order.get(j).getJumlah());
					System.out.println("Total\t: " + l_order.get(j).getTotal());
					System.out.println("---------------------------------------\n");
				}
				break;
			default :
				System.out.println("Invalid Input!");
			}
		}
		
	}

}
