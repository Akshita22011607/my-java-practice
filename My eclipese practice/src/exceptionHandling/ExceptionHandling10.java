package exceptionHandling;
import java.util.Scanner;//need to import package for scaneer
public class ExceptionHandling10 {
		public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);//scanner class object
			System.out.println("Enter number1");
			int a = scn.nextInt();//declare value 
			System.out.println("Enter number2");
			int b = scn.nextInt();
//			throw new Throwable("Hello");
			if (a == 0 || b == 0) {//giving condition to scanner
				throw new NumberFormatException("Hello");//throw i want in console idfmcondition meets
//				throw new RuntimeException("Since any of the number is zero");
			}
	/*	//we can use try catch  in throw exeption but we dont need to us it because already we are giving throwing exception
				try {
					int i = 5 / 0;
				} catch (ArrayIndexOutOfBoundsException e) {
				} finally {
				}
			} catch (Throwable e) {
				try {
				} catch (Throwable h) {
				} finally {
				}
			}
		*/	
			System.out.println("***************");
			System.out.println("Program ends here");
			scn.close();
		}
	}
