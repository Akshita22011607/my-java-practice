package varargs_VariableArguments;

//variable arguments for diffrent data type
//those are declared in method need to pass value of this while calling
//last one varargs is optional as well as we can pass multiple values after mandatory values
public class VariableArguments2 {
	public void additionOfNum(int a,float b , long c,double ...d) {
		
	//add multiple variable but those who are declared need to call in method and last one with ... is optional.
	//also we can add multiple double value to perform but those who are declaired need to call or need to pass value ,int,float,long= mandatory
		double sum =a+b+c;//we always pass empty value to perform opration n strore value in it
		//now we have multiple variavle to do sum thats why need to add all in sum value n that values are fixed one
		
		for (int i =0; i<d.length;i++) {//for perforning addtion need to make loop of varargs (double variable)
			sum = sum+d[i];//add double value in sum --> sum = (a+b+c)mandatory + d(if given or optional also in n numbers)(multiple values of d)
		}
		System.out.println("Addition = "+ sum);//print sum to get output
	}
	public static void main(String[] args) {
		VariableArguments2 obj = new VariableArguments2();
		System.out.println("Addition of all four method calling");
		obj.additionOfNum(10, 10.01f,65,20.25);//we want all four
		obj.additionOfNum(2, 21.02f,235);//want mandatory one dirst three declared on is mandatory to pass value
//		obj.additionOfNum(8,25.36f);//cant write this it will throw error that missing long c field because we gave int and float,madatory 1st 3
		obj.additionOfNum(10, 2.02f, 2, 10.0,2.02,3.36,4.04);//we can add mutile values od double because of varargs ...(n)number
		obj.additionOfNum(10, 2.02f, 2, 10.0);//we can skip last double value as it is optional but need to pass first three as it is declared
	}

}
