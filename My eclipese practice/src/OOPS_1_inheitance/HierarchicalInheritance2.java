package OOPS_1_inheitance;

class Fruit{//parent class
	void fruit() {
		System.out.println("Fruit class");
	}
}
class Mango extends Fruit{//child class 1
	void mango() {
		System.out.println("mango class");
	}
}
class Watermelon  extends Fruit{//child class 1
	void watermelon() {
		System.out.println("watermelon class");
	}
}
public class HierarchicalInheritance2 {
	public static void main(String[] args) {
		Mango objm = new Mango();//mango class object to call non static method
		objm.fruit();//can acces parent class fruit
		objm.mango();//can access its own class mango
		System.out.println();//just toadd space
		Watermelon objw = new Watermelon();//watermelon class object to call non static method
		objw.fruit();//can acces parent class fruit
		objw.watermelon();//can access its own class watermelon
		System.out.println();//just toadd space
		Fruit objf = new Fruit();//parent class object
		objf.fruit();//it can access only his class because its parent class n cant acces to it child class

	}

}
