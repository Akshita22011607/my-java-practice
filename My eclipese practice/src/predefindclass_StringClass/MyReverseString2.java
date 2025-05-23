package predefindclass_StringClass;
//Reverse String (total string reverse)Ex = Akshita --> atihskA
public class MyReverseString2 {//main class
/*	public void revereseNumber(String sr) {//void method with string parameter
		String reverse = "";//black/empty string to store value of reverse//same as rev Num.
		for(int a =sr.length()-1;a>=0;a--) {//use for loop for repeatative oprations
			reverse = reverse + sr.charAt(a);}//charAt menast charecter at updated a will be at a each time
		System.out.println("Reverse Num = "+ reverse);}//print reverse
	public static void main(String[] args) {
		String name = "Akshita";//initialize string orignal string this string wants to reverse
		MyReverseString2 obj = new MyReverseString2();//creat object
		obj.revereseNumber(name);//call object
		System.out.println("Orignal Name = "+ name);}}*/
public String reverseString(String s1) {//Create new reverse method with return type String
	String reverse = "";//black/empty string to store value of reverse//same as reverseNum
	for (int a =s1.length()-1;a>=0;a-- ) {//use for loop for repeatative oprations 
		reverse = reverse+s1.charAt(a);//charAt menast charecter at updated a will be at a each time
//emptyString = emptyString+ method para name.predefined method in stringcharat(ref variable of loop)
	}
	return reverse;//return statement because we gave String return type in method n give value reverse
}
public static void main(String[] args) {
	String orignalName = "Akash";//initialize String //this string we want to reverse
	System.out.println("orignal Name = "+orignalName);//print String we can use toString as well.
	
	MyReverseString2 obj = new MyReverseString2();//creat object to call method
	String reverseName = obj.reverseString(orignalName);//call method with referance to main String
	System.out.println("reverse Name = "+reverseName);//Print reverse String	
	}	
}