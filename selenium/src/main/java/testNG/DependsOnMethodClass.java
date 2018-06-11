package testNG;

import org.testng.annotations.Test;

@Test
public class DependsOnMethodClass {
	
	@Test
	public  void method1(){
		
		int a=5;
		int b=6;
		int c=a+b;
		
		System.out.println("Method1="+c);
				
	}

@Test(dependsOnMethods="method3")
	public void method2() {
		
		int a=5;
		int b=6;
		int c=a-b;
		
		System.out.println("Method2="+c);
	}
	
@Test(dependsOnMethods="method1")
	public void method3 () {
		

		int a=5;
		int b=6;
		int c=a*b;
		
		System.out.println("Method3="+c);
	
		
	}
	
@Test	
public void method4 () {
		

		int a=5;
		int b=1;
		int c=a/b;
		
		System.out.println("Method4="+c);
	
		
	}
	
}
