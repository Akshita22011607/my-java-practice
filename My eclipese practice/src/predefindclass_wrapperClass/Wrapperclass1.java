package predefindclass_wrapperClass;
//Wrapper class is convert primitive to non-premitive and non-pimitive to primitive data type
//primitve to non primitve --> boxing(ham primitve ko wrap kr rahe hai nonprimitve banane ke liye)
//nonprimitive to primitive --> unboxing
public class Wrapperclass1 {
	public static void main(String[] args) {
//primitve data type to non-primitve data type --> Boxing opration
		int a = 25;
		Integer i = new Integer(a);//option 1 boxing explicitly(Integer is wrapper class)n we are creating object 
		System.out.println(i);
		Long i2 = new Long(4565);//option 2 for boxing explicitly ,we can hardcode it as well
		System.out.println(i2);
		
		Double d = 75.36;//option 1 for Boxing implicitly(Double is Wrapper class)
		System.out.println(d);
		int dl1 = 56;//first intitalize double variable
		Integer dl2 = dl1;//option 2.for Boxing implicitly,second give this value to Integer Wrapper Class.
		System.out.println(dl2);
		boolean bl = true;
		Boolean bl2 = Boolean.valueOf(bl); //option 3 for boxing  Implicitly
		// wrapper class name.valueof(ref variable of primitive variable)
		System.out.println(bl2);
		//boolean is a class/Wrapper class and valueOf is a method of boolean class
		Integer l1 = Integer.valueOf(a);
		System.out.println(l1);
		
//non-primitve to primitive data type --> unboxing
		int q1 = i.intValue();//explicit unboxing 
		//primitve data type_ref variable = nonprimitive data tpe.datatypeValue();
		System.out.println(q1);
		double s1 = d.doubleValue();//explicite unboxing
		System.out.println(s1);
		
		boolean bl1 =bl;//implicite unboxing//datatype_variable name = Wrapper class refrance name;
		System.out.println(bl1);
		double f1 = d;
		System.out.println(f1);//implicite unboxing
		
		
		
		
		

	}

}
