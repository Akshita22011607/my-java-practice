package collection_3_Set;
//Write a java program to remove duplicate element from Array, 
//it will be appreciable if any of the collection concept is used.
//use set interface method that does not support duplicate 2nd TreeSet class

import java.util.Arrays;//7.Need to import Array class to access all methods in claas
import java.util.TreeSet;//3.import package to access methods of TreeSet class

public class RemoveDuplicateTreeSet {
	public static void main(String[] args) {
		char[] ch = {'k','p','o','p','e','o','a','f','v'};//1.create Array  ..declare,give mempry and initialize Array in single line
		
		TreeSet set = new TreeSet();//2.creat object of TreeSet class
		
		for(int a = 0;a<ch.length;a++) {//4.create for loop to Work on each elements upto its length(last value)
			set.add(ch[a]);//5.use add method in TreeSet class to work on each elements but set ignore duplicates.hence print only single value
		}
		
		System.out.println("Orignal char = "+Arrays.toString(ch));//6.print value using Array Class.to String method to print orignal Array
		System.out.println("Remove Duplicate Char = "+set);//8 ..thyen print value of set which remove duplicates
	}
}
