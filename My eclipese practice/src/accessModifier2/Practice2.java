package accessModifier2;
//for all classes acccess
//i want to practice1 class to accessModifier1 package
public class Practice2 {
	public static void akshita() {
		System.out.println("Akshita");//creat method
	}
	public void akshita2() {
		System.out.println("Akshita2");//creat method
	}
	public static void main(String[] args) {
		Practice2.akshita();//call static method by using class name
		Practice2 obj = new Practice2();
		obj.akshita2();
	}
}
