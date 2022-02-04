package assignmentweek5.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UpdateExistingIncidentTestNG {
	@Test
	public void updateIncident() throws InterruptedException
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
		
		WebElement element1 = driver.findElement(By.id("incident.urgency"));
		Select urgency = new Select(element1);
		urgency.selectByValue("1");
		
		WebElement urgencyValue = urgency.getFirstSelectedOption();
	    String selectedOption = urgencyValue.getText();
		
		WebElement element2 = driver.findElement(By.id("incident.state"));
		Select state = new Select(element2);
		state.selectByValue("2");
		WebElement stateValue = state.getFirstSelectedOption();
		String selectedOption2 = stateValue.getText();
		
		if(selectedOption.contains("High"))
		{
			System.out.println("Urgency updated to High");
		}
		else
		{
			System.out.println("Urgency not updated");
		}
		
		if(selectedOption2.contains("In Progress"))
		{
			System.out.println("State updated to In Progress");
		}
		else
		{
			System.out.println("State not updated");
		} 
		
		driver.findElement(By.id("sysverb_update_bottom")).click();
			
	}

}
