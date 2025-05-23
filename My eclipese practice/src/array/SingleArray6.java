package array;
//print array in string form,sort array ascending order
//copy of array to modify lengh n value of array(it can be less or more than origanal array)
import java.util.Arrays;//automatically imported once we creat arrays.toString. for  output
//if import nahi hota hai to pres control+shift+o to import util class
public class SingleArray6 {
	public static void main(String[] args) {
		double[] arrDouble = { 10.1, 50.5, 20.2, 30.3, 60.6, 40.4 };
		System.out.println("lenght of array = "+arrDouble.length);
		for (double arr : arrDouble) {//use for each loop to get array values
			// System.out.println(arr);//this will print output line by line
			System.out.print(arr + " ");
			// print + space = output in single line with space
		}
		System.out.println();
		System.out.println(Arrays.toString(arrDouble));//print result in String form
//	arrays class hai java me predefine jo java .util package me milti hai
		
		Arrays.sort(arrDouble);//jjust to sort array ascending order
//after sorting print result proper min value to max value
		System.out.println(Arrays.toString(arrDouble));//print values after sorting
		
		double[] NewArrDouble =  Arrays.copyOf(arrDouble, 4);//0 to 3 total 4 num
//modify lenght of array as per we want 4,5,6,7,8 it can be less or more than array	
	System.out.println(Arrays.toString(NewArrDouble));//print values after modify array
		
		double[] NewArrDouble1 =  Arrays.copyOf(arrDouble, 9);//0 to 8 total 9 num
//modify lenght of array if  more than array value it will print 0,0 till last value		
	System.out.println(Arrays.toString(NewArrDouble1));//print values after modify array
	}
}
