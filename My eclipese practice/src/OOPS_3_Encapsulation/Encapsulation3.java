package OOPS_3_Encapsulation;

//read only method means only getter method//means sirf result show honga change nahi
//need to convert private method to public to accces then only we can use private n need to creat method
public class Encapsulation3 {
	private boolean bl = true;//private variable
	private char ch = 'A';//private variable
	private int display() {//private method it can be void or parametric
		System.out.println("This is Display method");//method body
		return 10;//if method is void then we dont have to give return,we will write method name (display();) 
	}
	public boolean getBl() {//if we want to see private variable result need to give getter method//read only
		return bl;//return type is boolean thats why boolean bl
	}
	public char getCh() {//if we want to see private variable result need to give getter method//read only
		return ch;//return type is not void thats why need to write return n then variable idedtifier
	}
	public int getdisplay() {//need to convert private method to public to accces then only we can use private
		return display();//same need to give return type because we write it in method
	}
	public static void main(String[] args) {
		Encapsulation3 obj = new Encapsulation3();//creat object to call method n variable 
		//because everything is public now and nonstatic so we can call them by using object of class
		System.out.println(obj.getBl());//call boolean variable to get/read value
		System.out.println(obj.getCh());//call char variable to get/read value
		System.out.println(obj.display());////call display to get/read body of method in console

	}

}
