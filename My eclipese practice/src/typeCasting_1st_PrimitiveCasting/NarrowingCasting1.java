package typeCasting_1st_PrimitiveCasting;
//narrowing casting matalb bade data type se chote data type me result banana same result for all 
	//value can be positive or negative//we can not change value we just can change return type of variable.
	//narrowing me data lost hota hai.
//narrowing can not be implicite it always should be explicite
public class NarrowingCasting1 {

	public static void main(String[] args) {
		//casting by using casting rule only/it can not be implicit
		//variable_identifier = (variable)previous identifier;
		double d = 130;//intializing variable
		System.out.println(d);//130.0
		float fl = (float)d;//explicitly(done by programer)narrowing from double to float
		System.out.println(fl);//130.0
		long l = (long)fl;//explicitly narrowing from float to long
		System.out.println(l);//130
		int i = (int)l;//explicitly narrowing from long to int
		System.out.println(i);//130
		short s = (short)i;////explicitly narrowing from int to short
		System.out.println(s);//130
		byte b = (byte)s;//explicitly narrowing from short to byte
		System.out.println(b);//-126
		//why -126, The byte range in Java is from -128 to 127
		//The value 130 is out of this range.
		//-128,-127,-126,-125.....0........125,126,126 range looks like this
		//to java ko 127 tk range mili fir usne again jaha se value start hue vaha se 3 number aur add kiye
		//because 127+3 = 130 hota hai to mai agr piche or start se consider kro to 
//130th value (127 is 127th value,-128 is 128th value,-127 is 129th value and lastly -126 is 130th value.)
	}
}
