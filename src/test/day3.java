package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day3 {

	@Test
	public void Demo3(){
		System.out.println("Using test NG");
	}
 @Test(groups= {"smoke"})
 public void Demo4() {
	 System.out.println("TestNG Annotations");
 }
 
 @BeforeMethod
 public void runbeforeanymethod() {
	 System.out.println("I will run before method");
 }
 
 @AfterMethod
 public void runaftermethod() {
	 System.out.println("I will run after method");
 }
 
 @AfterClass
 public void runafterclass() {
	 System.out.println("running after class");
 }
}
