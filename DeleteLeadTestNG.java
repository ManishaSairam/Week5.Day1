package assignmentweek5.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DeleteLeadTestNG extends BaseClassTestNG{
	@Test
	public void deleteLead() throws InterruptedException {
	
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.name("phoneCountryCode")).clear();
		driver.findElement(By.name("phoneCountryCode")).sendKeys("+91");
		driver.findElement(By.name("phoneNumber")).sendKeys("7550280727");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		String firstLead = driver.findElement(By.xpath("//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a")).getText();
		driver.findElement(By.xpath("//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a")).click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.name("id")).sendKeys(firstLead);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		WebElement message = driver.findElement(By.xpath("//div[@class='x-paging-info']"));
		Thread.sleep(2000);
		String verifyMsg = message.getText();
		String expectedMsg = "No records to display";
		if(verifyMsg.contentEquals(expectedMsg))
				System.out.println("Verified the lead was deleted");
		else
				System.out.println("The Lead was not deleted");
		driver.close();
		
		

	}}
