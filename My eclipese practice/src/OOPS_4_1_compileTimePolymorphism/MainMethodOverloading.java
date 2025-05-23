package OOPS_4_1_compileTimePolymorphism;

public class MainMethodOverloading {
	public static void main(String[] args) {//this is main method variable of string array
		System.out.println("public static void main(String[] args)");
	}
	public static void main(int a,double b) {//this is int,double main method
		System.out.println("public static void main(int a,double b)");
	}
	static void main(boolean bl ,double b) {//main method without access modifier
		System.out.println("static void main(boolean bl ,double b)");
	}
	void main(char ch) {//main method without acces n non acces modifier
		System.out.println("void main(char ch)");
	}
	int main(int a) {//main method without access n non access modifier with return type
		System.out.println("void main(char ch)");
		return 10;
	}
}
/*result- this will print only treditional main method that is
public static void main(String[] args){}
jvm will call/invoke main method with parameter as (String[] args)
(ham number of main method bana skte hai by as per method overloading rules but java call
 only main method with parameter of (String [] args))
(String[] args) ) – args is a variable of String array(ye ham badme padhenge)*/
