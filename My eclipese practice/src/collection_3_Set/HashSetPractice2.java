package collection_3_Set;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;//step 2 control+Shift+o
import java.util.Set;//step 2  control+Shift+o
public class HashSetPractice2 {
	public static void main(String[] args) {
//using upcasting  to access all method from parent class ,set is parent class/interface of HashSet class
	Set set = new HashSet();//step 1 //small set is just a refrance variable
		set.add('H');
		set.add('B');
		set.add('O');
		set.add('H');//duplicate is ignored because it has same value of previous H and set does not accept duplicates
		set.add('R');
		System.out.println("Set 1 = "+set);//[B, R, H, O] according to hashcode value
	Set set2 = new HashSet(set);//object 2 with respect to object 1 refrance variable as parameter of object 2
		//creat one more set to add object 2 in abject 1//we can use object 1 in object 2
		System.out.println("Set 2 = "+set2);//[B, R, H, O] print same as 1
	Set set3 = new HashSet();//object 3 
		set3.add('m');
		set3.add('a');
		set3.add('l');
		set3.add('O');//rest is fiffrant but this pbject is same as object of class 1.
		System.out.println("Set 3 = "+set3);//[a, u, l, O]
		
		set.addAll(set3);//add one object to another
		System.out.println("Set after allAdd = "+set);//H and O has duplicate object it will ignore all n just take single char/not duplicate
		
		set.remove('B');System.out.println(set);//[a, R, H, l, m, O] it will remove B
		set.removeAll(set3);System.out.println(set);//it will remove all [R, H]all element of set 3 remove//can use add all,retain all methods
	
//Collections.sort(set1);//	The method sort(List<T>) in the type Collections is not applicable for the arguments (Set)
	ArrayList arr = new ArrayList(set);//for sorting need to create object of array list.and pass refrance variable of set to sort in parameter
	  //hashset got converted into ArrayList
	Collections.sort(arr);//now we can sort
	System.out.println(arr);//it will sort on the basis of its ascii value.ascending order
	}

}
