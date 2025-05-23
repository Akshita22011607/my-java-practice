package finalKeyword;

public class FinalKeyword6 {//both nonstatic block plus constructor
	
	final int number;
	final boolean bl;
	
	{//non static block
		number = 20;
	//	bl = true;
	}
	FinalKeyword6(){//constructor
	//	number = 20;//we can reassign it because final keyword is constant value,only one value
		bl = true;
	}
	
	public static void main(String[] args) {
		FinalKeyword6 obj = new FinalKeyword6();//creat object
		System.out.println("Non-Static block int ="+obj.number);//call non=static block
		System.out.println("Constructor boolean ="+obj.bl);//call constructor
	}
}
