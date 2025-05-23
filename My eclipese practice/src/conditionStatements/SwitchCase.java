package conditionStatements;

public class SwitchCase {
	public static void main(String[] args) {
			int month = 4;
			
			switch (month) {
			case 1:
				double a=10,b=20;
				double result = a+b;
				System.out.println(result);
				System.out.println("i am case 1");
				System.out.println("january");
				break;
				
			case 2:
				System.out.println("feb");
				break;
				
			case 3:
				System.out.println("march");
				break;
			case 4:
				int c=110,d=220;
				double result1 = c+d;
				System.out.println(result1);
				System.out.println("april");
				//break hatha diya to ye vala plus uske bad valla result print honga
			case 5:
				System.out.println("may");
				break;
			}
	}

}

