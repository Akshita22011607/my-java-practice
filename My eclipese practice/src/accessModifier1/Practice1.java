package accessModifier1;//package 1
//access package from outside the package by using import package.* 
import accessModifier2.*;//import packagename.* to impo//package 2
//import packagename.* to import all classes from that package
public class Practice1 {//this package class
	public static void main(String[] args) {
		Practice2 obj = new Practice2();//imported class object
		obj.akshita2();//call object because it is nonstatic
		Practice2.akshita();//call static class from imported class using class name
	}
}
