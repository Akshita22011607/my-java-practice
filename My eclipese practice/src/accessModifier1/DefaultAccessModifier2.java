package accessModifier1;
//within package but in different class we can access default variable.
public class DefaultAccessModifier2 {
//this is diff class we can access it directly within package
	public static void main(String[] args) {
		DefaultAccessModifier obj = new DefaultAccessModifier();//creat object to call non-static method
		System.out.println(obj.a);//call default nonstatic variable
		obj.defaultModifier();//call default nonstatic method
		System.out.println(DefaultAccessModifier.l);//call static variable
	}
}
