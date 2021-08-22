package week03.michael.id.ac.umn;

import java.util.Scanner;

public class Tugas2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input,input2,input3;
		String nama,temp1,temp2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Masukkan Nama Anda : ");
		nama = scanner.nextLine();
		System.out.println("--------------------------");
		System.out.println("String anda : " + nama);
		System.out.println("1. charAt\t\t2. length");
		System.out.println("3. substring(n)\t\t4. substring(m,n)");
		System.out.println("5. contains\t\t6. concat");
		System.out.println("7. replace\t\t8. split");
		System.out.println("9. lowercase\t\t10. uppercase");
		System.out.println("Pilih menu : ");
		input = scanner.nextInt();
		switch(input){
			case 1:
				System.out.println("--------charAt----------");
				System.out.println("Nama : " + nama);
				System.out.println("Input : ");
				input2 = scanner.nextInt();
				System.out.println("Hasil : " + nama.charAt(input2));
				break;
			case 2:
				System.out.println("--------length----------");
				System.out.println("Nama : " + nama);
				System.out.println("Hasil : " + nama.length());
				break;
			case 3:
				System.out.println("--------substring(n)----------");
				System.out.println("Nama : " + nama);
				System.out.println("Input : ");
				input2 = scanner.nextInt();
				System.out.println("Hasil : " + nama.substring(input2));
				break;
			case 4:
				System.out.println("---------substring(m,n)---------");
				System.out.println("Nama : " + nama);
				System.out.println("Input mulai: ");
				input2 = scanner.nextInt();
				System.out.println("Input akhir: ");
				input3 = scanner.nextInt();
				System.out.println("Hasil : " + nama.substring(input2,input3));
				break;
			case 5:
				System.out.println("--------contains----------");
				System.out.println("Nama : " + nama);
				System.out.println("Input : ");
				scanner.nextLine();
				temp1 = scanner.nextLine();
				System.out.println("Hasil : " + nama.contains(temp1));
				break;
			case 6:
				System.out.println("--------concat----------");
				System.out.println("Nama : " + nama);
				System.out.println("Input : ");
				scanner.nextLine();
				temp1 = scanner.nextLine();
				System.out.println("Hasil : " + nama.concat(temp1));
				break;
			case 7:
				System.out.println("--------replace----------");
				System.out.println("Nama : " + nama);
				System.out.println("Input kata yang diganti : ");
				scanner.nextLine();
				temp1 = scanner.nextLine();
				System.out.println("Input kata pengganti : ");
				temp2 = scanner.nextLine();
				System.out.println("Hasil : " + nama.replace(temp1,temp2));
				break;
			case 8:
				System.out.println("--------split----------");
				System.out.println("Nama : " + nama);
				System.out.println("Input : ");
				scanner.nextLine();
				temp1 = scanner.nextLine();
				String[] arrOfStr = nama.split(temp1, 2);
		        for (String a : arrOfStr)
		            System.out.println("Hasil : " + a);
				break;
			case 9:
				System.out.println("--------lowerCase----------");
				System.out.println("Nama : " + nama);
				System.out.println("Hasil : " + nama.toLowerCase());
				break;
			case 10:
				System.out.println("--------upperCase----------");
				System.out.println("Nama : " + nama);
				System.out.println("Hasil : " + nama.toUpperCase());
				break;
			default :
				System.out.println("Undefined");
				break;
		}
		scanner.close();
	}

}
