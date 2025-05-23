package typeCasting_1st_PrimitiveCasting;
public class WideningCasting1 {
	//widening casting matalb chote data type se bade data type me result banana same result for all 
	//value can be positive or negative//we can not change value we just can change return type of variable.
	//widening me data lost nahi hota
	public static void main(String[] args) {
		//implicit or widening type casting
		//we can had code it//result sab variable ko  int ki value assign karna
		//you can see sabse pehele chota data type hai n lastme sabse bada thats what widening is
		int i = 10;//initialize it first
		System.out.println(i);//10
		long l = i;//then implicit(java ne khudse liya hua/automatic) widening to long
		System.out.println(l);//10
		float f = l;//then implicit widening to float
		System.out.println(f);//10.0
		double dl = f;//then implicit widening to double
		System.out.println(dl);//it will print 10.00
		System.out.println();//just to creat space betwwen implicit n explicit widening
		
		//explicit or widening type casting//ham casting rule use karke cast karenge
		//variable_identifier = (variable)previous identifier;
		int a1 = 130;//initialize it first
		System.out.println(a1);//peitn value of int = 130
		short s = (short)a1;//explicit(programer ne diya hua) widening from int to short
		System.out.println(s);//130
		long l1 = (long)s;//explicit widening from short to long
		System.out.println(l1);//130
		float f1 = (float)l1;//explicit widening from long to double
		System.out.println(f1);//130.0
	}
}
