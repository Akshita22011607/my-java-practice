
package predefindclass_systemclass;
public class SystemClass2 {

	public static void main(String[] args) {
		System.out.println("Akshita");
		System.err.println("Akshita");//i will always print first line of console tab
		System.out.println();
		System.out.println("we can get System class methods");
		System.out.println(System.getProperty("user.home"));//kaha save hai
		System.out.println(System.getProperty("user.dir"));//kis location me hai
		
		System.out.println(System.getProperty("java.version"));//to know java version
		System.out.println(System.getProperty("java.vendor"));//owner of java language
		System.out.println(System.getProperty("java.class.version"));//java version
		System.out.println(System.getProperty("java.compiler"));
		System.out.println(System.getProperty("os.name"));//windows verson
		System.out.println(System.getProperty("os.version"));//windows version
		System.out.println();
		System.out.println("we can set System class methods");
		System.setProperty("user.name", "Akshita Meshram");//key plus input//set menas change
		System.out.println(System.getProperty("user.name"));//key passkarenge to get value
		System.setProperty("user.country", "INDIA");//set user country
		System.out.println(System.getProperty("user.country"));//get use country
		
		System.out.println(System.nanoTime());//to get system time in nonosecond
		System.out.println(System.currentTimeMillis());//get time in milisecond
	}
}
