package array;

public class MinAndMaxValueArray {
	public void minOfArray(int[] arr) {
		for (int a = 1; a < arr.length; a++) {
			if (arr[0] > arr[a]) {
				arr[0] = arr[a];
			}
		}
		System.out.println(arr[0]);
	}
	public void maxOfArray(int[] arr1) {
		for (int a = 1; a < arr1.length; a++) {
			if (arr1[0] < arr1[a]) {
				arr1[0] = arr1[a];
			}
		}
		System.out.println(arr1[0]);
	}
	public static void main(String[] args) {
		int[] arrInt = { 8, 6, 4, 3, 7, 1, 9, 2 };
		System.out.println(arrInt.length);// total length is 8
		MinAndMaxValueArray obj = new MinAndMaxValueArray();
		obj.minOfArray(arrInt);// minimus number from array is 2
		obj.maxOfArray(arrInt);//maximum number from array is 9
	}
}
