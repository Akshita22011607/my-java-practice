package OOPS_3_Encapsulation;
//read n write both
public class Encapsulation2 {
	private int akshita = 10; 
    private double akash = 10.25;
    

	public int getAkshita() {//read only
		return akshita;
	}
	public void setAkshita(int akshita) {//write only
		this.akshita = akshita;
	}
	public double getAkash() {//read only
		return akash;
	}
	public void setAkash(double akash) {//write only
		this.akash = akash;
	}
	public static void main(String[] args) {
		Encapsulation2 obj = new Encapsulation2();
		System.out.println(obj.getAkshita());//just to see result what we have given in class
		System.out.println(obj.getAkash());//read only
		obj.setAkshita(22);//change akshita value
		System.out.println(obj.getAkshita());//get akshitas updated value now we can see 
		obj.setAkash(16.00);//change akaksh value but we cant see untill we call it get it using get method
		System.out.println(obj.getAkash());//get akash updated value
	}

}
