package predefindclass_StringClass;
//creat object of string by using new keyword
//to get values/output from object class method and find diffrence between equals and ==
//new keyword me new new object bante hai to memory location har object ka alg honga
public class StringClass6 {
	public static void main(String[] args) {
//create object by using litrals		
		String s1 = new String("Mango");
		String s2 = new String("Banana");
		String s3 = new String("Mango");
//.equals() compares the content (value) of strings
		System.out.println(s1.equals(s2));//false//mango equals mango
		System.out.println(s1.equals(s3));//true//mango equals Banana
		System.out.println(s2.equals(s3));//false//banana equals mango
		System.out.println("-------------");
// In this case, s1 and s3 refer to the diffrent object in the String non-Constant Pool
		System.out.println(s1== s2);//false//hashcode of mango is not equals to hashcode of banana
		System.out.println(s1== s3);//false//hashcode of mango is not equals to hashcode of mango
		System.out.println(s2== s3);//false//hashcode of banana is not equals to hashcode of mango
		System.out.println("-------------");
//print hashCode(),based on the characters (content) of the string — not on memory address.
		System.out.println(s1.hashCode());//hashCode value of object 1 //74109858
        System.out.println(s2.hashCode());//hashCode value of object 2 // 1982479237
		System.out.println(s3.hashCode());//hashCode value of object 1 //74109858
		System.out.println("-------------");
//print toString(),sirf string ke content (characters) ko return karta hai.doesnt care about litral n new keyword
		System.out.println(s1.toString());//Mango//write toString() explicitly
		System.out.println(s2);//Banana//java will write toString() implicitly,hence we dont need to write it.
		System.out.println(s3.toString());//Mango//write toString() explicitly		
				
	}
}