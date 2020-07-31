package oops1;

class Cat{
	boolean hasFur;
	String name , breed ;
	int legs , eyes;
	
	public void walk() {
		System.out.println("my cat is walking");
	}
	
	public void  eat() {
		System.out.println("my cat is eating");
	}
	
	public void description(){
		System.out.println("my cat has "+legs+ " legs and "+eyes+" eyes");
	}
}

class Dog{
	String breed, name ;
	public void jump() {
		System.out.println("my dog is jumping");
	}
	public void description() {
		System.out.println("my dog's name is "+ name+ " and its breed is "+breed);
	}
}

public class MainClass {

	public static void main(String[] args) {
		Cat cat1 = new Cat();
		Cat cat2 = new Cat();
		cat1.legs = 3;
		cat1.eyes = 4;
		cat2.legs = 4;
		cat2.eyes = 2;
		cat1.walk();
		cat1.eat();
		cat1.description();
		cat2.walk();
		cat2.eat();
		cat2.description();
		
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		dog1.name = "browny";
		dog2.name = "blacky";
		dog1.breed = "husky";
		dog2.breed = "poodle";
		
		dog1.jump();
		dog1.description();
		
		dog2.jump();
		dog2.description();
				
		
		
		
		

	}

}
