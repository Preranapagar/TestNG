package Tutorial1;

import org.testng.annotations.Test;

public class demo2 {
	
	@Test(priority=1)
	public void logo()
	{
		System.out.println("logo method");
	}
	
	@Test(priority=2)
	public void loginMethod()
	{
		System.out.println("login method");
	}
	
	@Test(priority=3)
	public void alpha()
	{
		System.out.println("alpha methoda");
	}

}
