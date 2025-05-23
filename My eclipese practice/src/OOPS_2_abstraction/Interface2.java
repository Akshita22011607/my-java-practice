package OOPS_2_abstraction;

interface Vehical{
	void twoWheeler();//declairation of abstract method to hide its main functinality in this interface
	void fourWheeler();//declairation of abstract method to hide its main functinality in this interface
}
class Toyota implements Vehical{//child class 1 implements parent class
	public void twoWheeler() {//initialization of method of parent class using implememts
		System.out.println("Toyota = No Two Wheeler");
	}
	public void fourWheeler() {//initialization of method of parent class using implememts
		System.out.println("Toyota = do have four Wheeler");
	}
}
class Honda implements Vehical{//child class 2 implements parent class
	public void twoWheeler() {//initialization of method of parent class using implememts
		System.out.println("Honda = do have Wheeler");
	}
	public void fourWheeler() {//initialization of method of parent class using implememts
		System.out.println("Honda = do have four Wheeler");
	}
}
public class Interface2 {//main class
	public static void main(String[] args) {
		Toyota objT = new Toyota();//call parent with respect to child 
		objT.fourWheeler();//result 1
		objT.twoWheeler();//result 2
		System.out.println();//just to have space
		Honda objH = new Honda();//call parent with respect to child 
		objH.fourWheeler();//result 3
		objH.twoWheeler();//result 4

	}

}
