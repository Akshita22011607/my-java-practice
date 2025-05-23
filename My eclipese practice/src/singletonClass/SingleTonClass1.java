package singletonClass;
// Singletone class example with Early instantiation and late instantiation
class SingleTon1 {	
	private SingleTon1() {//Private constructor Prevents other classes from creating objects using 'new'
	}
// static SingleTon1 obj = new SingleTon1();//creat object of class // early instantiation//step 2 can be this 

	// Step 2 (alternative): Declare static instance without creating it
	// Reason: For lazy (late) instantiation – create object only when needed
	static SingleTon1 obj;

	// Step 3: Provide public static method to return the instance
	// Reason: This method gives global access point to the object
	public static SingleTon1 getInstance() {
		// Late instantiation: object is created only when this method is called
		obj = new SingleTon1();
		return obj;
	}
}
// Class accessing Singleton instance
public class SingleTonClass1 {
	// Reason: Access Singleton instance using the static method (no 'new' keyword)
	SingleTon1 obj1 = SingleTon1.getInstance();
}

// Another class accessing Singleton instance
class SingleTon2 {
	// Reason: Singleton object is shared here too – same instance should be used
	SingleTon1 obj2 = SingleTon1.getInstance();
}