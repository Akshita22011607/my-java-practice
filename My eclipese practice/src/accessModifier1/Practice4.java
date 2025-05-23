package accessModifier1;
//access package from outside the package by using import package.classname
//it is just for single class from another package
import accessModifier2.Practice3;//i want to access only this class from another package
//import packagename.classname to import selected class name class from another package
public class Practice4 {

	public static void main(String[] args) {
		Practice3.addition(10, 10);//accessModifier2 package class
		//we can use/call method from another poackage class
		//and can change parameter value as well
	}
}
