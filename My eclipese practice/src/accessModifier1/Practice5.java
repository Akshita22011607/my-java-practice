package accessModifier1;//i want to import here
//i want to access only this class from this package to another package not all classes
//using fully qualified name jo call karte vkt likhna padta hai.
//example package name.class name_jo method ko call karna hai
public class Practice5 {

	public static void main(String[] args) {
		accessModifier2.Practice4.addition(10, 10);//for static
//we can see we access statice method from another package class to this pack class
//using fully qualified name packagename.classname.method(){}for static
		accessModifier2.Practice4 obj = new accessModifier2.Practice4();//creat object
		obj.akshita2();//call object
		//fully qualified_name obj = new fullyqualified_name();
		//fully qualified name means (package_name.class_name)//for nonstatic
		
	}
}
