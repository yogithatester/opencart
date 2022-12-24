package listeners1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo2 {
	@Test
	public void abc()
	{
		Assert.assertEquals(12, 12);
	}
	
	
	@Test(dependsOnMethods = {"abc"})
	public void pqr()
	{
		Assert.assertEquals("Gmail", "Selenium");
	}
	
	@Test(dependsOnMethods = {"pqr"})
	public void xyz()
	{
		Assert.assertEquals("Jenkins", "Jenkins");
	}
	

}
