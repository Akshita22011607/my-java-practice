package accessModifier2;
//this is another package //yaha par without error package k bahar access ho gaya
//package ke bahar ka kuch bhi call karna ho import package karna hi padenga
import accessModifier1.PublicAccessModifier;
//it will access all method,variable constructor from another method
public class PublicAccessModifier2 {
	public static void main(String[] args) {
		PublicAccessModifier obj = new PublicAccessModifier();//creat object to call non-static method
		System.out.println(obj.a);//call default nonstatic variable
		obj.publicModifier();//call default nonstatic method
		System.out.println(PublicAccessModifier.l);//call static variable
	}
}
