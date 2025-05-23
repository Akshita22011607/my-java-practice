package nestedAndAnonymusClass;
//nested  or inner class(class ke andar class with name)
public class NestedClass {//outer class//onlu public n default
	static class Example1{//nested or inner class//we can give all non access modifier like abstract,final
		//it can have static - non access modifier	
		//nested classes can have its own methods n variable
	}
    private class Example2{//nested or inner class//can have all 4 access modifier 
    	//it can have private -  access modifier
	}
    protected class Example3{//nested or inner class//can have all 4 access modifier 
    	//it can have protected -  access modifier
	}
    public class Example4{//nested or inner class//can have all 4 access modifier 
    	//it can have protected -  access modifier
    	public void AdditionOfTwo() {//create method in nested class and declare n initialize values n give opration
    		int a = 10,b = 20;
    		int addition = a+b;
    		System.out.println("Addition of Num = "+addition);
    	}
	}
	public static void main(String[] args) {//how to call nested method in main method
		NestedClass obj = new NestedClass();//1st .creat object of outer class
		NestedClass.Example4 obj1 = obj.new Example4();//2nd .create object of nested class using outer class and outer class refrance object
		//outerclassname.innerclass_refObject = refObjectOfOuterClass.new_innerclass(); 
		obj1.AdditionOfTwo();//call method
	}
}
