package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day4 {

	@Test(groups= {"smoke"})
	public void demo6() {
		System.out.println("just a few test cases can be run using groups in all the methods");
	}
	
	@Test
	public void method1() {
		System.out.println("This is the first method");
	}
	
	@Test
	public void method2() {
		System.out.println("this is the second method");
	}
	
	@Test(dependsOnMethods= {"method1","method2"}) //this means methods 1 and 2 would run before method3
	public void method3() {
		System.out.println("this is the third method");
	}
	
	/**
	 * YOU CAN ALSO ENABLE OR DISABLE A TEST  USING ENABLE=TRUE OR FALSE
	 */
	@Test(enabled=false)
	public void method4() {
		System.out.println("This would not run because it is the disabled");
	}
}
