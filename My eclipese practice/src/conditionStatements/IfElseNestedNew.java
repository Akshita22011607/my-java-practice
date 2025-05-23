package conditionStatements;

public class IfElseNestedNew {

	public static void main(String[] args) {
		int age = 25;
		
		if (age >=18) {
			if(age <=65) {
				System.out.println("eligible for donation");
			}else {
				System.out.println("you are more than 65 you are not eligible");
			}
			
		}else {
			System.out.println("you are less than 18 thats why you are not eligible");
		}

	}

}
