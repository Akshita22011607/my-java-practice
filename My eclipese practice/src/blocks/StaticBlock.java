package blocks;

public class StaticBlock {
	static int a;
	static char ch;

	static {// it is use to initialize static variable
		a = 125;
		System.out.println("This is first block");//Static blocks will execute first then main method
	}
	static {// we can write multiple static block
		ch = 'A';
		System.out.println("This is second block");
	}
	
	public static void main(String[] args) {// to call static block//call main method se hi honga
		System.out.println("this is main method");//ye last me print honga n iske badke sari value bhi
		System.out.println(StaticBlock.a);/*call static variable by using class name
										     class name.variable*/		
		System.out.println(StaticBlock.ch);//for second static block
		System.out.println(StaticBlock.ch);
	}
	
	static {// we can write block within class else anywhere
		ch = 'C';
		System.out.println("This is third block");/*//memory load only single time in 
		static variable thats why it will print latest value of ch in static*/	
		}
}
