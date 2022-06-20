package test;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderwithMultidimesionalArray {
	

	
@Test(dataProvider="getData")
public void login(String username, String password) {
	//we will use the data here
	
	System.out.println(username);
	System.out.println(password);
}
/**
 * PARAMETERIZING TEST CASES USING DATAPROVIDER ANNOTATION IN TESTNG
 * @return 
 */
@DataProvider
public Object[][] getData() {
	//use multidimensional object array to store the iteration data
	//two cases for login and 2 iterations
	//1st Valid login - valid username and password
	//invalid login - valid username and password
	//[rowsize][column size] - 2 rows in this case since we are iterating twice
	
	Object[][] data = new Object[2][2];
	data[0][0]="landd";
	data[0][1]="LandD1@access";
	
	data[1][0]="dandd";
	data[1][1]="dddandD1@access";
	return data;
	
}
}
