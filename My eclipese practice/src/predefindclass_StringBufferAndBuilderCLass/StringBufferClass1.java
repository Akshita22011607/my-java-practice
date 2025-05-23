package predefindclass_StringBufferAndBuilderCLass;
//buffer classme bina naya object banaye hi string modify kar sakte ho.(mutable)
//we have variouse method in String buffect to make String mutable/changable
public class StringBufferClass1 {
	public static void main(String[] args) {
		//String sb = "Java Language"; will not initalize String like this
		//first step- wee need to creat object of String buffer class with parameter SDtring
		StringBuffer sb = new StringBuffer("Java Language ");
		//we need to initalize String in String Buffer class object creation
		System.out.println(sb);//orignal String
		System.out.println(sb.length());//lenght of String
//Append method to Add String value after existing String		
	sb.append("is Popular");//append method is use when we want to add String value after existing String
		System.out.println(sb);//after append answer will be Java Language is Popular

//insert method to add boolean,String,Char,int,Double any value.(konse location pe , kya insert karna h)	
	sb.insert(3, 'A');//insert method is use to add char or String in existing String(3rd place,add 'A')	
	    System.out.println(sb);//JavAa Language is Popular
	sb.insert(7,"AKSH");//String in existing String this will add akshita in 7th place 	
		System.out.println(sb);//JavAa LAKSHanguage is Popular

//replace method to replace charecter from String it can be 1,2,3,4 char or 1 word anything from String		
	sb.replace(25, 27, "MESH");	//replace value from 25 to 27 to new MESH String
//we can replace 1,2,3 any words we just need to put kahase,kahatak replace karna hai, konse String k sath
		System.out.println(sb);//JavAa LAKSHanguage is PopMESHar
		
//delete method to delete words or charee char from String(kaha se,kaha tak delete karna hai)		
	sb.delete(10, 15);//we can delete charecter at Stringe as well kaha se ,kaha tak delete karna hai.
	System.out.println(sb);//it delete Hangu from String //JavAa LAKSage is PopMESHar
	}
}
