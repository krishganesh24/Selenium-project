package week6homework;

public class StaticandNonStatickeyword {

	static String var1="Hello";
	String var2 = "World";

	public static void main(String[] args) {
		StaticandNonStatickeyword a = new StaticandNonStatickeyword();
		a.method2();
		method1();
	}

	

	public static void method1() {

		StaticandNonStatickeyword a = new StaticandNonStatickeyword();
		System.out.println(var1+a.var2);
	}


	private  void method2() {

		System.out.println(var1+var2);

	}



	


}
