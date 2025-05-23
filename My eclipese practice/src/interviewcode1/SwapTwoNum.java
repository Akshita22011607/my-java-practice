package interviewcode1;

public class SwapTwoNum {
	
	public static int swapTwoNumbtemp() {//static with temp
		int a = 10,b=20,temp;
		temp = a;//temp = 10;
		a=b;//a = 20;
		b = temp;//b = 10;
		System.out.println("Value of a ="+a);
		System.out.println("Value of b ="+b);
		System.out.println("****************************");
		return 2;//return 2 just to assign value
	}
	public int swapTwoNumbWithoutTemp() {//non-static without temp
		int a = 25,b=15;
		a = a+b;//a=25+15=40
		b = a-b;//b=40-15
		a = a-b;//a = 40-25
		System.out.println("Value of a ="+a);
		System.out.println("Value of b ="+b);
		return 2;//return 2 just to assign value
	}
	
	public static void main(String[] args) {
		SwapTwoNum.swapTwoNumbtemp();//call static method by using class
		SwapTwoNum obj = new SwapTwoNum ();//need to creat object to call non static method
		obj.swapTwoNumbWithoutTemp();//call non static method
	}
}
