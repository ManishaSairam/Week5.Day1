package assignmentweek5.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGAttributes {
	
	@Test(priority=0)
	public void mathsMark(){
		System.out.println("Maths Mark is 90");
		
	}
	
	@Test(priority=1)
	public void engMark() {
		System.out.println("Eng mark is 85");
		Assert.fail();
		
	}
	
	@Test(priority=2, enabled=true)
	public void sciMark(){
		System.out.println("sci mark is 100");
	}
	
	@Test(priority = 3, dependsOnMethods = "engMark", alwaysRun=false)
	public void socMark()
	{
		System.out.println("soc mark is 80");
	}

	@Test(priority = 4, invocationCount = 2, threadPoolSize = 3)
	public void testNGSite()
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		System.out.println(driver.getTitle());
		driver.close();
	}


	

}
