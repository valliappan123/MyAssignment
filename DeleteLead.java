package Week2Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	private static final CharSequence Text = null;

	public static void main(String[] args) {
		
	    ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Leads')])[3]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("");
		driver.findElement(By.xpath("//button[contains(text(),'Leads')]")).click();
		String Lead = driver.findElement(By.xpath("//div[contains(@class,'col-partyId')]/a[text()='11024']")).getText();	
		System.out.println("Lead");
		driver.findElement(By.xpath("//a[text()='11024']")).click();
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Leads')])[3]")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(Lead);
		driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		if(Lead.contains(Text))
		{
			System.out.println(Text + " is displayed");
		}
		else
		{
			 System.out.println("Given Record is not deleted properly");
		}
		}
		// TODO Auto-generated method stub

	}


