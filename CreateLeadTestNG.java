package assignmentweek5.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class CreateLeadTestNG extends BaseClassTestNG{
	@Test
	public void createLead() {
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("First source");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Manisha");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sairam");
		
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropdown = new Select(source);
		dropdown.selectByIndex(7);
		
		WebElement marketcamp = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dropdown1 =new Select(marketcamp);
		dropdown1.selectByIndex(3);
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("manisha");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("sairam");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("16/07/1999");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Automation Testing");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Computer Science");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("50000");
		
		WebElement currency = driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select dropdown2 = new Select(currency);
		dropdown2.selectByIndex(2);
		
		WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dropdown3 = new Select(industry);
		dropdown3.selectByIndex(2);
		
		WebElement ownership =driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dropdown4 =new Select(ownership);
		dropdown4.selectByIndex(1);
		
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("5");
		
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("1607");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("1605");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Create Lead");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Learn Selenium");
		
		//contact information
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("600114");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("+91");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("manishasai1697@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("7550280727");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("manisha");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.cowin.gov.in");
		
		//primary information
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Manisha");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("S");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Nanganallur");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Palavanthagal");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600114");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("114");
		
		WebElement country =  driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select dropdown5 = new Select(country);
		dropdown5.selectByIndex(2);
		
		WebElement state =  driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dropdown6 = new Select(state);
		dropdown6.selectByIndex(1);
		
		System.out.println("First name is "+driver.findElement(By.id("createLeadForm_firstName")).getAttribute("value"));
		System.out.println("Titile of the page is "+driver.getTitle());
		driver.findElement(By.name("submitButton")).click();
		driver.close();

}
}


