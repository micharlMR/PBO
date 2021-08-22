package umn.ac.id.uts;

import java.util.Scanner;

public class Main {
	
	static GhokemonEquip[] equip = new GhokemonEquip[10];
	static GhokemonMonster[] monster = new GhokemonMonster[10];
	static GhokemonEquip equipkamu = new GhokemonEquip();
	static GhokemonMonster monsterkamu = new GhokemonMonster();
	
	static Activities[] aktifitas = new Activities[5];
	
	static Scanner in = new Scanner(System.in);
	
	
	
	public static void seedData() {
		monster[0] = new GhokemonMonster("Pichu","Ichu",1,20,20);
		equip[0] = new GhokemonEquip("AK-47","Akang",1,200,"Rifle");
		monster[1] = new GhokemonMonster("Thanos","Tatan",1,2000,2000);
		equip[1] = new GhokemonEquip("RTX2080","R2D8",1,2080,"Knife");
	}
	
	public static void seedDataActivties() {
		aktifitas[0] = new Activities("Pencarian papah(PIKADUT)", 1, 100);
		aktifitas[1] = new Activities("Penghancuran setengah dunia", 1000, 2000);
		aktifitas[2] = new Activities("Persembahan ke dewa bidoff",10000,20000);
	}
	
	public static void mainMenu() {
		System.out.println("          GHOKEMON APPLI          ");
		System.out.println("----------------------------------");
		System.out.println("1. Lihat list Ghokemon Equip");
		System.out.println("2. Lihat list Ghokemon Monster");
		System.out.println("3. Lihat Ghokemon Kamu");
		System.out.println("4. Lihat semua aktifitas");
		System.out.println("5. Assign pokemon ke aktifitas");
		System.out.println("Pilihan : ");
	}
	
	public static void listequip() {
		for(int i = 0; i < 2; i++) {
			System.out.println("Ghokemon Equip ke-" + (i+1));
			System.out.println("Nama     : " + equip[i].getPanggilan() + "(" + equip[i].getNama() + ")" );
			System.out.println("Attack   : " + equip[i].getEXP());
			System.out.println("Type     : " + equip[i].getType());
			System.out.println("EXP      : " + equip[i].getEXP());
			System.out.println();
		}
	}
	
	public static void listmonster() {
		for(int i = 0; i < 2; i++) {
			System.out.println("Ghokemon Monster ke-" + (i+1));
			System.out.println("Nama     : " + monster[i].getPanggilan() + "(" + monster[i].getNama() + ")" );
			System.out.println("Attack   : " + monster[i].getAttack());
			System.out.println("Defense  : " + monster[i].getDef());
			System.out.println("EXP      : " + monster[i].getEXP());
			System.out.println();
		}
	}
	
	public static void listact() {
		for(int i = 0; i < 3; i++) {
			System.out.println("Activities ke-" + (i+1));
			System.out.println("Nama     : " + aktifitas[i].getNamaAktifitas() );
			System.out.println("MinEXP      : " + aktifitas[i].getMinEXP());
			System.out.println("Reward      : " + aktifitas[i].getReward());
			System.out.println();
		}
	}
	
	public static void ghokemonkamu() {
		System.out.println("Ghokemon Equip kamu");
		System.out.println("Nama     : " + equipkamu.getPanggilan() + "(" + equipkamu.getNama() + ")" );
		System.out.println("Attack   : " + equipkamu.getEXP());
		System.out.println("Type     : " + equipkamu.getType());
		System.out.println("EXP      : " + equipkamu.getEXP());
		System.out.println();
		System.out.println("Ghokemon Monster kamu");
		System.out.println("Nama     : " + monsterkamu.getPanggilan() + "(" + monsterkamu.getNama() + ")" );
		System.out.println("Attack   : " + monsterkamu.getEXP());
		System.out.println("Defense  : " + monsterkamu.getDef());
		System.out.println("EXP      : " + monsterkamu.getEXP());
		System.out.println();
	}
	
	public static void assign() {
		int pil;
		System.out.println("Pilih Ghokemon equip atau monster");
		System.out.println("1. Equip");
		System.out.println("2. Monster");
		System.out.println("Pilihan :");
		pil = in.nextInt();
		System.out.println("Pilih Ghokemon yang mau di assign");
		if(pil == 1) {
			for(int i = 0; i < 2; i++) {
				System.out.println("Ghokemon equip ke-" + (i+1));
				System.out.println("Nama   : " + equipkamu.getPanggilan());
			}
			System.out.println("Pilihan : ");
			pil = in.nextInt();
			pil = pil - 1;
			System.out.println("Pilih aktifitas yang akan di assign");
			for(int i = 0; i < 3;i++) {
				System.out.println("Activities ke-" + (i+1));
				System.out.println("Nama     : " + aktifitas[i].getNamaAktifitas() );
				System.out.println("MinEXP      : " + aktifitas[i].getMinEXP());
				System.out.println("Reward      : " + aktifitas[i].getReward());
				System.out.println();
			}
			System.out.println("Pilihan : ");
			int pilAct = in.nextInt();
			pilAct -= 1;
			if(aktifitas[pilAct].getMinEXP() > equip[pil].getEXP()) {
				System.out.println("EXP tidak mencukupi.");
			}
			else {
				equip[pil].plusEXP(aktifitas[pilAct].getReward());
				System.out.println("Activities Selesai");
			}
		}
		else if(pil == 2){
			for(int i = 0; i < 2; i++) {
				System.out.println("Ghokemon monster ke-" + (i+1));
				System.out.println("Nama   : " + monster[i].getPanggilan());
			}
			System.out.println("Pilihan : ");
			pil = in.nextInt();
			pil = pil -1;
			System.out.println("Pilih aktifitas yang akan di assign");
			for(int i = 0; i < 3;i++) {
				System.out.println("Activities ke-" + (i+1));
				System.out.println("Nama     : " + aktifitas[i].getNamaAktifitas() );
				System.out.println("MinEXP      : " + aktifitas[i].getMinEXP());
				System.out.println("Reward      : " + aktifitas[i].getReward());
				System.out.println();
			}
			System.out.println("Pilihan : ");
			int pilAct = in.nextInt();
			pilAct -= 1;
			if(aktifitas[pilAct].getMinEXP() > monster[pil].getEXP()) {
				System.out.println("EXP tidak mencukupi.");
			}
			else {
				monster[pil].plusEXP(aktifitas[pilAct].getReward());
				System.out.println("Activities Selesai");
			}
		}
		
	}
	
	public static void main(String[] args) {
		int pil;
		boolean done;
		
		seedData();
		seedDataActivties();
		System.out.println("Pilih Ghokemon starter anda :");
		listequip();
		listmonster();
		System.out.println("Equip :");
		pil = in.nextInt() - 1;
		in.nextLine();
		equipkamu = equip[pil];
		System.out.println("Monster :");
		pil = in.nextInt() - 1;
		in.nextLine();
		monsterkamu = monster[pil];
		
		while(true) {
			mainMenu();
			pil = in.nextInt();
			switch(pil) {
			case 1: listequip();break;
			case 2: listmonster();break;
			case 3: ghokemonkamu();break;
			case 4: listact();break;
			case 5: assign();break;
			default: continue;
			}
		}
	}
}
