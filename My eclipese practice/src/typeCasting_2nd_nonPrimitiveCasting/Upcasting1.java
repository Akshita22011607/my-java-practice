package typeCasting_2nd_nonPrimitiveCasting;
//upcasting means parent class ham child ke reference se call karenge thats it
//implicite upcasting
//object of Child class is referred by Parent class
//jisme hame result sirf parent ke hi milenge thats is upcasting.
//child class(sub class) accesing parent class(super class) with using extends and inheritace concept
//implicite n explicite upcasting(widing method means chote se bada thats why implicitly done by java)
class Parent{
	int AccountBalance = 2353;
	void home(){
		System.out.println("Home he has");
	}
}
class Child extends Parent{
	int AccountBalance1 =123;
	void car(){
		System.out.println("car he has");
	}
}
public class Upcasting1 {
	public static void main(String[] args) {
//		object of Child class is referred by Parent class
		// Syntex - Superclass referenceVariable = new Subclass();
		Parent p = new Child(); // upcasting or auto-upcasting, implicit upcasting
        System.out.println(p.AccountBalance);//accessing/calling parent class variable
        p.home();//accessing/calling parent class variable
    //    p.car();//cant access child class method
    //    System.out.println(p.AccountBalance1);//cant access child class variable
	}
}
