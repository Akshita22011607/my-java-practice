package OOPS_1_inheitance;
//One parent class will be extending by multiple child class//can creat multiple classes
	class Vehicle {// Parent Class
	    void start() {
	        System.out.println("Vehicle starts");
	    }
	}
	class Car extends Vehicle {// Child Class 1
	    void drive() {
	        System.out.println("Car is driving");
	    }
	}
	class Motorcycle extends Vehicle {// Child Class 2
	    void ride() {
	        System.out.println("Motorcycle is riding");
	    }
	}
	public class HierarchicalInheritance1 {// Main Class//directly inherite by object class implicitly
	    public static void main(String[] args) {
	        Car objc = new Car();//creat object of nonstatic method car
	        objc.start();  // Inherited method from parent class
	        objc.drive();  // Own method of car class
	// car.starts();showing an error because parent class doesn't inherit its child class's properties.
  System.out.println();//just to add space
	        
	        Motorcycle objm = new Motorcycle();//creat object of nonstatic method motorcycle
	        objm.start();  // Inherited method from parent class
	        objm.ride();   // Own method of motoercycle class
	    }
	}

