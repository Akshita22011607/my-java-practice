package thisKeyword_thisStatement;

public class ThisKeyword2 {// this keyword in method
	double marks;
	char classSection;

	public void displayMethod(double marks, char classSection) {// Parameterized method

		System.out.println("Local Variable =" + marks);
		System.out.println("Local Variable =" + classSection);
		System.out.println("*************");
		System.out.println("Global Variable =" + this.marks);// global we need to initalize
		System.out.println("Global Variable =" + this.classSection);// otherwised it will give default
		System.out.println("*************");
		this.marks=56.36;//initalize global variable
		this.classSection = 'B';
		System.out.println("Global Variable =" + this.marks);//it will print given value
		System.out.println("Global Variable =" + this.classSection);// 	
	}

	public static void main(String[] args) {
		ThisKeyword2 obj = new ThisKeyword2();//call nonstatic method and global object by creating object class
		obj.displayMethod(20, 'A');//initalsizing local variable by using display method
	}
}
