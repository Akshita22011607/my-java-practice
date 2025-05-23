package array;
//declaration, instantiation (memory allocation) and initialization in same line
//this way to assign value to variable is easy than seprate seprate one
public class SingleArray4 {

	public static void main(String[] args) {
		//datatype[] refreancename = {1,2,3,4,5,6...so on};
		double[] arrDouble = { 25.36, 25.25, 21.36, 85.14, 44.65 };//array define in same line
		System.out.println("lengh of array = " + arrDouble.length);//to call lengh of array

		//for each loop easy to use
		for (double array : arrDouble) {//(datatype refrencename = arrayname)
			System.out.print(array + " ");//call array add space between result
		}
		
		System.out.println();//just to add space between two result

		//for loop bit complex to use in array 
		for (int a = 0; a < arrDouble.length; a++) {//(declare,condition,opration);
			System.out.print(arrDouble[a] + " ");//call array add space between result
		}
	}
}
