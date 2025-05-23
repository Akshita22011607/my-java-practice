package collection_3_Set;
import java.util.HashSet;//Step 2 then import package of HashSet to access method
public class HashSetPractice1 {
	public static void main(String[] args) {
		HashSet set = new HashSet();//step 1 .creat object of HashSetClass//set is referance variable/object
//initial default capacity is 16(Integer number) and default load factor is 0.75(float number),load facter should be less than 1 and decimal	
			//now we add some object/elements
		set.add(9);//can add hetrogineous data 
		set.add(4);
		set.add(7);
		set.add(2);
	//	set.add("Akshita");//we can add String/char/anyData type
			System.out.println(set);//it will print one the basis od hashCode value.
			
			System.out.println(set.add("Java"));//true because java is not there in object,it accpets hetrogeneouse data
			System.out.println(set.add(7));//false ..because same object available in add method//we know set duplicate element allow nahi karta
			System.out.println(set.add(101));//true..because 101 is not there,it accpets diffrant value
			System.out.println(set.add(null));//true because it is also accepts null value
			
	//what not accept by set is duplicate value that why it will print false.		
			System.out.println(set);//[Java, 2, 4, 101, 7, 9] print value according to hashcode value
			System.out.println(set.size());//length or number of object = 7
		
		HashSet set1 = new HashSet(80);//initial default capacity is now 80,and here we cant see load facter thats why default is 0.75
		
		HashSet set2 = new HashSet(120,0.9f);//initial default capacity is now 120 and we can see load capacity is 0.9f(Should be float)
	}
}
