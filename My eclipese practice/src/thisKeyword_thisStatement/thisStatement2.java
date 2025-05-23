package thisKeyword_thisStatement;

public class thisStatement2 {//for one parameterized constructor
	
	thisStatement2(){//zero parameterized //this will print 3rd
		this(12);//should be first statement // to call int
		System.out.println("This is zero parameterized constructor");
	}
	
	thisStatement2(int a){//int parameterized//this will print 2nd
		this('A');//to call char
		System.out.println("This is int parameterized constructor");
	}
	
	thisStatement2(char ch){//char parameterized//this will print 1st
		System.out.println("This is char parameterized constructor");
	}
	public static void main(String[] args) {
	  thisStatement2 obj = new thisStatement2();//creat object to call zero parameterized
	//	thisStatement2 obj = new thisStatement2(15);//creat object to call int parameterized
	//	thisStatement obj = new thisStatement('S');//creat object to call char parameterized
	        //	depends on you what you want to print first
	}
}

