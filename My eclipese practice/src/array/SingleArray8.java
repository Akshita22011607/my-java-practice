package array;
import java.util.Arrays;
public class SingleArray8 {
	public static void main(String[] args) {
		char[] arrChar = { 'A', 'K', 'S', 'H', 'I', 'T', 'A' };
		System.out.println(arrChar.length);// this will print lengh of char
		System.out.println(Arrays.toString(arrChar));// this will print array in string form
		// Arrays - yaha arrayas class ka method use hua hai.

//but i dont want result in string form i want to print my name without comma,
		System.out.println(String.valueOf(arrChar));
		// String -String class ka method use hua hai

//first method to copy one array to another array using System.arraycopywith restriction of char
		char[] arrChar1 = new char[4];// declare n instantiated new array//new array
// i want only 4 char from my name n thats case will use System.arraycopy
		System.arraycopy(arrChar, 0, arrChar1, 0, 4);
		// old array,starting point of old array,new array,start point,end point you
		// want);
		System.out.println(String.valueOf(arrChar1));
		// print value without gap n comma.

//second method to copy one array to another array is clone method
		char[] arrChar2 = arrChar.clone();
		// declare new array for char = old array.clone()method
		System.out.println(String.valueOf(arrChar2));
	}
}
