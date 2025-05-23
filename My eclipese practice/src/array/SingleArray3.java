package array;
//sigle diamensional array declaration, instantiation and initialization in diffrent line.
//just to print lengh and values of array//for each loop
public class SingleArray3 {
	public static void main(String[] args) {
		int[] arrInt = new int[3];// declare n instantiation/memory load of array
		// array lengh is 3 and array starts from 0 thats why 0,1,2 total 3.
		arrInt[0] = 20;// intialization of first value
		arrInt[1] = 30;// initialization of second value
		arrInt[2] = 40;// initialization of third value
		System.out.println("lengh of array = "+arrInt.length);// just to print ;lengh.
		// for each loop syntax
		// for (dataType variable : arrayName) {
		// Code to be executed//body of loop//statements}
		for (int arr : arrInt) {// arr or you can give any name it is just as new identifier of array
			// System.out.println(arrInt); it you print this it will give hexadecimal code
			// ex- [I@7852e922
			// System.out.println(arr); we can write this but it will print result in
			// diffrent lines one by one
			System.out.print(arr + " "); // best method
			// write print only so that line should not break n next result sould not print
			// on next line
			// plus add space after that to add space between value of array
			
			//using for loop we can print array value but for each loop is much easier
			for(int a = 0; a<arrInt.length;a++) {
				System.out.print(arrInt[a] + " ");
			}
			System.out.println();
		}
	}
}
