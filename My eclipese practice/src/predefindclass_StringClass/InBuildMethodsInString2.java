package predefindclass_StringClass;
import java.util.Arrays;
public class InBuildMethodsInString2 {
	//we will see inbuild methods called function in String class.
		public static void main(String[] args) {
			String s = "My Name Is Akshita ";//s is referance variable//create object using litrals
			String s1 = "Meshram";//s1 is referance variable//create object using litrals
		//we can make string final	
	System.out.println(s.lastIndexOf('i'));//ye last index se start hota hai last se i hai 18,17,16,15 has i
	String s2 = s1.toLowerCase();//we can write this way also rather directly give print statement
	System.out.println(s2);//then print ref variable//this will  all in lower case
	System.out.println(s1.toUpperCase());//print all in upper case
//.equals() ,use karte hai tb vo value/char and case ke basis par true false print karta hai
	System.out.println(s.equals("my name is akshita "));//false because values same but case diffrant
	System.out.println(s.equalsIgnoreCase("my name is akshita "));//this time it egnore case n focus on value
//so by using equalsIgnoreCase we can ignore case n then compare values if it same it will print true.
	String str = " INDIA ";//if i put space befor n after value we can cancle this space by using trim
	System.out.println(str);//it will print first space then india
	System.out.println(str.trim());//it will print input without space//start n end vala space hi trim honga middle nahi
	System.out.println(s.replace('a', 'P'));//replace a with P //My NPme Is AkshitP
	System.out.println(s.replace(" ", ""));//MyNameIsAkshita//but need to give double "" for space, not '' single for char
	String sr = "";//just to check string is empty or not
	System.out.println(sr.isEmpty());//if String is empty it will print true
	System.out.println(s1.isEmpty());//false because its not empty
//i want to split all String //first creat string of array
	String[] arrString = s.split(" ");//i want to split on the basis of space " " space.
	System.out.println(Arrays.toString(arrString));//call array//[My, Name, Is, Akshita]//after all word it will add ,
	//this will add , on the basis of space so that each word is seprated.all seprates
	String[] arrString1 = s.split(" ",2);//this will split string in two parts
	System.out.println(Arrays.toString(arrString1));//this will add only one , n split string in two partes
		}
	}