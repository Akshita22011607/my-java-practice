package exceptionHandling;






//throws to give warning to method that it can have Exception. and caller means main method need to handle it.throw use to give warning to caller
public class ExceptionHandling12 {//main class
	public static void divisionOfTwo(int a, int b) throws ArithmeticException {//method with parameter  also with throws and type of exception
//static modifier_non-static modifier_return type_method name_(parameter)_throws_class of Exception/types	
		int division = a/b;//opration we have to perform
	}
	public static void main(String[] args) {
		try {//using try block to write abnormal Statement
			ExceptionHandling12.divisionOfTwo(20, 0);//abnormal Statement
		}catch (Throwable e) {//catch use to handle throw/exception
		//parent class should be last class object in catch block or we can give same exception class object to both.
		e.printStackTrace();//stack trace to get details of exception(location,class,exception occurs line number etc)
		//if we dont write Stack Trace it will give finally statemnet and Exeption handle Statement but usning this we can get details info
			System.out.println(e);
		}finally {//exception handle or not it will print statment of own block anyways
			System.out.println("Division cant be possible");
		}
	}
}
