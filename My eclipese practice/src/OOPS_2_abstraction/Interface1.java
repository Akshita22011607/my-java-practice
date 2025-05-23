package OOPS_2_abstraction;
//abstraction using interface//hierarchical inheritance type result where on parent n multiple child
interface RBI{//parent interface
	float ROI = 12.36f;
	void getROIOnHomeLoans();//we can not give method body to interface//just declare method 
		//this should be emthy//not initializing it or giving {}
}
class BOI implements RBI{//child class 1 //class to interface use implements
	//class to class use extends // interface to interface use extends
	public void getROIOnHomeLoans() {//need to write public because bydefault interface 
		                               //have public method and public variable only
		System.out.println("BOI home loan ROI is 6.69%");
	}
}
class HDFC implements RBI{//child class 2//class to interface use implements
	public void getROIOnHomeLoans() {
		System.out.println("HDFC home loan ROI is 8.25%");
	}
}	
public class Interface1 {//main method
	public static void main(String[] args) {
		BOI obj1 = new BOI();//create object of child class 1
		obj1.getROIOnHomeLoans();//call method which is hid in interface
		System.out.println(obj1.ROI);//call variable of inetrface
		System.out.println();//just to add space
		HDFC obj2 = new HDFC();//create object of child class 2
		obj2.getROIOnHomeLoans();//call method which is hid in interface
		System.out.println(obj2.ROI);//call variable of interface
	}
}
