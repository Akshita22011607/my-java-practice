package OOPS_2_abstraction;
//abstract class can have final and static method
abstract class Almira{//parent class
	// this is 0 percent abstract class because it it does ot have any abstract method
	static void sari() {//static method //almira can have sari in it
		System.out.println("Almira have sari");
	}
	final void jewellery() {//static method //almira can have jewellery in it
		System.out.println("Almira have jewellery");
	}
}
public class Abstraction4 extends Almira {//main can be child class or you can make new one also
                                          //child class

	public static void main(String[] args) {
		Abstraction4 objA = new Abstraction4();//creat object to call non-static final method
		objA.jewellery();//call non static method final method is nonstatic
		
		Abstraction4.sari();//call static method by using class name
		//due to extend keyword abstraction4 inherit all almira property
	}
}
