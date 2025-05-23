package exceptionHandling;
//we see what types of exeptions are there basic exeptions.
public class ExceptionHandling1 {
/*important point = do exeption ek sath print nahi ho skte hai,usko first exeption jaise hi milta hai vo 
program hi stop kar deta hai n vahi first exception print karata hai so need to comment 1st to see 2nd exeption*/
	public static void main(String[] args) {
		System.out.println("Program Starts Here");
//********RunTimeException(Unchecked Exception)***********//jo axceptions run hone ke baad pata chalte hai	
		//Example 1 = (Abnormal Statement) agar ham kisi bhi value ko 0 se devide karte hai to it will throw exceptions
	//int a = 10;
	//int b = a/0;//this will give // ArithmeticException
	//System.out.println(b);//Exeption = Exception in thread "main" java.lang.ArithmeticException: / by zero


	//Example 2 = (Abnormal Statement) array ki lenghh se jyada ham index print karne ka try karte hai
	//int[] arr = new int[4];//declare n give memory 4 it means total index is 4 but indexing starts from 0 so,0,1,2,3 total
    //arr[4] = 45;//arr[4] dont exist because lengh is 4 so it will consider arr[0],arr[1],arr[2],last arr[3],dont have arr[4]
	//System.out.println(arr[4]);//Exeption = Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 4
	
	//Example 3 = (Abnormal Statement) String me value null dali means no object n trying to get it lengh
	                     //it is not possible because object is empty.
	//String str = null;//yes we can give null value it will not give any error,because it is keyword which shows 0/empty object
	//System.out.println(str.length());//it is not showing error but it will give exeption
	//System.out.println(str.charAt(0));//Exeption = Exception in thread "main" java.lang.NullPointerException
	  //it will give location of exeption plus line number (at exceptionHandling.ExceptionHandling1.main(ExceptionHandling1.java:23))
	
// *******Compile Time (Checked Exception)*********//jo exeption compile karte samay hi pata chlta hai.//likhate samay hi pata chal jata hai
	//Example 1 = FileNotFoundException
	//FileInputStream fis = new FileInputStream(
		//	"G:\\accelaration class  data nots and recording\\Core Java-shadab sir practice\\Core Java\\Day19\\WhileLoop.java");
	
	// Example 2  = InterruptedException
	//Thread.sleep(5000); // InterruptedException this will give
	}
}
