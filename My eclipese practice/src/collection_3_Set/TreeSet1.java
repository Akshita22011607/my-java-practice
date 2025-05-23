package collection_3_Set;
//duplicate n hetrogeneouse not allowed in TreeSet
import java.util.TreeSet;//step to add package of tree set to access all method
//print value in console alphabetically(min to max order)
public class TreeSet1 {

	public static void main(String[] args) {
	TreeSet set = new TreeSet();//step 1 ..creat object of treeSet class with set refrance variable
		set.add(6);
		set.add(8);
		set.add(2);
		set.add(6);
		set.add(4);
	System.out.println("Orignal = "+set);//[2, 4, 6, 8] tree arrnage everythig in alphabetical /numerical order means ascending order
	System.out.println(set.add(3));//true because number 3 is not present and it return new elements
	System.out.println(set.add(8));//false because in set duplicate object not accept
	System.out.println(set);//[2, 3, 4, 6, 8] duplicate not allowed thats why first he ignore one 4 in add method then ignore one 8 .

//hetrogeneouse data not allowed 		
//	set.add('A');// Throw Exception ClassCastException
//	set.add("Akshita");	// Throw Exception ClassCastException
	}
}
