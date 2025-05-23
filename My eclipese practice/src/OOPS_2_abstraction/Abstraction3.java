package OOPS_2_abstraction;
//hierarchical inheritance and also we can use multilevel n single inheritance
abstract class Animal{//parent class
	abstract void animalSound();//abstract method to hide working
}
class Dog extends Animal{//child class1
	void animalSound() {
		System.out.println("Dog says bow bow");
	}
}
class Cat extends Animal{//child class2
	void animalSound() {
		System.out.println("Cat says meow meow");
	}
	void animalPlace() {//own method not abstracted
		System.out.println("stays at home");
	}
}
class Chicken extends Animal{//child class3
	void animalSound() {
		System.out.println("Chicken says kuk duk kuuu");
	}
}
public class Abstraction3 {
	public static void main(String[] args) {
		Dog objD = new Dog();//creat object to call dog class
		objD.animalSound();//call method which is abstracted from parent class
		Cat objC = new Cat();//creat object to call cat class
		objC.animalSound();//call method which is abstracted from parent class
		objC.animalPlace();//call its own method
		Chicken objCH = new Chicken();//creat object to call Chicken class
		objCH.animalSound();//call method which is abstracted from parent class
	}
}
