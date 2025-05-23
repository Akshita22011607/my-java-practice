package collection_1_List;
import java.util.ArrayList;//need to import array list package to use method under ArrayList class
import java.util.Iterator;//import Iterator interface package to use its methods
//an Iterator is an object that allows you to traverse (loop through/ go through) elements of a collection one by one.
//ek ek karke sequence ke sath padhata hai objects ko
//jusme 1st dekhenga hai ki nahi object then return karenga object fir next krenga lastly remove karenga object.
public class ArrayList_Iterator1 {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();//object of array list class
		arr.add("Java");//add object
		arr.add("Python");
		arr.add(null);
		arr.add(1607);//unboxing .primitive to non primitive data type add object
		arr.add('A');//unboxing .primitive to non primitive data type add object
		
//		Iterator_refObjectOfIteratorInterface =  refObjectOfArrayListclass.iterator();--> iterator() is method in iterator package
		Iterator itr = arr.iterator();//creat interator object//write it manually first then click control+shift+o to import Iterator package
		//hasNext method return type is boolean it will check using while method ArrayList add method has object or not
		//if it has object it will return  boolean value true if not it will return false
		while(itr.hasNext()) {
//after checking it has object or not it will timr to print object by using print comand  in that will use next method to print all object in add()
			System.out.println(itr.next());
		}
	}
}
