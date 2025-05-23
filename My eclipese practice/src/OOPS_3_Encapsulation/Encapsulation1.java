package OOPS_3_Encapsulation;
//read and write both
public class Encapsulation1 {
	private int rollNumber = 10;//private variable
	private double englishMark = 125.5;//private variable
	//private variable cant use in diffrent class it can be us in this class only
	//to get getter n setter method right click then source then generate getter n setter method
	public int getRollNumber() {//auto generate getter//read only for roll number
		return rollNumber;//return value because return type is int
	}
	public void setRollNumber(int rollNumber) {//auto genrate setter method//write only file
		this.rollNumber = rollNumber;//this keyword to diffrentiate local n global variable
	}
	public double getEnglishMark() {//auto generate getter//read only for roll number
		return englishMark;//return value because return type is double
	}
	public void setEnglishMark(double englishMark) {//auto genrate setter method//write only file
		this.englishMark = englishMark;//this keyword to diffrentiate local n global variable
	}
	public static void main(String[] args) {
		Encapsulation1 obj1 = new Encapsulation1();//creat object by using class to call method
		System.out.println("Setter means read only ");
		System.out.println(obj1.getEnglishMark());//get result
		System.out.println(obj1.getRollNumber());//get result
		System.out.println("getter means write only");
		obj1.setEnglishMark(130);//then set result according to you you can change value of variable
		System.out.println(obj1.getEnglishMark());//then print that variable //it will show changed value
		obj1.setRollNumber(16);//set result according to you you can change value of variable
		System.out.println(obj1.getRollNumber());//then print that variable //it will show changed value
		
		
	}

}
