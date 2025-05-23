package loops;

public class DoWhileloop {

	public static void main(String[] args) {
		/*//condition is wrong as we can see
		i>=10 is wrong but i will excecute program atleast one in do while loop*/
		int i = 2;
		do {
			System.out.println(i);
			i = i+2;
		}while(i>=10);

	}
}
