package day1;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {
		//Launching browser
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		//Locate the fields
		WebElement name = driver.findElement(By.id("name"));
		WebElement email = driver.findElement(By.id("email"));
		WebElement phone = driver.findElement(By.id("phone"));
	    //WebElement address = driver.findElement(By.id("textarea"));
		
		//Retrieve the values	
		String nameValue = name.getDomProperty("value");
		String emailValue = email.getDomProperty("value");
		String phoneValue = phone.getDomProperty("value");
	    //String addressValue = address.getDomProperty("value");
		
		
		if(nameValue.matches(".*\\\\d.*"))
		{
		System.out.println("Name field is invalid");
		}
		else
		{
			System.out.println("Name is okay");
		}
		
		
		if(emailValue.contains("@")) 
		{
			System.out.println("Email valid");
		}
		else
		{
			System.out.println("Email invalid");
		}
		
		if(phoneValue.matches("\\d{11}"))
		{
			System.out.println("Phone number is okay");
		}
		else
		{
			System.out.println("Phone number invalid");
		}
		
		
		//Radio buttons
		
		WebElement radioButton = driver.findElement(By.id("male"));
		radioButton.click();
		
		WebElement radioButton2 = driver.findElement(By.id("female"));
		radioButton2.click();
		
		
		//Select checkboxes of week
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type ='checkbox']"));
		
		//Now we need a looping statement to select all the checkboxes
		
//		for(int i=0; i<checkboxes.size(); i++)
//		{
//			checkboxes.get(i).click();
//			}
		
		//Enhanced for loop, format: for(WebElement variable : List variable)
//		for(WebElement checkbox:checkboxes)
//		{
//			checkbox.click();
//		}
		
		
		//Select last three checkboxes
		//Total number of checkboxes - how many you want to select = Starting index of loop
//		for (int i=4; i<checkboxes.size(); i++ )
//		{
//			checkboxes.get(i).click();
//			}
//	
	
		//Select first 3 checkboxes
//		for (int i=0; i<3; i++)
//		{
//		checkboxes.get(i).click();
//		}
		
		//Unselect the checked boxes
		//first select all/required checkboxes
		
		for(WebElement checkbox:checkboxes)
			{
				checkbox.click();
			}
		
		Thread.sleep(2000);
		
		for(WebElement checkbox:checkboxes)
		{
			checkbox.click();
		}
		
	 //Alert with OK button
		driver.findElement(By.xpath("//*[@id=\"alertBtn\"]")).click();
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
		
		
		driver.findElement(By.xpath("//*[@id=\"confirmBtn\"]")).click();
		Thread.sleep(2000);
		
//		driver.switchTo().alert().accept();
//		System.out.println("Accepted");
		
		driver.switchTo().alert().dismiss();
		System.out.println("Rejected");
		
		
	driver.findElement(By.xpath("//*[@id=\"promptBtn\"]")).click();
	
	Alert myalert = driver.switchTo().alert();
	myalert.sendKeys("Abdul");
	Thread.sleep(2000);
	myalert.accept();
		
		
		
		}
	}



// I am new line of code