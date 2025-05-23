package interviewCode2;

public class HalfPyramidStar {
	public void halfPyramidUsingStar() {//standerd coading using method//non static method
	int row = 5;//want 5 row
	for(int a = 0; a <= row ; a++) {//outer loop for number of row ex=5
		for (int j = 0;j<=a;j++) {//inner loop to print start
			System.out.print("*");//want to print star//we can give space between star("* ") star n then space
	//agar print ke bajaye println lete to ek ke niche ek aate means lines se star ate 
			//println us krte to vo line break kr deta hai n print likhte tb ek line me print aata hai
		}
		System.out.println();//ye nahi diya rehta to star sare ek line me aate row me nahi
		/*upr me print dene se console me result ek line me ayenge usko break krne ke liye inner for loop
		ko close krke out for loop me bus syystem.out.println(); likha taki line break ho*/
	 }
	}
	public static void main(String[] args) {//main method
		HalfPyramidStar obj = new HalfPyramidStar();//creat object to call method
		obj.halfPyramidUsingStar();//call method to print half pyramid
	}
}
