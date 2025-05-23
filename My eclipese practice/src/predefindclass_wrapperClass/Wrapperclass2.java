package predefindclass_wrapperClass;

public class Wrapperclass2 {

	public static void main(String[] args) {
//primitive to nonprimitive --> boxing
		int a = 20;
		Integer a1 = new Integer(a);//explicit boxing
		System.out.println(a1);
		Integer a2 = new Integer(25);//explicit boxing
		System.out.println(a2);

		int b = 25;
		Integer b2 = b;//implicit boxing
		System.out.println(b2);
		Double d = 63.35;//implicite boxing
		System.out.println(d);
		Double d1 = Double.valueOf(b);//implicite boxing
		System.out.println(d1);
		
//nonprimitive to primitive --> unboxing
		int s1 = b;//implicit unboxing
		System.out.println(s1);
		double s2 = d;
		System.out.println(s2);
		
		int dh = a1.intValue();//explicit unboxing
		System.out.println(dh);
		
		double dh1 = d.doubleValue();
		System.out.println(dh1);
	}

}
