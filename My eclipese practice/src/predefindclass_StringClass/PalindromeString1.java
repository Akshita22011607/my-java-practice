package predefindclass_StringClass;
//Check String palindrome or not,first reverse string by using loop
//then check reverse string is equals to origanal str9ing or not by using if else
public class PalindromeString1 {
	public String StringPalindrome(String s1) {//creat method n pass parameter String with String return type
//to perform String palindrome first we need to reverse String using loop(Step 1 -reverse String)
	//because reverse String = orignal String then number is palindrome  if not equals then not palindrome
		String reverseS1 = "";
		//hame ek empty String pass karenge reverse value hold karne ke liye
	for (int a = s1.length()-1;a>=0;a--) {
		//indexing starts from 0,thats why -1,now it will take 0 index as first
		//loop start hota hai 1 se n indexing start hoti hai 0,to vo 0 index ko first consider kare is liye -1
//by using for loop we will reverse String and  perform repeatative oprations for that String 
			reverseS1 = reverseS1 + s1.charAt(a);//to print reverse number = first reverse number+second reverse number
       //rev1 for palindrome String, madam = _+m --> m+a-->ma+d-->mad+a-->mada+m -->madam and loop ends and value reverse	
       //rev2 for not palindrom,Love = _+e-->e+v-->ev+o-->evo+L-->evoL and loop end see this is not palindrome String			
		}
//to check String is palindrome or not  if s1 equals reverseS1 its palindrome 
//we need to compare it,and it is done by using if else either or statement
	if(s1.equalsIgnoreCase(reverseS1)) {//ignore case because first char can be upper case or lower case but char is same
		System.out.println("Number is palindrome");//if orignal String  is same as reverse String print this
	}else
		System.out.println("Number is not palindrome");//if orignal String  is not same as reverse String print this
	return reverseS1;//return value because we gave return type n its not void thats why need to give return statement.
	}
	public static void main(String[] args) {//main method
	String orignal1 = "madam";//String1
	String orignal2 = "Sight";	//String2
System.out.println("origanal String = "+ orignal1);//print String 1
PalindromeString1 obj = new PalindromeString1();//creat object to call method
System.out.println("reverse String = "+obj.StringPalindrome(orignal1));//call reverse string for string 1
System.out.println("------------");
System.out.println("origanal String = "+ orignal2);//print String 2
PalindromeString1 obj2 = new PalindromeString1();//creat object to call method
System.out.println("reverse String = "+obj2.StringPalindrome(orignal2));//call reverse String for string 2
	}

}
