package Week2Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("account name");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
	   WebElement industry = driver.findElement(By.name("industryEnumId"));
	   Select dd_industry = new Select(industry);
	  dd_industry.selectByVisibleText("Computer Software");
	  WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		Select dd_ownship = new Select(ownership);
	  dd_ownship.selectByVisibleText("S-Corporation");
	  WebElement source = driver.findElement(By.id("dataSourceId"));
	  Select dd_source = new Select(source);
	  dd_source.selectByValue("LEAD_EMPLOYEE");
	  WebElement MarketinCampain = driver.findElement(By.id("marketingCampaignId"));
	  Select dd_MarketinCampain = new Select(MarketinCampain);
	  dd_MarketinCampain.selectByIndex(6);
	  WebElement country = driver.findElement(By.name("generalCountryGeoId"));
	  Select dd_country = new Select(country);
	  dd_country.selectByIndex(50);
	  driver.findElement(By.className("smallSubmit")).click();
		System.out.println("accountText");
		driver.close();
	}
	  
	  
	}

	
	


