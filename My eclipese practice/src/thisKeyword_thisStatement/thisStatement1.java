package thisKeyword_thisStatement;

public class thisStatement1 {//this statement this(); to call one constructor from constructor
	
	thisStatement1(){//zero parameterized
		this(12);//should be first statement
		System.out.println("This is zero parameterized constructor");
	}
	
	thisStatement1(int a){//int parameterized
		System.out.println("This is int parameterized constructor");
	}
	
	thisStatement1(char ch){//char parameterized
		System.out.println("This is char parameterized constructor");
	}
	public static void main(String[] args) {
		thisStatement1 obj = new thisStatement1();//creat object to call zero parameterized
	//	thisStatement obj = new thisStatement(15);//creat object to call int parameterized
	//	thisStatement obj = new thisStatement('S');//creat object to call char parameterized
	        //	depends on you what you want to print first
	}

}
