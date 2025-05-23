package typeCasting_2nd_nonPrimitiveCasting;
//explicite upcasting and rest same point as previous program
//in upcasting we can only access parent class with ref to child class
class Parent1{
	int AccountBalance = 2353;
	void home(){
		System.out.println("Home he has");
	}
}
class Child1 extends Parent1{
	int AccountBalance1 =123;
	void car(){
		System.out.println("car he has");
	}
}
public class Upcasting2 {
	public static void main(String[] args) {
		//for explicite upcasting we need to creat child class object.
		Child1 c = new Child1();//now we can access child class as well as parent class all variable n method.
		//Syntax for 1st method -parent class_referancevariable = (parent class)_child class ref.variable();( 
		System.out.println("explicite upcasting Method 1");
		Parent1 p = (Parent1) new Child1();//ist method
		System.out.println(p.AccountBalance);//call parent class object
		p.home();//call parent class method
		System.out.println("explicite upcasting Method 2");
//Syntax for 2nd method- parent class_referancevariable = (parent class)_child class ref.variable;(
		Parent1 p1 = (Parent1)c;
		System.out.println(p.AccountBalance);//call parent class object
		p.home();//call parent class method	
	}
}
