package predefindclass_StringClass;
//creat object of string by using litrals
//to get values/output from object class method and find diffrence between equals and ==
//Additinally just for ref  check values of toString(),hashCode().
public class StringClass5 {
	public static void main(String[] args) {
//create object by using litrals		
		String s1 = "Mango";
		String s2 = "Banana";
		String s3 = "Mango";
//.equals() compares based on object values only in String class values = mango ,banana		
		System.out.println(s1.equals(s2));//false//mango equals mango
		System.out.println(s1.equals(s3));//true//mango equals Banana
		System.out.println(s2.equals(s3));//false//banana equals mango
		System.out.println("-------------");
//print hashCode() ,just for refrance we are creating Sysout for hashcode just to compare obj1 == ob2 or not	
		System.out.println(s1.hashCode());//hashCode value of object 1 //74109858
		System.out.println(s2.hashCode());//hashCode value of object 2 // 1982479237
		System.out.println(s3.hashCode());//hashCode value of object 1 //74109858
		System.out.println("-------------");
//== compares memory reference (address), not content(memory referance means String Constant pool for litrals)
// In this case, s1 and s3 refer to the same object in the String Constant Pool
		System.out.println(s1== s2);//false//hashcode of mango is not equals to hashcode of banana
		System.out.println(s1== s3);//true//hashcode of mango is equals to hashcode of mango
		System.out.println(s2== s3);//false//hashcode of banana is not equals to hashcode of mango
		System.out.println("-------------");
//print toString(),just for refrance we are creating so thats all three method should cover in one program
		System.out.println(s1.toString());//Mango//write toString() explicitly
		System.out.println(s2);//Banana//java will write toString() implicitly,hence we dont need to write it.
		System.out.println(s3.toString());//Mango//write toString() explicitly
	}
}
