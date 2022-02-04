package assignmentweek5.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignIncidentTestNG {
	@Test
	public void assignIncident() throws InterruptedException
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
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@id='b55b4ab0c0a80009007a9c0f03fb4da9']//div[text()='All']")).click();
		
		driver.switchTo().frame("gsft_main");
		
		driver.findElement(By.xpath("//span[contains(text(),'search')]/following-sibling::input"))
		.sendKeys("INC0010048",Keys.ENTER);
		
		driver.findElement(By.xpath("//td[@class='vt']/a[1]")).click();
		
		String input = "Software";
		
		driver.findElement(By.id("sys_display.incident.assignment_group")).sendKeys(input,Keys.ENTER);
		
		driver.findElement(By.id("activity-stream-textarea")).sendKeys("The Incident has assigned to Software group");
		Thread.sleep(2000);
		
		driver.findElement(By.id("sysverb_update_bottom")).click();
		  
		WebElement groupName = driver.findElement(By.xpath("//td[@class='vt'][8]"));
		  
		if(groupName.getText().contains(input)) 
		{
			System.out.println("The incident assigned to "+input+" group succesffully"); 
		}
		 else 
		{ 
			System.out.println("Not Assigned"); 
		}
		 
		
	}


}
