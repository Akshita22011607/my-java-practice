package globalnlocalpractice;

public class GlobalVariable1 {

//static and non-static globle variable

	/*
	 * Global Variable 1] Static or class variable 2] Non-static or instance
	 * variable How to access these variables 1] static variables a) by using class
	 * name [as per coding standard use class name to access static variable b)
	 * directly by variable name, we can use it in static method c) by using class
	 * object 2] non-static variables a) by using class object
	 */

	// for multiline comment is control+shift+/

	int rollNumber;
	int englishMrak;
	int marathimark;
	int hindiMark;
	static char standardDivision = 'A';

	public static void main(String[] args) {

		System.out.println(GlobalVariable1.standardDivision);

		GlobalVariable1 obj1 = new GlobalVariable1();

		obj1.rollNumber = 22;
		obj1.englishMrak = 96;
		obj1.hindiMark = 86;
		obj1.marathimark = 94;

		System.out.println(obj1.rollNumber);
		System.out.println(obj1.marathimark);
		System.out.println(obj1.hindiMark);
		System.out.println(obj1.englishMrak);

		GlobalVariable1 obj2 = new GlobalVariable1();

		obj2.rollNumber = 16;
		obj2.englishMrak = 86;
		obj2.hindiMark = 96;
		obj2.marathimark = 84;

		System.out.println(obj2.rollNumber);
		System.out.println(obj2.marathimark);
		System.out.println(obj2.hindiMark);
		System.out.println(obj2.englishMrak);

	}

}
