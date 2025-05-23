package accessModifier1;
//protected acccess modifier//we can access this in class within packeg as well
public class ProtectedAccessModifier {
	protected int a = 20;
	protected static long l =125;
	protected void defaultModifier() {
		System.out.println("Akshita");
	}
	public static void main(String[] args) {
		ProtectedAccessModifier obj = new ProtectedAccessModifier();//creat object to call non static
		obj.defaultModifier();//call non static method
		System.out.println(obj.a);////call non static class
		System.out.println(ProtectedAccessModifier.l);//call static variable by using class name
	}
}
