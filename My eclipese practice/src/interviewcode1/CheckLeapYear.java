package interviewcode1;

public class CheckLeapYear {
	public static void checkLeapYear() {// for static
		/* leap year jisme ek din jyada hota hai total days 366 hote hai feb = 29 days
		   jo 4 saal me ek bar aata hai.
		   leap year vo hai jo ek sath 4 se devide ho but 100 se na hot or 400 se devide
		   ho. and agar tino se devid krne ke bad remainder 0 aata hai to leap year hai*/
		int year = 2024;
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {// (||=or),(&&= and)
			System.out.println(year+" is Leap Year");
		} else {
			System.out.println(year+" is Not Leap Year");
		}
	}
	public void checkLeapYear1() {// non staic
		int year = 2009;
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {// (||=or),(&&= and)
			System.out.println(year+" is Leap Year");
		} else {
			System.out.println(year+" is Not Leap Year");
		}
	}

	public static void main(String[] args) {//just to call
		CheckLeapYear.checkLeapYear();// call static method
		CheckLeapYear obj = new CheckLeapYear();// creat object to call non static
		obj.checkLeapYear1();// call non static
	}
}
