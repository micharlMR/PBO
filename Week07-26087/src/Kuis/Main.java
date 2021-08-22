package Kuis;

import java.util.Scanner;

import java.util.Random;

public class Main {
	
	static int jumlahMonster = 0,jumlahSpell = 0,banyakShop = 0;
	
	static Monster[] monsters = new Monster[20];
	
	static Spell[] spells = new Spell[20];
	
	static Shop[] shops = new Shop[100];
	
	public static void showDataMonster() {
		System.out.println("Menu Pesan Barang\n");
		System.out.println("Daftar Barang Toko Multiguna");
		for(int i = 0;i < jumlahMonster;i++) {
			int temp = monsters[i].getIdx() + 1;
			System.out.println("ID	: "+temp);
			System.out.println("Nama	: "+monsters[i].getName());
			System.out.println("Effect	: "+monsters[i].getEffect());
			System.out.println("Stock	: "+monsters[i].getQty());
			System.out.println("Harga	: "+(long)monsters[i].getBuyPrice());
			System.out.println("Attack	: "+monsters[i].getAtk());
			System.out.println("Defence	: "+monsters[i].getDef());
			System.out.println("-----------------------------------------");
		}
	}
	
	public static void showDataSpell() {
		System.out.println("Menu Pesan Barang\n");
		System.out.println("Daftar Barang Toko Multiguna");
		for(int i = 0;i < jumlahSpell;i++) {
			int temp = spells[i].getIdx() + 1;
			System.out.println("ID	: "+temp);
			System.out.println("Nama	: "+spells[i].getName());
			System.out.println("Nama	: "+spells[i].getEffect());
			System.out.println("Stock	: "+spells[i].getQty());
			System.out.println("Harga	: "+spells[i].getBuyPrice());
			System.out.println("-----------------------------------------");
		}
	}

	public static void mainMenu() {
		System.out.println("--------Menu Toko Judi-Oh----------");
		System.out.println("1. Beli Kartu");
		System.out.println("2. Tambah Kartu");
		System.out.println("3. Lihat Transaksi");
		System.out.println("4. Keluar");
	}
	
	public static void monsterOrSpell() {
		System.out.println("--------Type Of Card----------");
		System.out.println("1. Monster");
		System.out.println("2. Spell");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int menu, menu2;
		String name;
		String effect;
		int qty;
		int buyPrice;
		int atk;
		int def;
		
		while(true) {
			mainMenu();
			System.out.print("Pilihan");
			menu = in.nextInt();
			if(menu == 2) {
				while(true) {
					monsterOrSpell();
					System.out.print("Pilihan");
					menu2 = in.nextInt();
					in.nextLine();
					if(menu2 == 1) {
						System.out.print("Masukkan nama monster");
						name = in.nextLine();
						System.out.print("Masukan effect monster");
						effect = in.nextLine();
						System.out.print("Masukan jumlah monster");
						qty = in.nextInt();
						System.out.print("Masukan buyprice monster");
						buyPrice = in.nextInt();
						atk = (int)(Math.random()*2000) + 1000;
						def = (int)(Math.random()*2000) + 1000;
						monsters[jumlahMonster] = new Monster(name,effect,qty,buyPrice,atk,def);
						jumlahMonster++;
						break;
					}
					else if(menu2 == 2) {
						System.out.print("Masukkan nama spell");
						name = in.nextLine();
						System.out.print("Masukan effect spell");
						effect = in.nextLine();
						System.out.print("Masukan jumlah spell");
						qty = in.nextInt();
						System.out.print("Masukan buyprice spell");
						buyPrice = in.nextInt();
						spells[jumlahSpell] = new Spell(name,effect,qty,buyPrice);
						jumlahSpell++;
						break;
					}
					else {
						System.out.print("Tidak teridentifikasi");
						continue;
					}
				}
			}
			else if(menu == 1){
				while(true) {
					monsterOrSpell();
					System.out.print("Pilihan");
					menu2 = in.nextInt();
					if(menu2 == 1) {
						if(jumlahMonster == 0) {
							System.out.println("Monster Tidak ada");
						}
						else {
							int id,jumlah,total = 0;
							showDataMonster();
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
								if(jumlah < 1 || jumlah > monsters[id].getQty()) {
									continue;
								}
								else {
									break;
								}
							}
							total = jumlah * monsters[id].getBuyPrice();
							System.out.println(jumlah+" @ "+monsters[id].getName()+" dengan total harga "+total);
							System.out.print("Masukkan jumlah uang : ");
							int uang = in.nextInt();
							if(total <= uang) {
								shops[banyakShop] = new Shop();
								shops[banyakShop].addTransMonster(monsters[id], jumlah);
								System.out.println("Berhasil dipesan");
								monsters[id].minusQty(jumlah);
								banyakShop++;
								break;
							}
							else {
								System.out.println("Jumlah uang tidak mencukupi\n");
								continue;
							}
						}
					}
					else if(menu2 == 2) {
						if(jumlahSpell == 0) {
							System.out.println("Spell Tidak ada");
						}
						else {
							int id,jumlah,total = 0;
							showDataSpell();
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
								if(jumlah < 1 || jumlah > spells[id].getQty()) {
									continue;
								}
								else {
									break;
								}
							}
							total = jumlah * spells[id].getBuyPrice();
							System.out.println(jumlah+" @ "+spells[id].getName()+" dengan total harga "+total);
							System.out.print("Masukkan jumlah uang : ");
							int uang = in.nextInt();
							if(total <= uang) {
								shops[banyakShop] = new Shop();
								shops[banyakShop].addTransSpell(spells[id], jumlah);
								System.out.println("Berhasil dipesan");
								spells[id].minusQty(jumlah);
								banyakShop++;
								break;
							}
							else {
								System.out.println("Jumlah uang tidak mencukupi\n");
								continue;
							}
						}
					}
					else {
						System.out.print("Tidak teridentifikasi");
						continue;
					}
				}
			}
			else if(menu == 3) {
				if(banyakShop == 0) {
					System.out.println("Order Kosong");
				}
				else {
					for(int i = 0 ; i < banyakShop;i++) {
						shops[i].showReport();
					}
				}
			}
			else {
				System.out.println("Tidak teridentifikasi");
				continue;
			}
		}
	}
}
