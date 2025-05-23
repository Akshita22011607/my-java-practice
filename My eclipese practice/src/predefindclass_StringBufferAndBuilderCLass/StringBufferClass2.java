package predefindclass_StringBufferAndBuilderCLass;
//buffer classme bina naya object banaye hi string modify kar sakte ho.(mutable)
//we have variouse method in String buffect to make String mutable/changable
//important functionality in String BUffer class.
public class StringBufferClass2 {

	public static void main(String[] args) {
//we nedd to create object of StringBuffer class first.with String value "_"		
		StringBuffer sb1 = new StringBuffer("Akshita Meshram");
		System.out.println("Original = "+sb1);

//reverse method..java String buffer has reverse method.
	//you cant find this method in String class it is only in String builder n buffer class	
		sb1.reverse();//this will reverse overall String
		System.out.println(sb1);//marhseM atihskA
	/*we have done program for String reverse using for loop in java but we can directly 
	perform it by using	StringBuffer class in java*/
		
// equals, hashcode are not overridden in StringBuffer class it is overriden in String class
		//toString method is overrriden
	System.out.println(sb1.toString());//this will print string value because it is overrriden
	StringBuffer sb3 = new StringBuffer("i am the best");
	StringBuffer sb4 = new StringBuffer("i am the best");
//for StringBuffer and StringBuilder .equals and == methods compare based on address(hashcode)	
	System.out.println(sb3.hashCode());//value same but memory location is diffrant,thats why print 2018699554
	System.out.println(sb4.hashCode());//value same but memory location is diffrant,thats why print 1311053135
	System.out.println(sb3.equals(sb4));//false because this compares based on memory location(hashcode)
	System.out.println(sb3 == sb4);//false because this compares based on memory location(hashcode)
	
//capacity method to know ,default capacity of stringBufferclass
	StringBuffer sb2 = new StringBuffer();//creat object n keep it black means no String value
	System.out.println(sb2.capacity());//default capacity is 16
	//if i write "Hello" n then print it will Show capacity 21 menas default+StringCapacity=16+5 =21
	
	
	}
}
