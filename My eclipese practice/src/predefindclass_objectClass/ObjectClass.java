package predefindclass_objectClass; 
//predefind classes in java__ object class.
/*to get result of created abject with the help of methods once we creat object has few already 
define methods.main 3 methods,toString(),equals(Object obj),hashCode()*/
class Parent{//class 1
	int a = 125;
}
class Child{//class 2
	char ch = 'A';
}
public class ObjectClass {
	public static void main(String[] args) {
		Parent obj = new Parent();//object 1 of class 1//now we check predefine methods in object
//	(obj.toString)gives result as fully qualified class name along with hexadecimal code
		System.out.println(obj);//1st toString method//implicitly java will add .toString after obj
		System.out.println(obj.toString());//or explicitly also we can write.//both result are same
//  (obj.hashCode)gives result in decimale form,it is decimal form of toString result not diffrence. 		
		System.out.println(obj.hashCode());	//2nd hashCode method//explicitly we have to write
		
		Child obj2 = new Child();//object 2 of class 2//now we check predefine methods in object
		//toString and hashcode method is same for this class n all new class we make
//  (obj.equals(obj2))gives result in boolean form n compare obj1 is equals to object 2 or not
		System.out.println(obj.equals(obj2));//3rd equals method//false bcz its not same object
		
		Parent obj3 = obj;//now i make same object of parent class//object 3 of class 1
//	Parent obj3 = new Parent();//this will be new method if i write it like this. ans will false
		System.out.println(obj.equals(obj3));//true ans because i write parect obj 3 = same as obj
		System.out.println(obj == obj3);//it will print true
/*System.out.println(obj3 == obj2);ans flase but it will show error = Incompatible operand types 
 Parent and Child .untill we iherite means extends parent class to child class this will give error*/
	}

}
