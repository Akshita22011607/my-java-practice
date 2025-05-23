package predefindclass_StringBufferAndBuilderCLass;
//String builder class is same as String buffer class it just have some internal changes 
//buffer is Thread safe and builder is Not Thread Safe (non-synchronized) 
//builder thats is not thread safe is faster than thread safe .
public class StringBuilderClass1 {
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("I Am The Best"); //builder same as buffer
		System.out.println("original String = "+sb1 );
	sb1.append(" = Akshita");//add value after String
		System.out.println(sb1);
	sb1.insert(5, "why not");//insert values in perticular location
		System.out.println(sb1);
	System.out.println(sb1.capacity());//check capasity ,default 16 +count total number char in String
	sb1.replace(15, 20, "XYZ");//replace char,word to other char,word
		System.out.println(sb1);
	sb1.delete(1, 5);//delete value from 1 point to anotehr
		System.out.println(sb1);
	sb1.reverse();//shortcut way to revrse overall string
		System.out.println(sb1);
		                       System.out.println();//just to add space
	//using String buffer want to do Split reverse.
	String str = "falling in love";//first initialize string
		System.out.println("original String = "+str);
	String[] splitValue = str.split(" ");//Split String with repect to space so it will create 3 words 1st falling,2 in,3 love
  //in array indexing Starts from 0,index 0-falling,index 1-in ,index 2 -love
		StringBuilder s1 = new StringBuilder(splitValue[0]);//creat String builder object with respect to index 0
		s1.reverse();//revrse index one value 
//if we write System.out.println(s1)then same for s2 and s2 it will print result in diffrent lines
//thats why write only print and to add space between result we follow concatination rule n add space " " after refrance variable		
		System.out.print(s1+" ");//print revese value for index 0 thatsb is falling--> gnillaf
		StringBuilder s2 = new StringBuilder(splitValue[1]);//creat String builder object with respect to index 1
		s2.reverse();//revrse index one value
		System.out.print(s2+" ");//print revese value for index 0 thatsb is in--> ni
		StringBuilder s3 = new StringBuilder(splitValue[2]);//creat String builder object with respect to index 2
		s3.reverse();//revrse index one value
		System.out.println(s3);//print revese value for index 0 thatsb is love--> evol
	

	}

}
