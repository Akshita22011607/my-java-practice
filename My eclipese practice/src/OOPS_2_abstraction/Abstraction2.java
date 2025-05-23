package OOPS_2_abstraction;

abstract class Mobile{//parent class
	abstract void textMessaging(int a,int b);//method 1 to hide text feature
	abstract void calling(char c);//method 2 to hide call feature
}
class FeaturesInMobile extends Mobile{//child class
	void textMessaging(int a,int b) {//give parameters to method 1 and write statements
		int result = a+b;
		System.out.println("Text Messaging Feature");//ans 3
		System.out.println("Addition of two ="+result);//ans 4
	}
	void calling(char c) {//give parameters to method 2 and write statements
		System.out.println("Calling Feature");//ans 1
		System.out.println(c);//ans 2
	}
}
public class Abstraction2 {
	public static void main(String[] args) {
		FeaturesInMobile objF = new FeaturesInMobile();//call child object to acces parent class
		objF.calling('A');//call method 2
		System.out.println();//just to creat space
		objF.textMessaging(10, 20);//call method 1
	}
}
