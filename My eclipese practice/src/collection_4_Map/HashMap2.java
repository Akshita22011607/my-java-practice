package collection_4_Map;
import java.util.HashMap;
public class HashMap2 {//clear(),remove (),keySet(),values(),entrySet(),print object in single single line using entrySet()
	public static void main(String[] args) {
		HashMap map =  new HashMap();//step 1 creat object of HasMap class
			   //map.add("Akshita");//add method is not there in HashMap insted of add we will use put()method 
			map.put(1, "Akshita");//in put method we need to give key and value 1st key and then value.
			map.put(2, "Java");
			map.put(5, "Interview");//we can give key in random order.
			map.put(9, "Quesions");
			map.put("Akshita", "Meshram");
		System.out.println(map);//{1=Akshita, 2=Java, 5=Interview, Akshita=Meshram, 9=Quesions} value,value is also allowed we can pass any variable
		System.out.println("Size = "+map.size());//5
//	map.clear();//to delete all key n value
//  System.out.println(map);//{} it will juat print empty{}
		map.remove(2);//remove key we can remove key,value only value as well
		System.out.println("Remove key = "+map);//remove 2,Java n print  --> {1=Akshita, 5=Interview, Akshita=Meshram, 9=Quesions}
		
		System.out.println(map.keySet());//print only keys [1, 5, Akshita, 9]
		System.out.println(map.values());//print only values  [Akshita, Interview, Meshram, Quesions]
		
		System.out.println(map.entrySet());//same output but with []
		
	// Using lambda to iterate over the entries //this will print each object one by one in single line
		map.entrySet().forEach(a -> {//refVariableOfHashMap.entrySet()(entryset method).forEachloop(newrefvariableforloop ->{Sysout});
			System.out.println(a);//print a
		});//this is important
	}
}
