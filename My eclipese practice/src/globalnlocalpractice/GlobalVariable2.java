package globalnlocalpractice;

public class GlobalVariable2 {

	static char towerNumber = 'A';
	static long myPayment = 150000;
	int empIdentity = 2201;
	byte myRank = 2;
	short deskNumber = 16;

	public static void main(String[] args) {

		System.out.println(GlobalVariable2.towerNumber);
		System.out.println(GlobalVariable2.myPayment);

		GlobalVariable2 obj3 = new GlobalVariable2();

		System.out.println(obj3.empIdentity);
		System.out.println(obj3.deskNumber);
		System.out.println(obj3.myRank);

	}
}

class GlobalVariable3 {

	static char towerNumber = 'B';
	static long myPayment = 250000;
	int empIdentity = 1607;
	byte myRank = 1;
	short deskNumber = 22;

	public static void main(String[] args) {

		System.out.println(GlobalVariable3.towerNumber);
		System.out.println(GlobalVariable3.myPayment);

		GlobalVariable3 obj4 = new GlobalVariable3();

		System.out.println(obj4.empIdentity);
		System.out.println(obj4.deskNumber);
		System.out.println(obj4.myRank);

	}
}
