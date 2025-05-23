package accessModifier2;
//this is diffrent package called accessModifier2

//step 1 . but for accesing protected class we must need to import package of that class
import accessModifier1.ProtectedAccessModifier;//import packagename.classname

//step 2 need to inherite n make childparent relationship between two class
//this method where we are calling is child class n from where we are accessing modifier is parent class
public class ProtectedAccessModifier2 extends ProtectedAccessModifier {//this class extends another class
//now we will access private method n variable by using inheritance n creat child class of accessmodifer1 clas
	public static void main(String[] args) {
//step 3 we are always creat object of child class to access parent class after giving extends
//		
		ProtectedAccessModifier2 obj = new ProtectedAccessModifier2();
		obj.defaultModifier();//call non static method
		System.out.println(obj.a);////call non static class
		System.out.println(ProtectedAccessModifier2.l);//call static variable by using class name
	}
}
