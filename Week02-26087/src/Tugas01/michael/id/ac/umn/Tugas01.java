package Tugas01.michael.id.ac.umn;

import java.util.Scanner;

public class Tugas01 {

	public static void main(String[] args) {
		int input;
		Scanner scanner = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.print("Masukkan bulan(1-12) : ");
		input = scanner.nextInt();

		scanner.close();

		switch(input){
		case 1: System.out.println("Bulan Januari memiliki 31 hari");
		break;
		case 2: System.out.println("Bulan Februari memiliki 28 hari");
		break;
		case 3: System.out.println("Bulan Maret memiliki 31 hari");
		break;
		case 4: System.out.println("Bulan April memiliki 30 hari");
		break;
		case 5: System.out.println("Bulan Mei memiliki 31 hari");
		break;
		case 6: System.out.println("Bulan Juni memiliki 30 hari");
		break;
		case 7: System.out.println("Bulan Juli memiliki 31 hari");
		break;
		case 8: System.out.println("Bulan Agustus memiliki 31 hari");
		break;
		case 9: System.out.println("Bulan September memiliki 30 hari");
		break;
		case 10: System.out.println("Bulan Oktober memiliki 31 hari");
		break;
		case 11: System.out.println("Bulan November memiliki 30 hari");
		break;
		case 12: System.out.println("Bulan Desember memiliki 31 hari");
		break;
		default: System.out.println("Pilihan tidak valid");
		}
	}

}
