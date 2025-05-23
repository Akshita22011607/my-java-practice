package array;
//for multi dimensional array row me number of column can be change
public class MultyArray2 {
//declare,instatiation n initialization is diffrant but  rest working is same as matrix array
	public static void main(String[] args) {
//declare,instantiated,initialize in same line.
		//datatype [][] array name = {{row 1},{row 2},{row 3}};
		int[][] arrInt = {{1,2,3},{4,5},{6,7,8,9}};//this uneven column initialize like this only
//row 1 column 3,row 2 column 2 row number 3 column 4
/*we can not perform this program with the help of separate inputs menas declare,initialization
in diff lines we have to give line line inputs to achive differant number of column in each row*/
		
//for number of row//to get length of row
		System.out.println("Num of row = "+arrInt.length);//3 rows//number of row
		
//for number of column//to get length of column
		for(int a = 0; a<arrInt.length;a++) {
			System.out.println("Num of Column = "+ arrInt[a].length);//columns in each row
		}
//print value of multidimentional array
		for (int a = 0;a<arrInt.length;a++) {//outer loop for row
			for (int b = 0;b<arrInt[a].length;b++) {//inner loop for column
				System.out.print(arrInt [a][b]+ " ");//print column with respect to row
			}
			System.out.println();//add space between result n shift next result to next line
		}
	}
}
