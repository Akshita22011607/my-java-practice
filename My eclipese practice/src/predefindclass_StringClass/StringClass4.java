package predefindclass_StringClass;
//create string class object by using literals  and new keyword n print its hashcode value.
//diffeantiate how litrals and new keyword load in memory n creat object.
public class StringClass4 {
	public static void main(String[] args) {
		String str = "Pune";
		System.out.println(str.hashCode());
		String str1 = "Pune";
		String str2 = new String("Pune");
		String str3 = new String("Mumbai");
		String str4 = "Mumbai";
		String str5 = new String("Chennai");
		str = "Bangalore";
		System.out.println(str.hashCode());
		
		System.out.println("*********");
		String s1 = "Nasik";
		System.out.println(s1.hashCode());
		String s2 = "Nasik";
		System.out.println(s2.hashCode());
		
		System.out.println("*********");
		s2 = "Nagpur";
		System.out.println(s2.hashCode());
		System.out.println(s1.hashCode());

		System.out.println("#############");
		String s3 = new String("Surat");
		String s4 = new String("Surat");
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		s4 = "Manali";
		
		System.out.println("#############");
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		String s5 = new String("nagpur");
		String s6 = new String("nagpur");
		System.out.println(s5.hashCode());
		System.out.println(s6.hashCode());
		
	}
}

