package superStatement_keyword;

//super keyword//when we use super keyword it will refer parent class
//Variable n method ke name same hai to vaha differentiate krne k liye super keyword use karenge
class India {// parent class
	long population = 25000;
	double tempratur = 45.36;
	void indiaRanking() {
		System.out.println("2nd ranked all over world");
	}
}
class Pune extends India {// child clas extends parent class
	long population = 5000;
	void punePopulation() {
		System.out.println("Pune population = " + population);// it will print pune population//ans 2
		System.out.println("India population = " + super.population);//ans 3//call variable
		System.out.println("Tempratur ="+super.tempratur);//4th ans call variable
		// due to super keyword yaha se vo directly india/yani parent class ko call
		// krenga na ki child//we can call variable as well as method of child class
		super.indiaRanking();//we can call parent class method//ans 5
	}
}
public class SuperKeyword1 {//main method
	public static void main(String[] args) {
		Pune objP = new Pune();//creat object to call method
		System.out.println(objP.population);// this will print child class population//ans 1
		objP.punePopulation();//call pune class method//this to call member under method
	}
}
