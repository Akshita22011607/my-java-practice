package typeCasting_2nd_nonPrimitiveCasting;
//down casting mmeans child class ko ham parent class ke name se access karenge
//downcasting is explicit only//for doncasting first we need to upcast it then downcast.
//object of Child class is referred by Parent class
//jisme hame result chuld aur parent dono ka milenga because son inherit all property from Father
//parent class(super class) accesing child class(sub class) with using extends and inheritace concept
class Father{
	int AccountBalance = 2353;
	void home(){
		System.out.println("Home he has");
	}
}
class Son extends Father{
	int AccountBalance1 =123;
	void car(){
		System.out.println("car he has");
	}
}
public class Downcasting {
    //	Son s = new Father(); direct downcast it will give compile time error
	// for downcasting, it is neccessary to upcast first
	public static void main(String[] args) {
		Father f = new Son();//first step we upcast it first
		//in this father can access only his property like his home n his balance
		Son s = (Son)f;//then downcast it
		//son can have both father n own property due to inheritace 
		System.out.println(s.AccountBalance);//father account call
		System.out.println(s.AccountBalance1);//son account call
		s.home();//father method call
		s.car();//son method call
	}
}
