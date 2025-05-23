package finalKeyword;

public class FinalKeyword4 {//initialized global variable by using constructor
	
	final int number;//for non-static
	final boolean bl ;
	
	FinalKeyword4(){//we initialized final keyword by using constructor
		number = 32;
		bl = false;
	}

	public static void main (String[] args) {	
	FinalKeyword4 obj =  new FinalKeyword4();//creat object to call nonstatic
	System.out.println(obj.bl);
	System.out.println(obj.number);
	}
}
