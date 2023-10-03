package Week2Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebooklogin {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com");
		 driver.manage().window().maximize();
		 driver.findElement(By.linkText("Create new account")).click();
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		 driver.findElement(By.name("firstname")).sendKeys("testleaf");
		 driver.findElement(By.name("lastname")).sendKeys("Test");
		 driver.findElement(By.name("reg_email__")).sendKeys("testleaf.2023@gmail.com");
		 driver.findElement(By.id("password_step_input")).sendKeys("passwordtest");
		 WebElement day = driver.findElement(By.id("day"));
		 Select dd_day = new Select(day);
		 dd_day.selectByValue("24");
		 WebElement birthMonth=driver.findElement(By.name("birthday_month"));
		 Select dd_birthMonth = new Select(birthMonth);
		 dd_birthMonth.selectByValue("4");
		 WebElement bYear=driver.findElement(By.name("birthday_year"));
			Select dd_bYear=new Select(bYear);
			dd_bYear.selectByVisibleText("1998");
			driver.findElement(By.xpath("//input[@value='2']")).click();
		 
			driver.close();
			
		// TODO Auto-generated method stub

	}

}
