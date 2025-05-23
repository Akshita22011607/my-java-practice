package exceptionHandling;




//extends RuntimeExeptions so that it will complile n give Exception in console
//if i write Exception we need to handle it first because indicates compile/Checked exception
public class UserDefineException2 extends RuntimeException {
//public class UserDefineException2 extends RuntimeException {this will give error n throw compile time Exception
	//if i print run time exception in that case error will not occure while throw statemnt
	//it indicates we are throwing uncheck/run time exception
	//if i write extends Exception in that case we need to handle exception using try catch method
	UserDefineException2(String str) {//parameterised constructor with String parameter
		super(str);//explicitly call this constructor
	}
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int sum = a + b;
		if (sum > 10) {//this if statement shoul be true.
				throw new UserDefineException2("This is not customised message");//throw_new_userdefine name("Note/discription");
				//we can chnage it multiple times
				//in this class we just throw exception not handle it.
		}
//compile time /checked Exception need to handle in program only it can not run n print exception in console tab
//run time/unchecked exeption no neew to handle it for execution it will directly print exeption in console tab.		
	}
}
