package accessModifier2;
//i want to access only this class from this package to another package not all classes
public class Practice3 {
	public static void addition(int a,int b) {//creat static method
		int result = a+b;
		System.out.println(result);
	}
	public static void main(String[] args) {
		Practice3.addition(20, 20);//call static method by using class name
	}
}