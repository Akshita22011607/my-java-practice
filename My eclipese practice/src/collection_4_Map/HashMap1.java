package collection_4_Map;
import java.util.HashMap;//step 2 import package of HashMap class to access methods
public class HashMap1 {//put and cotains method in HashMap class.
	public static void main(String[] args) {
	HashMap map =  new HashMap();//step 1 creat object of HasMap class
	System.out.println("Check map is empty before put = "+map.isEmpty());//true its empty
	System.out.println("Size befor put() = "+map.size());//Size befor put() = 0
		   //map.add("Akshita");//add method is not there in HashMap insted of add we will use put()method 
		map.put(1, "Akshita");//in put method we need to give key and value 1st key and then value.
		map.put(2, "Java");
		map.put(5, "Interview");//we can give key in random order.
		map.put(9, "Quesions");
	System.out.println(map);//{1=Akshita, 9=Quesions, 2=Java, 5=Interview}
	System.out.println("check after puting value its empty or not = "+map.isEmpty());//false,because we have put keys n values.
	System.out.println("Size After put() = "+map.size());//Size After put() = 4
		
		HashMap<Integer,String> map1 =  new HashMap<Integer,String>(map);//generic object of HasMap class with existing object refobject to access
		//Integer for key and String for value.//yaha hamne parameter map dala taki ham map object ke sare elements map 1 me use kar sake
	System.out.println(map1);//{1=Akshita, 9=Quesions, 2=Java, 5=Interview}accecc all elements from map object
	
	map1.put(null, null);//trying to give null value for both key n value to check it is working or not
	System.out.println(map1);//yes it works {null=null, 1=Akshita, 9=Quesions, 2=Java, 5=Interview}
	
	map1.put(null, "Selenium");//here key is null but valu different
	System.out.println(map1);//replace existing value n print lettest element /value {null=Selenium, 1=Akshita, 9=Quesions, 2=Java, 5=Interview}
	
	map1.put(9, "Answer");//same key diffrant value
	System.out.println(map1);//replace existing value n print lettest elemen {null=Selenium, 1=Akshita, 9=Answer, 2=Java, 5=Interview}
	
	map1.put(10, "Java");//diffrant key same value//duplicate value accepted but duplicate key is not accepted it will simply replace existing
	System.out.println(map1);//it will add both value with key {null=Selenium, 1=Akshita, 9=Answer, 2=Java, 10=Java, 5=Interview}
	
//check key n value contains in 0object or not using containsKey and containsValue method()	
	System.out.println("key Contains = "+map1.containsKey(2));//this will check map contains key or not  this is true because object has key 2
	System.out.println("Value contains  = "+map1.containsValue("Akshita"));//check value its true because object has Akshita value
	System.out.println("key Contais or not = "+map1.containsKey(3));//it doest contains key 3 thats why false
	System.out.println("Value contains or not  = "+map1.containsValue("Pass"));//it doesnt have value Pass thats why false
	
	
	}

}
