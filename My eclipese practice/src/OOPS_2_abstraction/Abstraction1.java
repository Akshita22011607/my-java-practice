package OOPS_2_abstraction;

abstract class DemoParentAbstraction1 {// parent class_need to write abstract before class
//we will use abstract non-accecc modifier to achieve abstraction
	abstract void displayMethod();// abstract is non access modifier void is return type n display is method name
	// we did not give body means curly bracket{} to method because we just declare
	// method not initialize it.
    // this is abstract method, only signature (declaration) of method written here after name its only ();
	abstract int additionOfNum(int a, int b);// can have multiple abstract method//just declare method
}// we use extend keyword to inherit or access parent class
class DemoChildAbstraction1 extends DemoParentAbstraction1 {
	void displayMethod() {// now we creat body of this method//parent class only show functionality,child
							// class
		// give exactly what we are doing to achive or inherit abstraction
		System.out.println("This is display method");
	}
	int additionOfNum(int a,int b) {//here we initialize method n give them property.n creat body of method
		return a+b;//return because return type is int 
	}
}
public class Abstraction1 {//main class
	public static void main(String[] args) {
		DemoChildAbstraction1 objC = new DemoChildAbstraction1();// creat object to call
		objC.displayMethod();//call first abstract method
		int result = objC.additionOfNum(10, 20);//call second abstract method
		System.out.println("Addition of num = "+result);//print it
	}
}
