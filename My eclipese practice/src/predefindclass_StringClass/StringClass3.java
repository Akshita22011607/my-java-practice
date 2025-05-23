package predefindclass_StringClass;
//create string object by using litrals and print hashcode to see diffrance.
public class StringClass3 {
	public static void main(String[] args) {
		String s1 = "Circle";
		String s2 = "Circle";
		String s3 = "Rectangle";
		String s4 = "Square";
		String s5 = "hexagone";
		String s6 = "Square";
		
//print hashcode decimal value to diffrance between values with same n diffrent object.		
		System.out.println(s1.hashCode());//decimal value of s1
		System.out.println(s2.hashCode());//object of s2 is same as object of 1 thats why s1 n s2 print same value
		System.out.println(s3.hashCode());//decimal value of s3
		System.out.println(s4.hashCode());//decimal value of s4
		System.out.println(s5.hashCode());//decimal value of s5
		System.out.println(s6.hashCode());//object of s6 is same as object of s4 thats why s4 n s6 print same value
	}
}
