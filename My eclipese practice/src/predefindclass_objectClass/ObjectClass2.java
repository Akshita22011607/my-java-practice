package predefindclass_objectClass;
//we can override predefine object methods in java
//to give explicit predefine method of object class just to override existing implicite predefine methods
//because it is giving result referance to object but i want to print result which return by me.
//ex.hashCode me decimal me result aata hai vo nahi chaiye mujhe mera diya gaya result chaiye.
//@Override is the tag, use to denote that method is overridden
public class ObjectClass2 {//main class
	@Override // it is just like like comment to indicate this method is overrided no input in result
	public String toString() {//toString ki value String me aati hai char me nahi thats why string.
		return "Akshita";//i want to print this string in my console rather than @7852e922
	}
	@Override // it will not make any changes just for annotation/remark .it is just like like comment
	public int hashCode() {//hashcode ka result decimal me ata hai thats why only int value(only int data type)
		return 150;//i want to print this int value rather than object decimal value for hashcode
	}
	@Override //use of this . it is just like like comment to indicate this method is overrided no use of this
	public boolean equals(Object obj) {//equals ka result boolean me aata hai thats why return type is boolean
		return false;//if obj1 is equals to obj2 still i want to print this equals false value
	}

	public static void main(String[] args) {
		ObjectClass2 obj = new ObjectClass2();//creat object
		System.out.println(obj.toString());//call method to get updated/overrided value not in hezadecemal value
		System.out.println(obj.hashCode());//call method to get updated/overrided value not in decimal
		
		ObjectClass2 obj2 =  obj;
		System.out.println(obj2.equals(obj));//call method to get updated/overrided value not in boolean.
	}
	//by using this overrided method we can restrict default method n print value as per we want.
	
	
}
