package constructor;

public class InitializingParaConstructor3 {//for multiple object
	double average;// global -nonstatic variable
	boolean flag;// global -nonstatic variable
	//static int number;// global -static variable//ye badme
	
	InitializingParaConstructor3(double d,boolean bl){//parameterrized constructor
		//giving parameter as of now just for non-static
		//now need to give implementation
		average = d;//Implementation
		flag = bl;//Implementation
	}
	InitializingParaConstructor3(boolean bl){//parameterrized constructor just for boolean
		flag = bl;//Implementation
	}
	public static void main(String[] args) {
		InitializingParaConstructor3 obj1 = new InitializingParaConstructor3(253.36,true );
		System.out.println("Value for object 1");
		System.out.println("double = " + obj1.average);
		System.out.println("boolean = " + obj1.flag);
		System.out.println("****************");
		InitializingParaConstructor3 obj2 = new InitializingParaConstructor3(120.36,false );
		System.out.println("Value for object 2");
		System.out.println("double = " + obj2.average);
		System.out.println("boolean = " + obj2.flag);
		System.out.println("****************");
		InitializingParaConstructor3 obj3 = new InitializingParaConstructor3(false );
		System.out.println("Value for object 3");
		System.out.println("boolean = " + obj2.flag);
	}		                                   
}