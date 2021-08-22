package Tugas1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pilih;
		Scanner s = new Scanner(System.in);
		
		System.out.println("-------------Program Menghitung Bangun Ruang--------");
		System.out.println("1. Lingkaran");
		System.out.println("2.Persegi");
		System.out.println("3.Persegi Panjang");
		System.out.println("4.Segitiga");
		System.out.println("5.Keluar");
		System.out.print("Pilihan : ");
		pilih = s.nextInt();
		if(pilih == 1) {
			System.out.print("Masukkan jari-jari lingkaran : ");
			double radius = s.nextDouble();
			
			Circle circle = new Circle(radius,"Biru");
			System.out.println("-----------Lingkaran-----------");
			System.out.println("Warna : "+circle.getColor());
			System.out.println("Jari-jari : "+(int)circle.getRadius());
			System.out.println("Keliling Lingkaran : "+circle.getPerimeter());
			System.out.println("Luas Lingkaran : "+circle.getArea());
		}
		else if(pilih == 2) {
			System.out.print("Masukkan sisi persegi : ");
			double sisi = s.nextDouble();
			
			Persegi kotak = new Persegi(sisi,"Merah");
			System.out.println("-----------Persegi-----------");
			System.out.println("Warna : "+kotak.getColor());
			System.out.println("Sisi : "+(int)kotak.getSisi());
			System.out.println("Keliling Persegi : "+kotak.getPerimeter());
			System.out.println("Luas Persegi : "+kotak.getArea());
		}
		else if(pilih == 3) {
			System.out.print("Masukkan panjang persegi panjang: ");
			double panjang = s.nextDouble();
			System.out.print("Masukkan lebar persegi panjang: ");
			double lebar = s.nextDouble();
			
			Persegi_panjang persegi_p = new Persegi_panjang(panjang,lebar,"Ungu");
			System.out.println("-----------Persegi Panjang-----------");
			System.out.println("Warna : "+persegi_p.getColor());
			System.out.println("Panjang : "+(int)persegi_p.getPanjang());
			System.out.println("Lebar : "+(int)persegi_p.getLebar());
			System.out.println("Keliling Persegi Panjang : "+persegi_p.getPerimeter());
			System.out.println("Luas Persegi Panjang : "+persegi_p.getArea());
		}
		else if(pilih == 4) {
			System.out.print("Masukkan panjang alas segitiga: ");
			double alas = s.nextDouble();
			System.out.print("Masukkan lebar tinggi segitiga: ");
			double tinggi = s.nextDouble();
			
			Segitiga segitiga = new Segitiga(alas,tinggi,"Hitam");
			System.out.println("-----------Segitiga-----------");
			System.out.println("Warna : "+segitiga.getColor());
			System.out.println("Panjang : "+(int)segitiga.getAlas());
			System.out.println("Lebar : "+(int)segitiga.getTinggi());
			System.out.println("Keliling Persegi Panjang : "+segitiga.getPerimeter());
			System.out.println("Luas Persegi Panjang : "+segitiga.getArea());
		}
		
		
		s.close();
	}

}
