package Tugas1;

public class Persegi extends Shape {
	private double sisi;
	
	public Persegi() {
		
	}
	public Persegi(double sisi, String color) {
		super(color);
		this.sisi = sisi;
	}
	
	public double getSisi() {
		return sisi;
	}
	
	public double getArea() {
		return sisi * sisi;
	}
	
	public double getPerimeter() {
		return sisi * 4;
	}
}
