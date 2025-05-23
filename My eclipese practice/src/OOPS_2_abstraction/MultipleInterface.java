package OOPS_2_abstraction;
interface Interface3{//parent iterface 1
	void parentInterface1();//declare method ho hide its functionality
}
interface Interface4 extends Interface3{//interface to interface use extend //parent iterface 2
	void parentInterface2();//declare method ho hide its functionality
}
interface Interface5 extends Interface4{//parent iterface 3
	void parentInterface2();//declare method ho hide its functionality
}
class ChildClass implements Interface3,Interface4,Interface5{//multiple inheritance is posible
	//class_implements_interface1,interface2,interface3,and so on{}
	public void parentInterface1() {//initialize parent class method and give body to it.
		System.out.println("Parent 1");
	}
	public void parentInterface2() {//initialize parent class method and give body to it.
		System.out.println("Parent 2");
	}
    public void parentInterface3() {//initialize parent class method and give body to it.
    	System.out.println("Parent 3");
    }
}
public class MultipleInterface {//we can creat class to call methods of parent class or we use this

	public static void main(String[] args) {
		//Interface1 obj1 = new Interface1();//interface cant creat object
		ChildClass objC = new ChildClass();
		objC.parentInterface1();
		objC.parentInterface2();
		objC.parentInterface3();

	}

}
