package OOPS_1_inheitance;

//we are not using inheritance here its out old method to access variable of its own class
class parent {// class 1
	int a = 10;
	static char ch = 'A';
}
class child {// class 2
	boolean bl = true;
	static double dl = 23.56;
}
public class SingleInheritance1 {
	public static void main(String[] args) {

		parent objp = new parent();// create object to call non-static variable n method
		child objc = new child();// create object to call non static variable n method
		System.out.println("Non-Static Variable");
		System.out.println("parent class " + objp.a);// parent class non-static variable
		System.out.println("child class " + objc.bl);// child class non-static variable
		System.out.println();
		System.out.println("Static Variable");
		System.out.println("parent class " + parent.ch);// call parent class static variable by using class name
		System.out.println("child class " + child.dl);// call child class static method by using class name
	}
}
