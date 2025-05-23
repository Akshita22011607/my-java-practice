package collection_3_Set;
//Write a java program to remove duplicate element from Array, 
//it will be appreciable if any of the collection concept is used.
//use set interface method that does not support duplicate 1st HashSet class

import java.util.Arrays;//step 7 ..add package of Arrays class to access methods n print array value
import java.util.HashSet;//Step 3 ...add package of HashSet class to access methods

public class RemoveDuplicateHashSet {

	public static void main(String[] args) {
		int[] arr = {6,8,9,2,6,4,5,8,3};//step 1 .creat array declare,instanciated,initialize in one line

		HashSet set = new HashSet();//step 2 ..creat object of HashSet class
	
//step 4... creat loop to line by line excecution to the last point of elements (length of array elements)		
		for(int a = 0;a < arr.length;a++) {//0 se array ki lengh tak ek ek  ko check krna hai
			set.add(arr[a]);//step 5..  use add() upto array[a] means array ke ek ek elements . from set interface to print value of each object 
			//but we already know set interface does not allow duplicate elements thats why this add method ignore duplicate n return only one
		}
		System.out.println("Orignal Elements = "+Arrays.toString(arr));
		//step 6 to print array orignale value using Arrays class.and print value of object class method toString()
		//for this need to add Arrays class package to access method
		System.out.println("Duplicate Removed Element = "+set);
		//step 8 ..print set directly it will remove all duplicate value because set doesnt accept duplites
	}
}
