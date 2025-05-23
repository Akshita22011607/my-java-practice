package exceptionHandling;
//create user define exception for 
public class UserDefineException extends Exception {
	// i want Exception name as UserDefineException which extends property from
	// parent most class of Exception that is exception.
	// if we mouse hover Exception class we get diff constructor calling diffrant
	// value
	// so depend on result you want in console tab you can creat constructor
	// accordingly
	UserDefineException() {// define constructor as per result you want this is black on this will give
							// exception only without Written anything
  //this is non coustamiszed exception msg constructor
	}
	UserDefineException(String str) {// define constructorn with String para to put some String(note) after exception
										// throw
		super(str);//super statemnet need to give at String constructor because in java implicitly zero parameterrized constructor call hota hai.
		// creat this as super most so that if we call we get only this value first
		//this iscoustamiszed exception msg constructor
	}
	public static void main(String[] args) {
		int a = 10, b = 0;// step 1 declare n initialize type of variable where you want to make your own
							// exception
		if (a == 0 || b == 0) {// step 2 while using throw most of the time we use condition statement to throw
								// exception
			// this time we are creating one
			try {
//			throw new UserDefineException();//zero para constructor para will take in this throw
				throw new UserDefineException("we get atleast 1 zero value");// parameterized constructor because we
																				// write para constructor with String
			} catch (UserDefineException e) {
//			System.out.println("Exception handle = "+ e);//Exception handle = exceptionHandling.UserDefineException you are getting this
				// because you are trying to throw () zero parameterrised constructor -> throw
				// new UserDefineException();
				System.out.println("Exception handle = " + e);// exception handle with note bcz we gave para constructor
																// with String value in throw
				// e.printStackTrace();
			}
		}
	}
}
