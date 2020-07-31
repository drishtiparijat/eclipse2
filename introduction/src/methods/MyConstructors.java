package methods;
class Vehicle{
	int wheels;
	Vehicle(){
		wheels = 4;
		}
}
public class MyConstructors {
	MyConstructors(){
		System.out.println("hello everyone, welcome to constructors");
	}
	public static void main(String[] args) {
		MyConstructors constructor = new MyConstructors();
		Vehicle car = new Vehicle();
		System.out.println("my car has "+ car.wheels + " wheels");

	}

}
