package thisKeyword_thisStatement;

public class ThisStatement3 {
	ThisStatement3(int a,boolean bl){//step 4 yaha aane ke bad vapas condition check karenga
		this('A',2356.36);//step 5 to yaha usko char vali value mili fir vo char me jayenga
		System.out.println("boolean n int constructor");//step 8 fir 2nd last yaha aaya to ye value print kiya
	}
	ThisStatement3(char ch,double d){//2nd constructor//step 6 ab vo last me char me aaya iske bad kuch nahi hai
		System.out.println("char n double constructor");//step 7.is liye first value vo char n double lenga
	}
	ThisStatement3(float fl,long l){//step 2 yaha float me aake usne execution shuru kiya
		this(12,true);//step 3 jisme usko int value mili to execution ab int me jayenga
		System.out.println("float n long constructor");//step 9 then last me console me ye print honga
	}
	
	public static void main(String[] args) {
		ThisStatement3 obj = new ThisStatement3(52.36f,22232);//step 1 object creat hua usko float value mili
		//but it will call first char then boolean n then last float according to execution
	}
}