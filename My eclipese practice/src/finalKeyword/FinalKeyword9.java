package finalKeyword;

public class FinalKeyword9 {//initializing using final keyword in parameterised constructor
	
	final int number;
	final char character;
	
	FinalKeyword9(final int a,final char ch){
		number = a;//implementation
		character = ch;//implementation
	}
	public static void main(String[] args) {
		FinalKeyword9 obj = new FinalKeyword9(20,'A');//object creation to call constructor
		System.out.println(obj.character);//call constructor
		System.out.println(obj.number);//call constructor
		System.out.println("**********************");
// obj.charecter = 13;//it gives error The final field FinalKeyword9.character cannot be assigned
		//final keyword cant be reassign
		FinalKeyword9 obj1 = new FinalKeyword9(16,'g');
		//agar naya object banaya to bhi nai value initialize hongi n console me ayengi
		System.out.println(obj1.character);
		System.out.println(obj1.number);
	}
}
