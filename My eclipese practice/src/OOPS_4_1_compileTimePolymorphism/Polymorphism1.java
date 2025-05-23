package OOPS_4_1_compileTimePolymorphism;

//polymorphisam meany many form ex.woman can be a wife/doctor/mother/sports person/doughter/sister any thing.
//achieving compile time polymorphism by using method overloading//static method
//rules same as constructor rule
public class Polymorphism1 {
	//all three rule satisfy 1st num of para 2nd position of para 3rd type of para should be diffrent.
	public static void additionOfNum() {//zero para method  without return type//static method
		int a =10,b=20;
		int result = a+b;
		System.out.println(result);
	}
	public static int additionOfNum(int a,int b) {//parameterized method with return type//static method
		return a+b;
	}
	public static double additionOfNum(int a,float b ,double c) {//parameterized method with return type
		return a+b+c;//static method
	}
	public static void additionOfNum(double a,int b) {//void method without return type//static method
		double result1 = a+b;
		System.out.println(result1);
	}
	public static void main(String[] args) {//main method
	//call static method by using class name aslo we need to write print statement (class name.method name();)
	 Polymorphism1.additionOfNum();//call 1st method
	 System.out.println(Polymorphism1.additionOfNum(23, 20));//call 2nd method
	 System.out.println(Polymorphism1.additionOfNum(12, 20.23f,20.25));//call third method
	 Polymorphism1.additionOfNum(36.3, 10);//call fourth method
	 //we can change sequence of calling method
	}
}
