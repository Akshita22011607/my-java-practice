package predefindclass_StringClass;
//creat object of String class by using litrals,print string value using toString,find length of string
public class StringClass2 {

	public static void main(String[] args) {
		String str1 = "Pune";//class name _ refrence object = "litrals";
		//litral meaning  = value assign  to variable ,in this class name work as variable
		String str2 = "Mumbai"; // object is created using string literal
		String str3 = "Nagpur";// object is created using string literal
		
//print value of String objects
		System.out.println(str1.toString());//print value String object 1 = pune
		System.out.println(str2.toString());//print value String object 2 = mumbai
		System.out.println(str3.toString());//print value String object 3 = nagpur
		/*if we write Sysout(str3 or str2 or str1 only) java will implicitly add .toString after ref name
	 hence we dont need to add toString,we can add explicitly result will be same with or without toStrin*/
		
//just for referance example if we creat object of main class
		StringClass2 obj = new StringClass2();//if we creat object of main class n print object
		System.out.println(obj);//this will print fullyqualifiedname@hexadecimal code
// Object class methods --> toString(), hashCode(), equals() are overridden in string class
        /*means jo bhi object class ki default method hai vo sari override ho jati hai is liye 
         * console me jo value string object ko di hai vahi print hoti hai*/
		
// print lengh of String class object
		System.out.println("Pune = "+str1.length());//lengh of first object
		System.out.println("Mumbai = "+str2.length());//lengh of second object
		System.out.println("Nagpur = "+str3.length());//lengh of third object
	} 
}
