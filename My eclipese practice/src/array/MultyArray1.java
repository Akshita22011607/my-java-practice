package array;
//how to declare,initialize,instantiate multy dimensional array
//also how to print lengh of ro and coloum and print value in console in matrix form
public class MultyArray1 {
	public static void main(String[] args) {
//declaration of array//we can declare array in multiple ways please see below
		int[][] arrInt;// int [][]arrInt , int arrInt[][], int[] arrInt[]
//instatiation of array or memory load to array
		arrInt = new int[2][3];// 2 row and 3 coloum //first[] show row ,secong[] shows coloum
//initialization of array,giving values to array
		arrInt[0][0] = 1;// row 1 coloum 1
		arrInt[0][1] = 2;// row 1 coloum 2
		arrInt[0][2] = 3;// row 1 coloum 3
		arrInt[1][0] = 4;// row 2 coloum 1
		arrInt[1][1] = 5;// row 2 coloum 2
		arrInt[1][2] = 6;// row 2 coloum 3
//how to print number of rows of multidimension array//length of row
		System.out.println("Num of ROW = " + arrInt.length);// just like single for horizontal output
//how to print number of columns in each row of array//lenth of coloum
		for (int a = 0; a < arrInt.length; a++) {
			System.out.println("Num of COlOUM = " + arrInt[a].length);}
		// arrint[a]-array (arrInt) with respect to row(a). upto last point(length);
		// this will print number of coloum for 1st row number of coloum for socond row.
//how to print multidimension array	(array values in console)
		for (int a = 0; a < arrInt.length; a++) { // nested loop for ke andar for loop//outer loop for row
			for (int b = 0; b < arrInt[a].length; b++) {// inner loop for coloum
				System.out.print(arrInt[a][b] + " ");// use print only //add space between result
				// print a then b value
			}
			System.out.println();// just to print result in next line after first line complete
		}

	}

}
