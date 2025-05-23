package OOPS_4_1_compileTimePolymorphism;

//polymorphisam meany many form ex.woman can be a wife/doctor/mother/sports person/doughter/sister any thing.
//achieving compile time polymorphism by using method overloading//non-static method
//rules same as constructor rule//also we can give any access modifier
public class Polymorphism2 {
	//all three rule satisfy 1st num of para 2nd position of para 3rd type of para should be diffrent.
	public void multiplicationOfNum() {//zero para method  without return type//non-static method
		int a =10,b=20;
		int result = a*b;
		System.out.println(result);
	}
	public int multiplicationOfNum(int a,int b) {//parameterized method with return type//non-static method
		return a*b;//we can give aby acces modifier,public,private,protected,default
	}
	public double multiplicationOfNum(int a,float b ,double c) {//parameterized method with return type
		return a*b*c;//non-static method
	}
	public void multiplicationOfNum(double a,int b) {//void method without return type//non-static method
		double result1 = a*b;
		System.out.println(result1);
	}
	public static void main(String[] args) {//main method
		//non-static method call using object of class
		Polymorphism2 obj = new Polymorphism2();//creat object
		obj.multiplicationOfNum();//call method 1
		obj.multiplicationOfNum(20.2, 20);//call method 4
		System.out.println(obj.multiplicationOfNum(20, 40));//call method2
		System.out.println(obj.multiplicationOfNum(20, 20.25f, 10.10));	//call method 3	
	}
}
	