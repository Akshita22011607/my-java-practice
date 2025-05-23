package conditionStatements;

public class SwitchCaseStatementNew {
	
	public static void main(String[] args) {
		int number = 3;
		
		switch(number) {
		
		case 1:
			System.out.println("1st wala");
			break;
			
		case 2:
			System.out.println("2nd wala");
			break;	
			
		case 3:
			int a = 20, b = 10;
			int result = a+b;
			System.out.println(result);
			System.out.println("3rd wala");
			break;	
			
		case 4:
			System.out.println("4th vala");
			break;	
			
		default:
			System.out.println("invalid number");
			break;
		}
	}
}
