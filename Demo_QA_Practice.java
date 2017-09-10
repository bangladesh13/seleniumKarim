package sits;
// adding some comment
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo_QA_Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","c:\\");
		
		// Step 1: Open the web browser		
		
		WebDriver driver = new FirefoxDriver();
		
		// Step 2: Navigate to http://demoqa.com/ web page
		
		driver.get("http://demoqa.com//");
		
		// Step 3: Clicking on Registration Button
		driver.findElement(By.linkText("Registration")).click();
		
		Thread.sleep(5000);
		// Step 4: Enter First name, last name
		driver.findElement(By.name("first_name")).sendKeys("Rabiul");
		driver.findElement(By.id("name_3_lastname")).sendKeys("Karim");
		// Step 5: Check Marital status and Hobby
		driver.findElement(By.xpath("//*[@id='pie_register']/li[2]/div/div/input[2]")).click();
		driver.findElement(By.xpath("//*[@id='pie_register']/li[3]/div/div/input[3]")).click();
		
		// Step 6: Select Country from dropdown menu
		
		driver.findElement(By.xpath("//*[@id='dropdown_7']")).click();
		driver.findElement(By.xpath("//*[@id='dropdown_7']/option[193]")).click();
		
		// Step 7: Select Date of Birth
		driver.findElement(By.xpath("//*[@id='mm_date_8']/option[11]")).click();
		driver.findElement(By.xpath("//*[@id='dd_date_8']/option[13]")).click();
		driver.findElement(By.xpath("//*[@id='yy_date_8']/option[36]")).click();
		// Entering phone number
		driver.findElement(By.name("phone_9")).sendKeys("1234567890");
		// Enter User name 
	
		Random username = new Random();
		int user1 = username.nextInt(500)+1;
		
		driver.findElement(By.name("username")).sendKeys("rabiulkarim" +user1);
		
		driver.findElement(By.name("e_mail")).sendKeys("rabiulkarim"+user1+"@gmail.com");
		
		// Writing about yourself

		driver.findElement(By.name("description")).sendKeys("My name is Rabiul Karim. I am interested to become a QA Engineer.");
		// Enter the password
		driver.findElement(By.name("password")).sendKeys("rabiul123");
		driver.findElement(By.id("confirm_password_password_2")).sendKeys("rabiul123");
		Thread.sleep(10000);
		// click on submit button
		driver.findElement(By.name("pie_submit")).click();
		Thread.sleep(3000);
	driver.quit();
		
		
			
	}

}
