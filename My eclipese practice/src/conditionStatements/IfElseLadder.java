package conditionStatements;

public class IfElseLadder {

	public static void main(String[] args) {
		
		int mark = 55;
		
		if(mark>=75) {
			System.out.println("Distinction");
		}else if (mark <75 && mark >=65) {
			System.out.println("First class");
		}else if (mark<65 && mark >=55) {
			System.out.println("second class");
		}else if (mark<55 && mark >=45) {
			System.out.println("Third class");
		}else if(mark<45 && mark >=35) {
			System.out.println("Pass");
		}
		
		else {
			System.out.println("fail");
		}

	}

} 
