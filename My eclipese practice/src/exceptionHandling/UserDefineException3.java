package exceptionHandling;
//2nd way to give custemised String/note
//create user define exeption without handling it


//we can handle by using try cathch but in this case we are just seeing how many types to write user define exeptions
public class UserDefineException3 extends RuntimeException {
	UserDefineException3(){//zero parameterised constructor
		System.out.println("This is not customised message ");
		//Exception will print this String n it will not change
		//and we dont not give any String/note parameter to throw statemnt
	}
	public static void main(String[] args) {
		int a = 0, b = 20;
		if(a == 0 || b == 0) {
			throw new UserDefineException3(); 
		}
	}
}
