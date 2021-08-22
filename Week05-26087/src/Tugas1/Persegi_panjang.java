package Tugas1;

public class Persegi_panjang extends Shape{
	private double panjang;
	private double lebar;
	
	public Persegi_panjang() {
		
	}
	public Persegi_panjang(double panjang,double lebar, String color) {
		super(color);
		this.panjang = panjang;
		this.lebar = lebar;
	}
	
	public double getPanjang() {
		return panjang;
	}
	
	public double getLebar() {
		return lebar;
	}
	
	public double getArea() {
		return panjang * lebar;
	}
	
	public double getPerimeter() {
		return (panjang + lebar) * 2;
	}
}
