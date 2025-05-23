class StaticAndNonStaticMethodParameter1{
	public static int staticMethod(int a , int b){
		int result;
		return 20;
	}
	public boolean NonStaticMethod(boolean bl){
		int a = 20,b= 10;
		int result = a+b;
		System.out.println(result);
		return true;
	}
	
	public static void main(String [] args){
		StaticAndNonStaticMethodParameter1.staticMethod(2,10);
		int result = StaticAndNonStaticMethodParameter1.staticMethod(2,10);
		System.out.println(result);
		
	StaticAndNonStaticMethodParameter1 obj = new StaticAndNonStaticMethodParameter1();
	obj.NonStaticMethod(true);
	boolean result1 =  obj.NonStaticMethod(true);
	System.out.println(result1);
	}
}