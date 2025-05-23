package accessModifier1;
//1st we can call outside class in same program
//default access mofifier
//dusre package me error denga
//isi package ke koi bhi class me error nahi denga plus issi class me bhi error nahi denga
public class DefaultAccessModifier {
	int a = 20;
	static long l =125;
	void defaultModifier() {
		System.out.println("Akshita");
	}

	public static void main(String[] args) {
		DefaultAccessModifier obj = new DefaultAccessModifier();//creat object to call non-static method
		System.out.println(obj.a);//call default nonstatic variable
		obj.defaultModifier();//call default nonstatic method
		System.out.println(DefaultAccessModifier.l);//call static variable
	}

}
