package finalKeyword;

public class FinalKeyword3 {//for global variable
	//final int number; agar mene global variable ko initialized nahi kiya to ye error show karenga
	final int number =55;//need to  initialized final global variable before use.
	final boolean bl = true;
	final static char ch = 'c';//final static variable
	
	FinalKeyword3(){//for contructor also we can not assign value if variable has final keyword
	//	number = 63;//it will show error n says The final field FinalKeyword3.number cannot be assigned
	}
	{//for nonstatic block as well we cant reasign value to final variable
	//	bl = false;////it will show error n says The final field FinalKeyword3.number cannot be assigned
	}
	
	public static void main(String[] args) {
		FinalKeyword3 obj = new FinalKeyword3();//for nonstatic global variable creat object
		System.out.println(obj.number);//call object
		System.out.println(obj.bl);
		
		System.out.println(FinalKeyword3.ch);//for static by using class
	}
}
