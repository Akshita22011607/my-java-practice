package exceptionHandling;
//write multiple catch block for single try block




//we can write but the main rule is child object should be first n parect object should be last.
//parent object = Throwable, child object = run time,Exception,Arithmatic,arrayoutofbond,nullPointer
public class ExceptionHandling5 {
	public static void main(String[] args) {
		int[] arr = new int[3];//declare and instantiate(memory load) to array
		    //lengh is 3 means last index is [2],arr[0],arr[1],arr[2],indenxing Starts from 0
		try {
			arr[4] = 22;//ArrayOutOfBound Exception because last index given is arr[2]
		}catch(ArithmeticException e ) {//this is child most object Example =  child 1
			System.out.println("Exception handle 1 = "+e);//but this is not abnormal Statemnet for array thats why skip this object n jump to next
		}catch(ArrayIndexOutOfBoundsException e ) {//this is child most object Example =  child 2
			System.out.println("Exception handle 2 = "+e);//here it gets Exact Exception handling for array thats why print this object on console
			e.printStackTrace();//print stack trace method to write full details of exception
		}catch(Exception e) {//this is parent of child most Example = parent 1 
			System.out.println("Exception handle 3 = "+e);//if child 2 not writen here  it will print this object on cconsole
		}catch(Throwable e) {//this is parent most object of all Example = Grandfather 1
			//father most object catch block should be last statement
			System.out.println("Exception handle 4 = "+e);//this will work for all Exception because this is parent most can handle all Exception
		}
	}
}
