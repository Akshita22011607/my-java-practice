package superStatement_keyword;

class Employee {//parent class
	Employee(int a) {
		System.out.println("Employee int constructor");
	}
	Employee() {
		System.out.println("Employee zero constructor");
	}
}
class Developer extends Employee {//child class
	Developer(int p) {
		super(1);// if superclass don't have zero parameterized constructor then
		// then it is mandatory to write super(parameterized) explicitly
		System.out.println("Developer int constructor");
	}
	Developer() {//for zero parameterised we dont need to write super()
		System.out.println("Developer zero constructor");
	}
}
public class SuperStatement2 {
	public static void main(String[] args) {
//		Developer obj = new Developer();
		Developer obj1 = new Developer(1);
	}
}
// super() must be always the first statement in the constructor
// a single constructor can not have both this() & super() at the same time
// to achieve inheritance there must be constructor chaining between child & parent class constructor 
// constructor chaining between child & parent class is achieved using super()
