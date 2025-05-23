package OOPS_2_abstraction;

interface StaticAndDefaultMethod {// we can write interface public
	static void staticMethod() {// we can not just declare it we have to initialize it n give body
		System.out.println("A,B,C,D,E....");// we can creat sttaic method//result 1
	}
	default void defaultMethod() {// need to write default explicitly
		// we can not just declare it we have to initialize it n give body
		System.out.println("1,2,3,4,5..");// we can creat default method//result 2
	}
}
class DefaultMethod1 implements StaticAndDefaultMethod {// to call default method we creat class
	// then implement parent property and then creat object n call default method

}
public class StaticAndDefaultMethodInterface {

	public static void main(String[] args) {
		StaticAndDefaultMethod.staticMethod();// interface.method name to call static method by using class name
		// interface is same as class but not class so we can call this method by using
		// interface name
		/*
		 * for default we need to creat object but interface not allow same it will not
		 * allow to call default method by using interface name in thats case we inherit
		 * method.
		 */
		DefaultMethod1 obj1 = new DefaultMethod1();// creat object to call default mthod from parent interface
		obj1.defaultMethod();// call parect class to default method to print output//result 2
	}
}
