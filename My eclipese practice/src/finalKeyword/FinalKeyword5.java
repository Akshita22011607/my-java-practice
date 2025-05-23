package finalKeyword;

public class FinalKeyword5 {//initialized in non-static block
	final int number;//for non static variable
	final boolean bl ;
	
	{//we initialized final keyword by using non-static block
		number = 32;
		bl = false;
	}

	public static void main (String[] args) {	
	FinalKeyword4 obj =  new FinalKeyword4();//creat object to call non- static block
	System.out.println(obj.bl);
	System.out.println(obj.number);//call non static block
	//obj.bl = true;//it will give error as final variable reassign nahi ho skte hai
	}
}
