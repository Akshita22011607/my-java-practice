package accessModifier1;
//for private access modifier
public class PrivateAccessModifier {
	private int a = 10;//private variable
	private void method() {//private method
		System.out.println("Akshita");
	}
	/*//class ke andar main method me private to call kiya to hi error nahi ayenga
	 * //variable m method dono me public static void main(String[] args) {
	 * PrivateAccessModifier obj = new PrivateAccessModifier();
	 * System.out.println(obj.a);} */
	// agar class ke bahar diya main method n private call kiya to error ayenga
	// variable n method dono me
	public static void main(String[] args) {
		PrivateAccessModifier obj = new PrivateAccessModifier();//creat onject
		System.out.println(obj.a);//call nonstatic private variable within class
		obj.method();//call nonstatic private method within class
		//na dusre class me na dusre package me access kar skte hai 
	}
}
