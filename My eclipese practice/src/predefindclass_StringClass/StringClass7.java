package predefindclass_StringClass;
//object created using litrals and keywords in same file //.equals and == comparison
public class StringClass7 {
	public static void main(String[] args) {
		//object create using litrals
		String s1 = "Dog";
		String s2 = "Cat";
		String s3 = "Cow";
		//object create using new keywords and give same values as keywords
		String s4 = new String ("cow");//i just change case and give small c instead C
		String s5 = new String ("Cat");
		String s6 = new String ("Dog");
		String s7 = new String ("Dog");
//.equals compare on basis of  values"charecter""spelling"
		System.out.println(s1.equals(s6));//dog equals dog//true both written in same way
		System.out.println(s2.equals(s5));//cat equals cat//true both written in same way
		System.out.println(s3.equals(s4));//Cow not equals cow //case change thats why false
		System.out.println(s5.equals(s3));//Cat not equals Cow//both values are diffrent,thats why false
		
		System.out.println("---------------");
		
//== compares based on memory location(constant/nonconstant pool,litrals /new object)		
		System.out.println(s1== s6);//false because s1 its in constant n s6 its in non constant pool 
		System.out.println(s2== s5);//false value same but memory location is differant
		System.out.println(s6== s7);//false value same but memory location is differant
	}
}
