package Step_definations;

import Base.base;
import io.cucumber.java.After;

public class Hooks extends base{
	
	@After("@GreencartTesting1")
	public void after()
	{
		driver.quit();
	
	}
	

}
