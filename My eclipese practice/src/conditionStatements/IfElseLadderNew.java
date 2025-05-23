package conditionStatements;

public class IfElseLadderNew {

	public static void main(String[] args) {
		int mark = 85;
		
		if (mark>=85) {
			int a =15,b=15;
			int result = a+b;
			System.out.println(result);
			System.out.println("distiction");
		}else if(mark<85 && mark>=75) {
			System.out.println("first class");
		}else if (mark <75 && mark>=65) {
			System.out.println("second class");
		}else if (mark <65 && mark >=35) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
	}

}
