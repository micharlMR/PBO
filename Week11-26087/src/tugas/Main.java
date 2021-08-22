package tugas;

import java.util.ArrayList;
import java.lang.Character;
import java.util.Scanner;

import exceptions.ExcessiveFailedLoginException;


public class Main {
	
	static ArrayList<User> listOfUsers = new ArrayList<User>();
	static Scanner s = new Scanner(System.in);
	
	public static void seedData() {
		Character ch = new Character('M');
		listOfUsers.add(new User("John","Doe",ch,"Jl.Merpati No. 1 RT 1 RW 1, Banten","admin","admin"));
	}
	
	public static void menu() {
		System.out.println("1. Login");
		System.out.println("2. Sign Up");
	}
	
	public static boolean handleLogin(String userName, String password) {
		//int ada = 0;
		/*for(int i = 0;i < listOfUsers.size();i++) {
			//System.out.println(i);
			try {
				listOfUsers.get(i).login(userName,password);
				System.out.println(listOfUsers.get(i).greeting());
				ada = 1;
				return false;
			}
			catch(ExcessiveFailedLoginException ex) {
				System.out.println(ex);
				ada = 1;
			}
		}
		if(ada == 0) {
			System.out.println("username/password salah");
		}
		return true;*/
		try {
			for(int i = 0;i < listOfUsers.size();i++) {
				if(listOfUsers.get(i).login(userName,password)) {
					System.out.println(listOfUsers.get(i).greeting());
					return false;
				}	
			}
			System.out.println("user/pass salah");
			return true;
		}
		catch(ExcessiveFailedLoginException ex) {
			System.out.println(ex);
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pilMenu;
		String userName, password;
		
		seedData();
		while(true) {
			menu();
			System.out.print("Pilihan : ");
			pilMenu = s.nextInt();
			s.nextLine();
			if(pilMenu == 1) {
				do {
					System.out.print("Username : ");
					userName = s.nextLine();
					System.out.print("Password : ");
					password = s.nextLine();
				}while(handleLogin(userName,password));
			}
			else if(pilMenu == 2){
				String namaDepan, namaBelakang, alamat, user, pass;
				char gender;
				while(true) {
					System.out.print("Nama Depan : ");
					namaDepan = s.nextLine();
					System.out.print("Nama Belakang : ");
					namaBelakang = s.nextLine();
					System.out.print("Jenis Kelamin (M/F): ");
					gender = s.nextLine().charAt(0);
					if(gender == 'm'|| gender == 'M') {
						gender = 'M';
					}
					else if(gender == 'f' || gender == 'F') {
						gender = 'F';
					}
					else {
						System.out.println("Not identified");
						continue;
					}
					System.out.print("Alamat : ");
					alamat = s.nextLine();
					System.out.print("Username : ");
					user = s.nextLine();
					if(user.length() < 8) {
						System.out.println("Username harus lebih dari 8");
						continue;
					}
					System.out.print("Password : ");
					pass = s.nextLine();
					boolean hasLowerCase = pass.equals(pass.toLowerCase());
					
					boolean hasUpperCase = pass.equals(pass.toUpperCase());
					System.out.println(hasLowerCase + " " + hasUpperCase);
					if(pass.length() < 6 || pass.length() > 16 || hasLowerCase || hasUpperCase) {
						System.out.println("Password harus menganding huruf besar, angka minimum 6 karakter dan maksisum 16 karakter");
						continue;
					}
					else {
						listOfUsers.add(new User(namaDepan,namaBelakang,gender,alamat,user,pass));
						break;
					}
				}
			}
			else {
				System.out.println("Not Identified");
			}
		}
	}

}
