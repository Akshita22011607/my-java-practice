package interviewcode1;

public class FindLargestAmongThreeNum {
	public static void findLargestNum(int a,int b,int c){//static method
		if (a>b && a>c) {
			System.out.println("largest number is A-"+a);
		}else if (b>a && b>c) {
			System.out.println("largest number is B-"+b);
		}
		else {
			System.out.println("largest number is C-"+c);
		}
	}

	public static void main(String[] args) {
		FindLargestAmongThreeNum.findLargestNum(120, 55, 29);//call using class for static method
	}
}
