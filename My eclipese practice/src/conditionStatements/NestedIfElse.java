package conditionStatements;

public class NestedIfElse {
	public static void main(String [] args) {
		//not ansked 
		int age = 28;
		
		if (age<= 65) {
			if (age >=18 ) {
				System.out.println("you are eligible for vaccine");
			}else {
				System.out.println("your age is below 18 thats why you are not eligible");
			}
		}else {
			System.out.println("your ahr is more than 65 thats why you are not eligible");
		}
	}

}
