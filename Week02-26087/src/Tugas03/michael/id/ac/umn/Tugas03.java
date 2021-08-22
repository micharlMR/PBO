package Tugas03.michael.id.ac.umn;

import java.util.Scanner;

public class Tugas03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input1,input2;
		Scanner scanner = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.print("Masukkan nilai terkecil : ");
		input1 = scanner.nextInt();
		System.out.print("Masukkan nilai terbesar : ");
		input2 = scanner.nextInt();
		
		scanner.close();
		
		int jumlah = 0;
		
		for(int i = input1; i < input2;i++){
			int prima = 0;
			for(int j = 1; j <= i; j++){
				if(i % j == 0){
					prima++;
				}
			}
			if(prima == 2){
				jumlah = i + jumlah;
			}
		}
		
		System.out.print("Jumlah dari semua nilai prima dari "+ input1 + " sampai " + input2 + " adalah "+ jumlah);
		
	}

}
