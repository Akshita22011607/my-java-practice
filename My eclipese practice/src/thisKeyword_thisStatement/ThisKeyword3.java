package thisKeyword_thisStatement;

public class ThisKeyword3 {//call different method to diffrent method by using this keyword'
	
	int accountNumber;//declare variable
	double accountBalance;
	
	void display(int a,double b) {//method parameterized method because we need to initialize variable
		accountNumber = a;//implementation of variables
		accountBalance = b;	
		this.displayAccountNumber();//to call method to print account number
		this.displayAccountBalance();//to call method to print balance
	}
	void displayAccountNumber() {//create method to call balance i want it separate//method 1
		System.out.println("Account Number ="+accountNumber);//i want this in console
	}
	void displayAccountBalance() {//create method to call balance because i want it seprate//method 2
		System.out.println("Account Balance ="+accountBalance);//want to display this in console
		//but if i run file without this keyword it will not write anything in console
	}
	
	public static void main(String[] args) {
		ThisKeyword3 obj = new ThisKeyword3();//creat object to initialize value
		obj.display(526, 25698.36);//call method n initialize values 
	}
}
