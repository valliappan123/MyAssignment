package Week2Assignment;

import java.awt.Dimension;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundButton {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		   driver.get("https://leafground.com/button.xhtml");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		   driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only mr-2 mb-2']")).click();
		   	String Pagetitle = driver.getTitle();
		   	if(Pagetitle.equalsIgnoreCase("dashboard")) 
		   	{
		   		System.out.println(Pagetitle + " - Title matches");
		   	}
			driver.navigate().back();
			boolean enabled = driver.findElement(By.xpath("//span[text()='Disabled']/parent::button")).isEnabled();
			if(!enabled) {
			System.out.println("Button is disabled");
			}
			else { 
				System.out.println("Button is enabled");
			}
			 WebElement Background = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt96']"));
			System.out.println("Location of the element is " + Background);
			//Get the background color of the element
			String cssValue = driver.findElement(By.xpath("//h5[contains(text(),'Find the Save button color')]/following-sibling::button")).getCssValue("color");
			System.out.println("Background color of the element is " + cssValue);
			
			//Get the height and width of the element
			org.openqa.selenium.Dimension size = driver.findElement(By.xpath("//span[text()='Submit']/parent::button[contains(@class,'ui-button-text-icon-right')]")).getSize();
			System.out.println("Size of the element is " + size);
			
			driver.close();
			
			}
		// TODO Auto-generated method stub

	}


