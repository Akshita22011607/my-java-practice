package predefindclass_StringClass;

public class AddSpaceBeforeUpperCase2 {
	public void addSpace(String s1) {
		String addSpaceBeforUppercase = "";
		for(int a= 0;a<s1.length();a++) {
			char ch = s1.charAt(a);
			
			if(Character.isUpperCase(ch)&& ch !=0) {
				addSpaceBeforUppercase = addSpaceBeforUppercase+" ";
			}
			addSpaceBeforUppercase = addSpaceBeforUppercase+ch;
		}
		System.out.println("Add Space = "+addSpaceBeforUppercase);
	}

	public static void main(String[] args) {
	String s1= "IAmInLoveWithYou";
	System.out.println("Original String = "+s1);
	
	AddSpaceBeforeUpperCase2 obj = new AddSpaceBeforeUpperCase2();
	obj.addSpace(s1);
}
}