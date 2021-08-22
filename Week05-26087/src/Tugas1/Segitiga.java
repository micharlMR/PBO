package Tugas1;

public class Segitiga extends Shape{
	private double alas;
	private double tinggi;
	
	public Segitiga() {
		
	}
	public Segitiga(double alas,double tinggi, String color) {
		super(color);
		this.alas = alas;
		this.tinggi = tinggi;
	}
	
	public double getAlas() {
		return alas;
	}
	
	public double getTinggi() {
		return tinggi;
	}
	
	public double getArea() {
		return (alas * tinggi) / 2;
	}
	
	public double getPerimeter() {
		double sisiMiring = Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi,2));
		return alas + tinggi + sisiMiring;
	}
}
