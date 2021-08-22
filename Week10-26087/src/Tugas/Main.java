package Tugas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	static ArrayList<Item> listOfItems = new ArrayList<Item>();
	static ArrayList<Payment> listOfPayments = new ArrayList<Payment>();
	static Scanner s = new Scanner(System.in);
	
	public static void seedData() {
		listOfItems.add(new Item("Kulkas","Electronic",4800000));
		listOfItems.add(new Item("TV","Electronic",1280000));
		listOfItems.add(new Item("Laptop","Computer",6000000));
		listOfItems.add(new Item("PC","Computer",12000000));
	}
	
	public static void printItem(Item item) {
		System.out.println("Nama : "+item.getName());
		System.out.println("Tipe : "+item.getType());
		System.out.println("Harga: "+item.getPrice());
	}
	
	public static void main(String[] args) {
		
		int opt = 0, id = 0;
		int opt1 = 0, uang;
		char opt2;
		seedData();
		do {
			System.out.println("---Program Toko Elektronik----");
			System.out.println("1. Pesan Barang");
			System.out.println("2. Lihat Pesanan");
			System.out.println("0. Keluar");
			System.out.println("Pilihan : ");
			opt = s.nextInt();
			s.nextLine();
			if(opt == 1) {
				System.out.println("----Daftar Barang----");
				for(int i = 0; i < listOfItems.size(); i++) {
					System.out.println("No : "+(i+1));
					printItem(listOfItems.get(i));
					System.out.println("----------------------");
				}
				System.out.print("Pilih : ");
				id = s.nextInt();
				s.nextLine();
				id = id-1;
				printItem(listOfItems.get(id));
				System.out.println("----Tipe pembayaran----");
				System.out.println("1. Cash");
				System.out.println("2. Credit");
				System.out.print("Pilih : ");
				opt1 = s.nextInt();
				s.nextLine();
				if(opt1 == 1) {
					while(true) {
						System.out.print("Bayar (Y/N): ");
						opt2 = s.nextLine().charAt(0);
						listOfPayments.add(new Cash(listOfItems.get(id)));
						if(opt2 == 'Y' || opt2 == 'y') {
							while(true) {
								System.out.println("Harga Pemabayaran : "+listOfPayments.get(listOfPayments.size()-1).getRemainingAmount());
								System.out.print("Bayar : ");
								uang = s.nextInt();
								s.nextLine();
								if(uang >= listOfPayments.get(listOfPayments.size()-1).getRemainingAmount()) {
									break;
								}
							}
							listOfPayments.get(listOfPayments.size()-1).pay();
							System.out.println("Transaksi telah dibayar lunas");
							break;
						}
						else if (opt2 == 'N' || opt2 == 'n'){
							System.out.println("Transaksi telah disimpan");
							break;
						}
						else {
							System.out.println("Input Salah");
						}
					}
				}
				else if(opt1 == 2) {
					int lama;
					while(true) {
						System.out.print("Lama Cicilan(3/6/9/12): ");
						lama = s.nextInt();
						s.nextLine();
						if(lama == 3 || lama == 6 || lama == 9 || lama == 12) {
							break;
						}
					}
					listOfPayments.add(new Credit(listOfItems.get(id),lama));
					Credit credit = (Credit)listOfPayments.get(listOfPayments.size()-1);
					while(true) {
						System.out.println("Harga Pemabayaran : "+credit.getInstallment());
						System.out.print("Bayar : ");
						uang = s.nextInt();
						s.nextLine();
						if(uang >= credit.getInstallment()) {
							break;
						}
					}
					listOfPayments.get(listOfPayments.size()-1).pay();
					System.out.println("Transaksi telah dibayar");
				}
			}
			else if(opt == 2) {
				for(int i = 0;i < listOfPayments.size();i++) {
					System.out.println("No : "+(i+1));
					System.out.println("Nama : "+listOfPayments.get(i).getItemName());
					System.out.println("Nama : "+listOfPayments.get(i).getItem().getType());
					System.out.println("Status : "+listOfPayments.get(i).getStatus());
					System.out.println("Sisa : "+listOfPayments.get(i).getRemainingAmount());
					System.out.println("-----------------------------------------------");
				}
				System.out.print("Pilih no transaksi : ");
				opt1 = s.nextInt();
				System.out.println("Nama : "+listOfPayments.get(opt1-1).getItemName());
				System.out.println("Nama : "+listOfPayments.get(opt1-1).getItem().getType());
				System.out.println("Status : "+listOfPayments.get(opt1-1).getStatus());
				System.out.println("Sisa : "+listOfPayments.get(opt1-1).getRemainingAmount());
				if(listOfPayments.get(opt1-1).getPaidOff()) {
					System.out.println("Transaksi Telah Lunas");
				}
				else {
					//System.out.println(listOfPayments.get(opt1-1).getClassName());
					if(listOfPayments.get(opt1-1).getClassName().equals("CREDIT")) {//kalo classnya CREDIT
						Credit credit = (Credit)listOfPayments.get(opt1-1);
						while(true) {
							System.out.println("Harga Pembayaran : "+credit.getInstallment());
							System.out.print("Bayar : ");
							uang = s.nextInt();
							s.nextLine();
							if(uang >= credit.getInstallment()) {
								break;
							}
						}
						listOfPayments.get(listOfPayments.size()-1).pay();
						if(listOfPayments.get(opt1-1).getPaidOff()) {
							System.out.println("Transaksi telah dibayar lunas");
						}
						else {
							System.out.println("Transaksi telah dibayar");
						}
					}
					else {//kalo classnya CASH
						while(true) {
							System.out.println("Harga Pembayaran : "+listOfPayments.get(opt1-1).getRemainingAmount());
							System.out.print("Bayar : ");
							uang = s.nextInt();
							s.nextLine();
							if(uang >= listOfPayments.get(listOfPayments.size()-1).getRemainingAmount()) {
								break;
							}
						}
						listOfPayments.get(opt1-1).pay();
						System.out.println("Transaksi telah dibayar lunas");
					}
				}
			}
			else {
				System.out.println("Salah Input");
			}
		}while(opt != 0);
	}
}
