package finalKeyword;

public class FinalKeyword2 {//initialize n declare in different line

	public static void main(String[] args) {
		//agar mene bas final keyword ko declare kiya intialize nahi to usko final black keyword bolte
		final double marks;//this is final black keyword
		marks = 235.36;//can be Initialized only once
		System.out.println(marks);//print
		
	//	marks = 365.33;
	//if we want to initialized again it will show error n says final local variable marks already assigned
	}
}
