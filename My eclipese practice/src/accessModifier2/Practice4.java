package accessModifier2;
//i want to access only this class from this package to another package not all classes
//using fully qualified name jo call karte vkt likhna padta hai.jaha access karna h vaha
public class Practice4 {
	public static void addition(int a,int b) {//creat static method
		int result = a+b;
		System.out.println(result);
	}
	public void akshita2() {//non-static method
		System.out.println("Akshita2");
	}

	public static void main(String[] args) {
		Practice4.addition(20, 20);//call static method by using class name
		//jaise yaha hame is method ko call karna hai but dusre package me
		Practice4 obj = new Practice4();//call nonstatic method first creat object
		obj.akshita2();//call method
	}
}
