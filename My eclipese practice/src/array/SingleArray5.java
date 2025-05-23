package array;
public class SingleArray5 {
	public static void main(String[] args) {
		int[] arrInt = new int[5];// declare n instanciated
		// declaration data type[] ref name = new memory int ke liye total 5(new
		// datatype[lenght])
		// total array lengh is 5,n array always starts from 0 thats why 0,1,2,3,4.
		arrInt[0] = 10;// initializing array
		arrInt[1] = 9;
		arrInt[2] = 8;
		arrInt[3] = 7;
		arrInt[4] = 6;
		System.out.println("int array lenght = " + arrInt.length);// lenght of array
//array reverse
		for (int a = arrInt.length - 1; a >= 0; a--) {// for loop
			System.out.print(arrInt[a] + " ");
		}
		System.out.println();// just for space
//array normal output	
		for (int arr : arrInt) {// for each loop
			System.out.print(arr + " ");
		}
		System.out.println();// just for space
//if we dont give any value to array
		double[] arrDouble = {};// declare but not instanciated n initialized
		System.out.println("lenght of double array= " + arrDouble.length);// it will print 0
	}
}
//noraml array can be possible by using for each loop because that was easy
//but for modification of loops or  reverse array we need to use normal for loop
//if we dont assign any value to array it will not show any error it will just print 0 value