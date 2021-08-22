package Tugas02.michael.id.ac.umn;

import java.util.Scanner;

public class Tugas02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input;
		Scanner scanner = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.print("Masukkan angka : ");
		input = scanner.nextInt();

		scanner.close();

		int prima = 0;
		for(int i = 1; i <= input; i++){
			if(input % i == 0){
				prima++;
			}
		}
		if(prima == 2){
			System.out.print("Angka " + input + (" adalah angka prima"));
		}
		else{
			System.out.print("Angka " + input + (" adalah bukan angka prima"));
		}

	}

}
