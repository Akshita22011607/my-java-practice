package nestedAndAnonymusClass;
//anonymous class means nested class does not have name.
//it will work same as extends n implements without using keywords
//need to give anonymus class name to child class method to perform inheritance
//it will overide public void dispaly of parent class n print mango
class Fruit{//parent class
	public void display() {//creat method 1
		System.out.println("Inside the fruit class");//give body
	}
	public static void info() {//create method 2
		System.out.println("This is info method");//give body
	}
}
//class Banana extends Fruit{//old way to inherit property from parent class using extends
	//but not we will use anonymous class to perform same opration as inheritance in oops}
class Mango{//creat child class without extends to parent class
	public void createClass() {//first we need to creat method to call parent class variable n method
//then we will creat anonymouse class which help to call parent class in this child class
	// creating anonymous class by extending Fruit class//object creation of fruit class/parent class is anonymous class
	Fruit obj = new Fruit() {//creat object of parent class as anonymous class
//Syntax = ParentClassName refObject = new ParentClassName (parameterList) { // body of the anonymous class	};
		public void display() {//creat method for child class not needed bout just to check it work or not under anonymous class
			System.out.println("Inside the Mango class");//method body
		}
	};//}; need to give to complete Anonymouse class
			obj.display();//call parent class using anonymous class ref object
			obj.info();//call parent class using anonymous class ref object
	}
}
public class AnonymousClass1 {
	public static void main(String[] args) {
		Mango obj2 = new Mango();//creat object of child class
		obj2.createClass();//call child class
		}
	}


