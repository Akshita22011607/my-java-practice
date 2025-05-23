package array;
import java.util.Arrays;//once Arrays class written it will automatically import java.util package
//print one value of whole array,print default vallues or array,reverse array etc
public class SingleArray7 {
	public static void main(String[] args) {
		int[] arrInt = new int[4];// declare and instantiation /memory load
		System.out.println(arrInt.length);// lenght of array//to get lengh of array no need to initialize
		arrInt[0] = 10;// initialize array
		arrInt[1] = 20;
		arrInt[2] = 15;
		arrInt[3] = 25;
		System.out.println(arrInt[2]);//it will print 20//i want to get 2 number array value.
		System.out.println(Arrays.toString(arrInt));//print array in string form without using array
		Arrays.sort(arrInt);//sort means print value in ascending order	
		System.out.println(Arrays.toString(arrInt));//sort means print value in ascending order		
//if we want to revese array you first need to sort it then apply reverse concept using loops
		
		float[] arrFloat = new float [5];//just declare n instanciated not initialize it
		System.out.println(Arrays.toString(arrFloat));//we get default value with leght.0 to 4 total 5 num
		
		char[] arrChar = new char[6];//just declare n instanciated not initialize it
		System.out.println(Arrays.toString(arrChar));//this will prit default value till last num 6 times
		
		String[] arrString = new String[4];//default value of String is null//String= uppercase
		System.out.println(Arrays.toString(arrString));//it will print default value of string 4 times
		
		double[] arrDouble = new double[5];//just declare n instanciated not initialize double
		System.out.println(Arrays.toString(arrDouble));//it will print default value of default 5 times
		
		boolean[] arrBoolean = new boolean[4];//just declare n instanciated/memory load
		System.out.println(Arrays.toString(arrBoolean));//it will print default value of boolean 4 times	
	}
}
