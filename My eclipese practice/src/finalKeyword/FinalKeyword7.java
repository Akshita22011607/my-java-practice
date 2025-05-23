package finalKeyword;

public class FinalKeyword7 {
	
	final static int num = 22;//first declare n initializing in same line
	final static boolean bl;//final blank keyword will initialize it in static block
	
	static {//static block
		bl = true;//initialize static final variable by using static block
	}
	
	public static void main(String[] args) {
		System.out.println("Number = "+FinalKeyword7.num);//call static variable by using class
		System.out.println("boolean = "+FinalKeyword7.bl);////call static variable by using class
	}
}
