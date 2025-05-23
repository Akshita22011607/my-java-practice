package basicCodePractice;

public class MultipyTwoFloatNum {
	//we can do same thing as before by using non static n static method 
	float MultipyTwoFloatNum1(float a,float b) {
		float result = a*b;
		return result;
	}
	public static void main(String[] args) {
		//call non static by using object
		MultipyTwoFloatNum obj = new MultipyTwoFloatNum();
		float result = obj.MultipyTwoFloatNum1(10.5f, 15.75f);
		System.out.println(" Multipy Two Float Number = "+result);
	}
}
