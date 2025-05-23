package OOPS_1_inheitance;
	//access parent class by using extend keyword so that it will take all property of parent class
	//extends keyword is used to setup parent-child (IS-A) relationship between two classes
	class parent1 {// class 1//it can not acces its child class
		int a = 10;
		static char ch = 'A';
	}
	class child1 extends parent {// this class want to access parent class using extends
		boolean bl = true;
		static double dl = 23.56;
	}		
 public class SingleInheritance2 {
	public static void main(String[] args) {
		parent1 objp1 = new parent1();// create object to call non-static variable n method
		child1 objc1 = new child1();// create object to call non static variable n method
		System.out.println("Non-Static Variable");
		System.out.println("parent class " + objp1.a);
		// parent class accesing its own class non static variable
		System.out.println("child class " + objc1.bl);
		// child class accessing its own class
		System.out.println("child class accessing parent class " + objc1.a);
		//but now child class is accesing its parent class
		System.out.println();
		System.out.println("Static Variable");
		System.out.println("parent class " + parent1.ch);
		//parent class accesing its static variable
		System.out.println("child class " + child1.dl);
		// child class accessing its static variable
		System.out.println("child class accesing parent class " + child1.ch);
		// but now child class accessing parent class static variable
	}
}
