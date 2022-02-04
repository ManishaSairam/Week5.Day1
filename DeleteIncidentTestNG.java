package assignmentweek5.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteIncidentTestNG {
	@Test
	public void deleteIncident() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev111419.service-now.com/nav_to.do");
		driver.switchTo().frame("gsft_main");
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("HqwQhwR2F0Na");
		driver.findElement(By.id("sysverb_login")).click();
	    driver.findElement(By.id("filter")).sendKeys("Incident", Keys.ENTER);
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//a[@id='b55b4ab0c0a80009007a9c0f03fb4da9']//div[text()='All']")).click();
	
	driver.switchTo().frame("gsft_main");
	
	driver.findElement(By.xpath("//span[contains(text(),'search')]/following-sibling::input"))
	.sendKeys("INC0010048",Keys.ENTER);
	
	driver.findElement(By.xpath("//td[@class='vt']/a[1]")).click();

	driver.findElement(By.id("sysverb_delete")).click();
	Thread.sleep(5000);

	driver.findElement(By.id("ok_button")).click();
	
	WebElement result = driver.findElement(By.xpath("//tbody[@class='list2_body']//td"));
	String resultText = result.getText();
	
	if (resultText.contains("No records to display")) 
	{	
		System.out.println("Incident has been deleted");
	} 
	else 
	{
		System.out.println("Incident not deleted");
	}

}


}
