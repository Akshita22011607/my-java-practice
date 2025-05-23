package nestedAndAnonymusClass;
//multiple anonymous class in sinple file
class Vehicle {
	public void display2() {//want to override method 1
		System.out.println("Akshita");
	}
}
class Car {
	public void display3() {//want to override method 2
		System.out.println("Akshita 2");
	}
}
class Bike {
	public void display2() {//create method to give  anonymous class
		Vehicle obj = new Vehicle() {//anonymous class 1 from vehival class to overide class
			public void display2() {//same as method 1 to override method 1 
				System.out.println("bike");
			}
		};
		obj.display2();//call method 1

		Car obj3 = new Car() {//anonymous class 2 from car class to overide class
			public void display3() {//same as method 2 to override method 2 
				System.out.println("car");
			}
		};
		obj3.display3();//call method 2
	}
}
public class AnonymousClass3 {
	public static void main(String[] args) {
		Bike obj2 = new Bike();//creat object of child class
		obj2.display2();//call child class to getr result of all overided method using anonymous class
	}
}
