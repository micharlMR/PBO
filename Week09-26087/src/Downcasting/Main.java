package Downcasting;

public class Main {
	
	public static void main(String[] args) {
		CEO c = new CEO();
		Pekerja p = new CEO();
		c = (CEO)p;
		c.tanyaPendapatan();
		c.tanyaIdentitas();
	}
}
