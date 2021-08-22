package Interface;

public class MammalInt implements Animal{
	
	public MammalInt() {}
	
	public void eat() {
		System.out.println("Mammal eats");
	}
	
	public void travel() {
		System.out.println("Mammal travel");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MammalInt m = new MammalInt();
		m.eat();
		m.travel();
		System.out.println(pi);
	}

}
