package OOPS_3_Encapsulation;

//write only method means only setter method//means sirf result change honga show nahi ham bas set kar skte hai
//need to convert private method to public to accces then only we can use private n need to creat method
//show krne ke liye jo bhi set kiya hai us method ko get method se show karna padenga//ham yaha bus write kr rahe
public class Encapsulation4 {
	private int englishMark = 85;//private variable
	private int hindiMark = 95;//private variable
	private void result() {//private method need to make it public to set or get result
		System.out.println("you are pass");//method busy
	}
	public void setEnglishMark(int englishMark) { /*write only method we are creating this public method just to 
		set some value because private method/variable cant access out side the class*/
		this.englishMark = englishMark;//this keyword just to diffrentiate local n global variable
	}
	public void setHindiMark(int hindiMark) {//write only method we cant see result untill we make getter methiod
		this.hindiMark = hindiMark;//this keyword just to diffrentiate local n global variable
	}
	public void setresult() {//set method for private method we convert it to public just to assign some value
		result();//no nees to give this keyword because identifir of local n global variable is not same or repeat
	}
	public static void main(String[] args) {
		Encapsulation4 obj = new Encapsulation4();
		obj.setEnglishMark(89);//set diff value earlier this is 85
		obj.setHindiMark(91);//set diffrent value earlier this is 95
		//but we cant see result untill we make read only method get method..
		//get method to see result and set method to write or assign or change value.
		//we can see console is blank after run.
	}
}
