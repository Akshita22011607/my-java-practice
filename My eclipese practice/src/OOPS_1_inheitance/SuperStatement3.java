package OOPS_1_inheitance;
class Animal {// Parent class
	int legs;
	double weight;
	Animal(int legs) {// First parameterized constructor (1 parameter)
		System.out.println("Animal Constructor 1: Legs = " + legs);
	}
	Animal(int legs, double weight) {// Second parameterized constructor (2 parameters)
		super(); // Calls Object class constructor (automatically done by Java)
		System.out.println("Animal Constructor 2: Legs = " + legs + ", Weight = " + weight);
	}
}
class Dog extends Animal {//Child class
	char size;
	int age;
	Dog(int legs, double weight, char size) {// First parameterized constructor (3 parameters)
		super(legs, weight); // Calls Parent class constructor: Animal(int, double)
		System.out.println("Dog Constructor 1: Size = " + size);
	}
	Dog(int legs, double weight, char size, int age) {// Second parameterized constructor (4 parameters)
		super(legs, weight); // Calls Parent class constructor: Animal(int, double)
		System.out.println("Dog Constructor 2: Size = " + size + ", Age = " + age);
	}
}
public class SuperStatement3 {//Main class
	public static void main(String[] args) {
		System.out.println("Creating First Object (dog1):");
		// Creating first object using first parameterized constructor (Dog)
		Dog dog1 = new Dog(4, 10.5, 'S');// Calls: Dog(int, double, char) → super(legs, weight) → Animal(int, double)
		System.out.println("--------------------");
		System.out.println("Creating Second Object (dog2):");
		// Creating second object using second parameterized constructor (Dog)
		Dog dog2 = new Dog(4, 12.5, 'M', 5);//Calls: Dog(int, double, char, int) → super(legs, weight) → Animal(int,
		// double)
	}
}
