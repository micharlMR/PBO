package Dog;

public class Dog {
	
	String name;
	String breed;
	int age;
	String color;
	//Constructor
	public Dog(String name, String breed, int age, String color) {
		//set attribute name dengan passing variable
		//melewati parameter constructor
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.color = color;
	}
	
	public String getName() {
		return name;
	}
	public String getBreed() {
		return breed;
	}
	public int getAge() {
		return age;
	}
	public String getColor() {
		return color;
	}
	
	public void bio() {
		System.out.println("Hi my name is "+this.getName()+
				".\nMy breed, age, and color are "+this.getBreed()
				+", "+this.getAge()+", "+this.getColor());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//membuat objek dog
		//Mengisi attribute objek dengan menggunakan constructor
		Dog tuffy = new Dog("Tuffy","Papillon",5,"white");
		tuffy.bio();
		//Membuat arraya of object dog
		Dog dogs[] = {
				new Dog("Bruno","Golden",3,"cream"),
				new Dog("Timmy","Pomerania",4,"orange"),
				new Dog("Rex","Bulldog",6,"black")
		};
		
		for(Dog dog : dogs) {
			dog.bio();
		}
	}

}
