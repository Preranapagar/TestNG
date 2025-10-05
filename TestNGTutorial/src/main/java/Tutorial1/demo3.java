package Tutorial1;

import org.testng.annotations.Test;

public class demo3 {
	
	@Test(priority =1 )
	public void logo()
	{
		System.out.println("Logo methoda");
	}
	
	@Test(priority = 2, invocationCount=3, timeOut =5000)
	public void validateHomeLog()
	{
		System.out.println("Validate test cases");
	}
	
	@Test (priority = 3, invocationCount=5)
	public void addEmployee()
	{
		System.out.println("add employee test cases");
	}
	

}
