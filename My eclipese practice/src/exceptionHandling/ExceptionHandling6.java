package exceptionHandling;
//try,catch and finally in one file
//see working of all three catch,try n finally
//finally block bas ek bar use kar skte hai
//for catch we can have multiple catch
public class ExceptionHandling6 {
	public static void main(String[] args) {
		int a =10;
		try {
			int b = a/0;//this is false because we cant devide anuthing with 0
		}catch (ArrayIndexOutOfBoundsException e) {//we cant use array exception n still throw exeption//or you can write parent object here
			System.out.println(e);//if i dont write second catch it will throw error 
			
		}catch (ArithmeticException e) {//if i write correct way for correct Exception to handle//also you can directly write parect object here
			System.out.println(e);//so it will give console Exeption handle value.
		}finally {//finally will anyway write whats written here without checking Exception handle or not
			System.out.println("Exception is handle");//exception handle or not this will print console value or execute statements under finally
		}
//if i give multiple try,catch,finally this will also print finally value.
		String str = null;
		
		try {
			System.out.println(str.length());//which is false because value is nulll n object value is empty
		}catch(ArithmeticException e) {/*this is false because it will throw NullPointerExeption not ArithmeticException means it does not found
			perfect way to handle this exception*/	
			System.out.println(e);
		}finally {//exception not handle still it will print whatever written in print statemnet.
			System.out.println("Exception not handle by this catch block");
//now we can see in console,we can print finally value for any try catch block wheather Exception handle or not
		}
	}
}
