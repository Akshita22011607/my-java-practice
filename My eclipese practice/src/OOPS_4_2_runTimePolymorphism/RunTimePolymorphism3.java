
package OOPS_4_2_runTimePolymorphism;
//for static method
//Static methods do not support runtime polymorphism because they are resolved at compile-time, not runtime
class Vehical2 {// parent class
	static void vehicalStarts() {// all of classes has same method//static method
		System.out.println("Vehical starts");
	}
}
class BMWCar2 extends Vehical2 {// child class 1//child extends parent//static method
	static void vehicalStarts() {// method with body//static method
		System.out.println("It starts by button");
	}
}
public class RunTimePolymorphism3 {
	public static void main(String[] args) {
		Vehical2.vehicalStarts();//call vehical using class name.
		System.out.println();//just to add space
		BMWCar2.vehicalStarts();//call Bmw car using class name
	}
}
