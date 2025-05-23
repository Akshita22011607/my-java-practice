package blocks;

public class NonStaticMethod {
	int a;
	char ch;
	{ // non static block
		a = 2216;
		System.out.println("First non static block");
	}
	{ // we can write multiple non-static block
		System.out.println("Third non static block");
	}
	public static void main(String[] args) {
		System.out.println("this is main method");//this will print it first unlike static block
		//then print all non-static block value then lastly it will print variable value
		
		NonStaticMethod obj1 = new NonStaticMethod();//obj 1 //create object to call 
		System.out.println(obj1.a);
		System.out.println(obj1.ch);
		System.out.println("*********************88");
		NonStaticMethod obj2 = new NonStaticMethod();//obj 2//it will call all non-static block again
		System.out.println(obj2.a);
		System.out.println(obj2.ch);
		
	}
	{ // Sequence ke sath print hong is lia usne third pehele and second badme print kiya
		
		ch ='A';
		System.out.println("Second non static block");
	}
}
