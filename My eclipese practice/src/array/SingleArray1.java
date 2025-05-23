
package array;
//Single dimensional array//just to print lengh
//declaration,instantiation(memory allocation) and initialization in different lines
public class SingleArray1 {
	public static void main(String[] args) {
	//declaration of array//data type[] arrayname//without[] it is normal variable declaration
	int[] intNum;//datatype[] arrayname;	,type 1 to declare array//just[] placement is diffrent
	char []charNum;//datatype []arrayname;,type 2 to declare array
	float floatNum[];//datatype arrayname[];//type 3 to declare array just bracket is at last.
	
	//instantiation or memory allocation of declared array
	intNum = new int[5];
	charNum = new char[6];
	floatNum = new float[4];
	
	//declaration and instantiation or memory allocation in same line//we can use this also
	//this is same as declaration and initialization of premitive data type but for array way.
	int[] intNum1 = new int[5];//we can write this way also to minimize number of line in program
	char []charNum1 = new char[6];//===//===
	float floatNum1[] = new float[4];//===//===
	
	//initialization of array
	intNum[0]=1;
	intNum[1]=2;
	
	//print lenth of array.
	System.out.println(intNum.length);//lengh of int
	System.out.println(charNum.length);//lengh of char
	System.out.println(floatNum.length);//lengh of float
	}
}
