package nestedAndAnonymusClass;
//anonymous class means nested class does not have name.
//it will work same as extends n implements without using keywords
//need to give anonymus class name to child class method to perform abstraction
//it will overide public void dispaly of parent class n print mango
interface Fruit1{//parent class
	public void display1();//creat method 1		
}
//class Banana impliments Fruit{//old way to inherit property from parent class using impliments
	//but not we will use anonymous class to perform same opration as abstraction in oops}
class Mango1{//creat child class without extends to parent class
	public void createClass1() {//first we need to creat method to call parent class variable n method
//then we will creat anonymouse class which help to call parent class in this child class
	// creating anonymous class by extending Fruit class//object creation of fruit class/parent class is anonymous class
	Fruit1 obj = new Fruit1() {//creat object of parent class as anonymous class
//Syntax = ParentClassName refObject = new ParentClassName (parameterList) { // body of the anonymous class	};
		public void display1() {//creat method for child class not needed bout just to check it work or not under anonymous class
			System.out.println("Inside the Mango class");//method body
		}
	};//}; need to give to complete Anonymouse class
			obj.display1();//call parent class using anonymous class ref object
	}
}
public class AnonymousClass2 {
	public static void main(String[] args) {
		Mango1 obj2 = new Mango1();//creat object of child class
		obj2.createClass1();//call child class
		}
	}


