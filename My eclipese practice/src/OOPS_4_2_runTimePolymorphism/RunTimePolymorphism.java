package OOPS_4_2_runTimePolymorphism;
//run time polymorphism //method overridden
/*Child class me and parent class me same name ki method jab hoti hai tab child ko call karte 
vakt child class method parent class method ko override kar deta hai.means console me result 
sirf child class ke method ka ayenga.(this is nothing but method overriding)*/
class Father {//father class
	void home() {//parent home method with diffrent body
		System.out.println("Father Purchased plot");
		System.out.println("home Build by father");
	}
}
class Son extends Father {//father class
	void home() {//son home method with diffrent body
		System.out.println("renovated by son");
		System.out.println("Build 2 room extra for his child ");
	}
}
public class RunTimePolymorphism {
	public static void main(String[] args) {
  //overiding fathers method because method is same anyway that home is fater home.
		Son s = new Son();//creat object of child class to get output
		s.home();//when we call we get son class home method. because of same method name
		System.out.println();//just for space
  //when we upcasting it see overrriden work or not
		Father f = new Son();//when we upcasting with ref to child class
		f.home();//in this case we are getting child class only because of same method name
		System.out.println();//just for space
 // when we call parent class using objct that time only we get result of father class	
		Father f1 = new Father();
		f1.home();//this time we get father class method result in console
	}
}
