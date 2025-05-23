package OOPS_2_abstraction;
//we  can use extends n implement in same line.
interface Demo1{//parent 1
	void akshita1();//declare class not initialize
}
interface Demo2{//parent 2
	void akshita2();//declare class not initialize
}
class Demo3{//parent 3
	public void akshita3(){//for class we creat new method with body
		System.out.println("this is demo 3");//means declareation n initialization
	}
}
class Demo4 extends Demo3 implements Demo1 , Demo2 {//child class call all of three parent class
	//by using extend for class to class or interface to interface and use implements for class to interface
	public void akshita1() {//in child class we initialize interface class n give body
		System.out.println("this is demo 1");
	}
	public void akshita2() {//initialize parent class in child class
		System.out.println("this is demo 2");
	}
}
public class ExtendAndImplements {//we can do same thing in this class rather than creating new ex demo4.
	public static void main(String[] args) {//main method 
		Demo4 objD = new Demo4();//creat childclass object to call parent class
		objD.akshita1();//call interface demo 1
		objD.akshita2();//call inetrface demo 2
		objD.akshita3();//call interface demo 3
	}
}
