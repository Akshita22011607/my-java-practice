package collection_1_List;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Iterator3 {

	public static void main(String[] args) {
		ArrayList obj = new ArrayList();
		obj.add("eena");
		obj.add("meena");
		obj.add("deeka");
		obj.add(108);
		System.out.println(obj);
		System.out.println(obj.size());

		Iterator itr = obj.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
	itr.remove();
}
Iterator itr1 = obj.iterator();
while(itr1.hasNext()) {
	System.out.println(itr1.next());
	itr1.remove();
}

	}

}
