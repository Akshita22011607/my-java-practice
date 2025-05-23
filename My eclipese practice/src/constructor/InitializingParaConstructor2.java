package constructor;

public class InitializingParaConstructor2 {
	double average;// global -nonstatic variable
	boolean flag;// global -nonstatic variable
	//static int number;// global -static variable//ye badme
	
	InitializingParaConstructor2(double d,boolean bl){//parameterrized constructor
		//giving parameter as of now just for non-static
		//now need to give implementation
		average = d;//Implementation
		flag = bl;//Implementation
	}

	public static void main(String[] args) {
		InitializingParaConstructor2 obj = new InitializingParaConstructor2(253.36,true );
		System.out.println("Parameterized constructor value");
		System.out.println("double = " + obj.average);
		System.out.println("boolean = " + obj.flag);
		//System.out.println("int = " + InitializingParaConstructor.number);//ye badmne
	}		                                   
}
