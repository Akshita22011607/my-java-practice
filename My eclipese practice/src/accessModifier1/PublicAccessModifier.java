package accessModifier1;
//public access modifier//within package n diffrent packages we can access this modifier
public class PublicAccessModifier {
	public int a = 20;
	public static long l =125;
	public void publicModifier() {
		System.out.println("Akshita");
	}
	public static void main(String[] args) {
		PublicAccessModifier obj = new PublicAccessModifier();//creat object to call non-static method
		System.out.println(obj.a);//call public nonstatic variable
		obj.publicModifier();//call public nonstatic method
		System.out.println(PublicAccessModifier.l);//call static variable
	}
}
