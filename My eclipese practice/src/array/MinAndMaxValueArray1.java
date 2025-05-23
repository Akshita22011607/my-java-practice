

package array;
//find minimum and maximun value in array using for loop and if condition statremnet
public class MinAndMaxValueArray1 {// main class
	public void minValue(int[] arr) {// non-static method to find minimum value
		for (int a = 1; a < arr.length; a++) {//use for loop
			if (arr[0] > arr[a]) {//then if statemnet if thats true
				arr[0] = arr[a];//work on this and make arr[0] = arr[a]
			}
		}
		System.out.println("minimun value = "+arr[0]);//and print minimum value in array
	}
	public static void maxValue(int[] arr1) {// static method to find maximum value
		for (int i = 1; i < arr1.length; i++ ) {//use for loop
			if(arr1[0]<arr1[i]) {//then if statemnet if thats true
				arr1[0] = arr1[i];//work on this and make arr[0] = arr[a]
			}
		}
		System.out.println("maximum value = "+arr1[0]);//and print minimum value in array
	}

	public static void main(String[] args) {
		int[] arrInt = { 5, 2, 4, 6, 1, 8, 3 };//declare,instatiation and initialization or array
		MinAndMaxValueArray1 obj = new MinAndMaxValueArray1();//creat object to call non static method
		obj.minValue(arrInt);//call non-static method with ref to int arr
		MinAndMaxValueArray1.maxValue(arrInt);//call static method by using class name
	}
}
