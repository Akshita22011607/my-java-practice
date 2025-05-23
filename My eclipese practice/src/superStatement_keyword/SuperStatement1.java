package superStatement_keyword;


//super() will invoke or call the constructor of superclass or parent class
class Vehical2{//parent class
	Vehical2(){//parent constructor_Zero parameterised
//	super();java compiler will write a super() implicitly
		System.out.println("Parent Constructor");
	}
}
class Car2 extends Vehical2{ //child class//inherit using extend (inheriting Vehical2)
	Car2(){//child constructor_Zero parameterised
		super();////super() can also be written explicitly
		//we dont need to write super statement here because zero para write super() implicitly
		System.out.println("Child Constructor");
	}
}
public class SuperStatement1 {//main class
	public static void main(String[] args) {
		Car2 objC = new Car2();// Creating an object of Car2 (child class)
//First, it calls Vehical2() because super() is executed in Car2 constructor .Then, it executes the Car2 constructor
		System.out.println();//just for space
		Vehical2 objv = new Vehical2();// Creating an object of Vehical2 (parent class)
		//This calls only the parent constructor since no child class is involved
	}
}
