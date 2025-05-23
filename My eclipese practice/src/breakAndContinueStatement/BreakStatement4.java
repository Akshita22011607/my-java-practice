package breakAndContinueStatement;

public class BreakStatement4 {

	
		public static void main(String[] args) {
			// loop ke andar loop then break statement
			// type 2nd. use break statement for outer(1st) loop

			for (int a = 0; a <= 4; a++) {
				if (a == 2) {
					break;//isne outer loop ko break kiya n value bas 2 bar print ki
				}
			
				for (int b = 0; b <= 6; b++) {
					System.out.println(b);//b ko break nahi kiya is liye usne 0 se 6 pura console me print kiya
					}
				}
			}
	}

