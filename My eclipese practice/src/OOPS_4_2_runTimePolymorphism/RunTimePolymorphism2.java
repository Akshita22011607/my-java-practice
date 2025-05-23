package OOPS_4_2_runTimePolymorphism;
//for multiple class and hierarchical inheritance//non static method
//method overriding//run time polymorphism
class Vehical{//parent class
	void vehicalStarts() {//all of classes has same method
		System.out.println("Vehical starts");
	}
}
class BMWCar extends Vehical{//child class 1//child extends parent
	void vehicalStarts() {//method with body
		System.out.println("It starts by button");
	}
}
class HondaBike extends Vehical {//child class 2//child extends parent
	void vehicalStarts() {//method with body
		System.out.println("It starts by kick");
	}
}
public class RunTimePolymorphism2 {
	public static void main(String[] args) {
		Vehical v = new BMWCar();//when we upcasting with ref to parent class
		v.vehicalStarts();//this will call only BMW method n its body//override parent method to child
		System.out.println();//just to ass space between result
		Vehical v1 = new HondaBike();//when we upcasting with ref to parent class
		v1.vehicalStarts();//this will call only honda method n its body//override parent method to child
		System.out.println();//just to add space between result
		Vehical v2 = new Vehical();//creating object to call own method
		v2.vehicalStarts();//call own means parent method
	}
}
