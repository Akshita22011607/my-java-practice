package OOPS_2_abstraction;
//interface is like a class but not a class//multiple inheritance using implements keyword
interface Father{//first parent interface
	void hisProperty();//declare method 
}
interface Mother{//second parent interface
	void herJewellry();//declare method
}

class Child implements Father,Mother{//child class implements parent 1,parent 2{}
	//because he wants everything they have thats why both this is not possible in inheritance.
	public void hisProperty() {//initialize implemented method to got property from parent
		System.out.println("He has 2 flat and 4 acr land");
	}
	public void herJewellry() {//initialize implemented method to got property from parent
		System.out.println("She has half kg gold");
	}
}
public class MultipleInheritance {//we can implement this aslo as a child class but i will creat new
	public static void main(String[] args) {
		System.out.println("Child got gold + property");//just to add remark //ans 1
		Child objC = new Child();//creat object to call method from class/child class
		objC.hisProperty();//call father method//ans 2
		objC.herJewellry();//call mother method//ans 3
	}
}
