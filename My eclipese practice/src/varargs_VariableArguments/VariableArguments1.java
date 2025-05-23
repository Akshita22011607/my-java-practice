package varargs_VariableArguments;
//varargs is variable argument
//we do not use method overloading to perform opration of various parameter value
//will use varargs we can give parameter sinple time only to handle diff parametrs output
//data type of parameter should be same
//variable argument (varags) for same data type 
public class VariableArguments1 {//main mmethod
	public static void additionOfNumb(int ... a) {
		System.out.println("length = " +a.length);//print length optional here //varargs is same as single dimetion array in argument/parameter 
		//form and we can use all method in array class.
		
//to perform addition we will use loop ,go with indexing because varargs is same as array (indexing starts from 0)
		int sum = 0;//pass empty value to store addition
		for (int i = 0;i < a.length;i++) {//do not give <= it will give exception bcz last index will be lengh-1 n we already give i = 0; 
			sum = sum+ a[i];//sum = 0+10-> sum = 10+10;//sum = 0+2 ->sum = 2+5 ->sum = 7+10->same for argument 3 9+5+7+3
		}
		System.out.println("Addition = "+sum);//print sum
	}
	
//	public static void addition(int a, int b, int c) { to perform addition of diffrent number of parameter using method overloding rule
//		System.out.println(a + b + c);}//but i dont want to perform addition like this in that case will use varargs

//	public static void addition(int a, int b, int c, int d) {to perform addition of diffrent number of parameter using method overloding rule
//		System.out.println(a + b + c + d);}//but i dont want to perform addition like this in that case will use varargs
	
	public static void main(String[] args) {
		VariableArguments1.additionOfNumb(10,10);//see now we can add multiple parameter without giving diffrent method//call method
		VariableArguments1.additionOfNumb(2,5,10);//because ov (int ... a)we can add number of parameter using single method//call method
		VariableArguments1.additionOfNumb(9,5,7,3);//and so one we can add n number of parameetr n call same method ... represent n number
	}
}
