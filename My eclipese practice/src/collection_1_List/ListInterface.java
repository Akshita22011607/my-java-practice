package collection_1_List;
/*By using upcasting, we can use all list interface method in ArrayList and LinkedList class.
Upcasting (Widening) (parent_Interface  Ref_obj  = new child_class)
Valid Example List L1 = new ArrayList(); or  List<Variable> L1 = new ArrayList<variable>();
List L2 = new LinkedList(); or  List<Variable> L1 = new LinkedList<variable>(); */

//only method available in list that we can access using upcasting	

//After creating object of list using upcasting it will directly import both package
import java.util.ArrayList;//after creating ArrayList class it will automatically import package
import java.util.LinkedList;//after creating LinkedList class it will automatically import package
import java.util.List;//parent class of both class added automatically while creating object of list

public class ListInterface {
	public static void main(String[] args) {
	//directly creat object of list using ArrayList to access all method in list
		List l1 = new ArrayList();
		l1.add("Akshita");
		System.out.println(l1.size());
		System.out.println(l1);
		
		//directly create object of list using Linkedlist to access all method in list
				List l2 = new LinkedList();//we can acces list method
//to access LinkedList class method we need to creat object of LinkedList class only.			
				l1.add("Akshita");
				System.out.println(l2.size());
				System.out.println(l2);
			//	l2.addfirst("akshita");it is method of linkedlist not list 
//only method available in list that we can access using upcasting		
	}
}
