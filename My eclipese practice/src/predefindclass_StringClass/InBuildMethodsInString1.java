package predefindclass_StringClass;
//we will see inbuild methods called function in String class.
public class InBuildMethodsInString1 {
	public static void main(String[] args) {
		String s = "My Name Is Akshita ";//s is referance variable//create object using litrals
		String s1 = "Meshram";//s1 is referance variable//create object using litrals
//length starts from 1,2,3,4 and indexing starts from  0,1,2,3		
	System.out.println(s.length());//this will print total length of string//19
	System.out.println(s.charAt(5));//indexing starts from 0 (0,1,2,3,4 =5th indeax)//this will print m
	System.out.println(s.substring(11));
	//use to give bigin index from where i want to print string from whole string
	//Substring is only method in java which dont follow camel casing
	System.out.println(s.substring(5, 15));//same as above just we can give both beginindex and endindex 
	System.out.println(s.concat(s1));//can concate first string with second string
	System.out.println(s.indexOf('k'));//k char String me konse index par aa raha hai ye check karna hai
	System.out.println(s.indexOf('a'));
	//if koi repeatative char hai String me to vo firsttly jo char milenga jis index me use consider karenga
	System.out.println(s.indexOf("Akshita"));
	//ham index me pura String bhi likh skte hai vo first value ko consider karenga like A at 11th index
	System.out.println(s.indexOf('a', 5));
	/*do same char hai String me n i want to print next char index with same value in that case will give char
    and jis index ke bad se print krna hai vo index number so that we could not get early index of same char*/
	System.out.println(s.indexOf("Name", 10));
	//if it doesnt find index with same String n index number it will print -1
	//this is same as char value with index number//this has String value+index number
	}
}
//we have lots of methods need to dopractice for all