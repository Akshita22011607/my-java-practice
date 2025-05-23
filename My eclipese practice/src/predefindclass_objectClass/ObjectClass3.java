package predefindclass_objectClass;
/*for direct access to main object class just place cursur to equals,toString,hashcode press control
open declairation/implimetation to get direct format of this method for modification later.*/
public class ObjectClass3 {//this is not main object class please not.
	public boolean equals(Object obj) { //equals method with return type
        return true ;
    }
	public int hashCode() {//hashCode method with return type
		return 20;
	}
	public String toString() {//toString method with return type
        return "I Love Music";
	}
	public static void main(String[] args) {
		ObjectClass3 obj = new ObjectClass3();
		System.out.println(obj.equals(obj));//call equals method
		System.out.println(obj.hashCode());//call hashCode method
		System.out.println(obj.toString());//calltoString method 
	}
}
