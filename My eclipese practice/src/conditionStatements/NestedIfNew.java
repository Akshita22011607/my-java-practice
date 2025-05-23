package conditionStatements;

public class NestedIfNew {

	public static void main(String[] args) {
		int age = 25;
		
		if (age >=18) {
				if (age>=18 && age<28) {
					System.out.println("you are 40% eligible for donation");
				}
				if(age>=28 && age <38) {
					System.out.println("you are 100% eligible for donation");
				}
				if(age>=38 && age <48) {
					System.out.println("you are 60% eligible for donation");
				}
			}
		}

}
