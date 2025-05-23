package thisKeyword_thisStatement;

public class ThisKeyword1 {//this keyword by using parameterized constructor
	
	int number;//declare only
	boolean bl;
	
	ThisKeyword1(int number,boolean bl){//Parameterized constructor
		//in this case you can see global n local variable is same so we can not initialize it 
		//bl=bl;//it will print default value thats why need to diffrential local n global
		this.bl= bl;//this keyword implimentation (global = )
		this.number=number;
		/*in that case will use (this.variable) to initialize variable also helps to 
		diffrentiate local n globle variable,agar this keyword laga hai to vo global 
		keyword rahenga and nahi hai this keyword to local keyword rahenga.*/	
	}
	public static void main(String[] args) {//we call it in main method bcz constructor
		ThisKeyword1 obj = new ThisKeyword1(22,true);//creat object to call constructor
		System.out.println(obj.bl);//call constructor
		System.out.println(obj.number);//call constructor
		System.out.println("*********");
		ThisKeyword1 obj2 = new ThisKeyword1(16,false);//creat object to call constructor
		System.out.println(obj2.bl);//call constructor
		System.out.println(obj2.number);//call constructor
	}
}
