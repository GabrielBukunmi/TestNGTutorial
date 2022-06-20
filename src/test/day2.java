package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day2 {

	@Test(groups= {"smoke"})
	public void Demo2(){
		System.out.println("Using test NG");
	}
 
	@AfterTest
	public void lastexecution() {
		System.out.println("I will execute last after first test");
	}
}
