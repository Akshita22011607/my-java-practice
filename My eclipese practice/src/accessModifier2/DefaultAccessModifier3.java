package accessModifier2;
//in diffrent package we can not call default access modifier
//it will give error The field DefaultAccessModifier is not visible

import accessModifier1.DefaultAccessModifier;//diffrent package
import accessModifier1.PublicAccessModifier;
public class DefaultAccessModifier3 {//diffrent class
	public static void main(String[] args) {
		PublicAccessModifier obj = new PublicAccessModifier();//creat object to call non-static method
		System.out.println(obj.a);//call default nonstatic variable
		obj.publicModifier();//call default nonstatic method
		System.out.println(PublicAccessModifier.l);//call static variable
	}
}
