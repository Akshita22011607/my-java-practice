package array;
import java.util.Arrays;
//we can creat object of array
//you need to make sure object should be on same class
class Example{//just to creat new example	
}

public class ObjectOfArray {
	public static void main(String[] args) {
	//	creat object by using class name
		ObjectOfArray obj = new ObjectOfArray();
		ObjectOfArray obj1 = new ObjectOfArray();
		ObjectOfArray obj2 = new ObjectOfArray();
		ObjectOfArray obj3 = new ObjectOfArray();
	//almost same as data type[] arraymane = new datatype[];
	
	//ObjectOfArray  will be the data type of array
	//class name will be the data type of array because we took referance of class to creat object
	//objectOfArray[] by adding [] it indicates i are doing array,multiple input
	//datatype[] refname = {_,_,_etc}; //declare,instantiation,initialization of array	
		ObjectOfArray[] arr = {obj,obj1,obj2,obj3};
		//it will print fully qualified name @hexadecimal code in string form[_,_,_,_]
		System.out.println(Arrays.toString(arr));
//[array.ObjectOfArray@7852e922, array.ObjectOfArray@4e25154f, array.ObjectOfArray@70dea4e etc]
		
	//for Example class
		Example objE = new Example();//creat object
		Example[] arr1 = new Example[6];//declare and instantiation of Example array
	}
}
