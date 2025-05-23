
class StaticAndNonStaticMethodParameter{
	public static void staticMethod(int a , int b){
		int result = a+b;
		System.out.println(result);
	}
	public void nonStaticMethod(int a ,int b){
		int result1 = a-b;
		System.out.println(result1);
	}
	
	public static void main(String[] args){
		//static 
		StaticAndNonStaticMethodParameter.staticMethod(20,35);
		
		//nonstatic
		StaticAndNonStaticMethodParameter obj = new StaticAndNonStaticMethodParameter();
		obj.nonStaticMethod(40,4);
		
	}
}