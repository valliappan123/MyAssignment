package Week2Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		   driver.get("http://leaftaps.com/opentaps/");
		   driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.xpath("//a[text()='Leads']")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf Online course");
			driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("valliappan");
			driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Vinoth");
			driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("valli");
			driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Its a online course for both freshers and experienced people");
			driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("valliappanvinoth650@gmail.com");
			WebElement state = driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
			Select statedrop = new Select(state);
			statedrop.selectByVisibleText("New York");
			driver.findElement(By.xpath("//input[@name='submitButton']")).click();
			driver.findElement(By.xpath("//div[@class='frameSectionExtra']//a[text()='Edit']")).click();
			driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
			driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("No Comments");
			driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
			 String currentTitle = driver.getTitle();
			 System.out.println("Current Title is:"+currentTitle);
			 driver.close();

		// TODO Auto-generated method stub

	}

}
