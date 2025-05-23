package OOPS_1_inheitance;
//we saw sigle inheritane to access class variable we can access class method also in single inheritance
//object class is supermost class in java
//every class directly on indirectly inherit object class
class GrandFather{// implicilty it write extends object  // class 1////GrandFather class directly inherit the Object class explicitly
	//class Grandfather extends object we can write it else java will write implicitly
	void home() {
		System.out.println("Grandparents home");
	}
}
class Father extends GrandFather {// class 2//he wants to access his parents property//
	//// Father class in-directly inherit the Object class through GrandFather
	void car() {// he can access home and car
		System.out.println("parents car");
	}
}
class Son extends Father {// class 3//he wants to access his parents property use extends
	void bike() {// he can access home,car and bike
		System.out.println("sons bike");
	}
}
class GrandSon extends Son {// class 4//he wants to acces his parents property
	void mobile() {// he can access all home,bike,car and mobile
		System.out.println("grandsons mobile");
	}
}
public class MultiLevelinheritance {//Inherithance3 class directly inherit the Object class implicitly
	
	public static void main(String[] args) {
		GrandSon objS = new GrandSon();// grandsons object
		objS.home();// grandson can accces grandfathers home
		objS.car();// grandson can accces fathers car
		objS.bike();// grandson can accces sons bike
		objS.mobile();// Grandson can acces own mobile as well
		System.out.println();
		
		Father objF = new Father();//father object
		objF.car();
		objF.home();
		System.out.println();
		
		Son objSS = new Son();//son object
		objSS.bike();
		objSS.car();
		objSS.home();
		System.out.println();
		
		GrandFather objGF = new GrandFather();//Grandfather object
		objGF.home();
		}

}
