package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesFreeTrial {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("UserFirstName")).sendKeys("sabana");
		driver.findElement(By.name("UserLastName")).sendKeys("janaki");
		driver.findElement(By.name("UserEmail")).sendKeys("abc@gm.com");
		WebElement title = driver.findElement(By.name("UserTitle"));
		Select sel=new Select(title);
		sel.selectByVisibleText("Developer / Software Engineer / Analyst");
		driver.findElement(By.name("CompanyName")).sendKeys("testleaf");
		WebElement employee = driver.findElement(By.name("CompanyEmployees"));
		Select sel1=new Select(employee);
		sel1.selectByValue("950");
		driver.findElement(By.name("UserPhone")).sendKeys("123456789");
		WebElement country = driver.findElement(By.name("CompanyCountry"));
		Select sel2=new Select(country);
		sel2.selectByValue("IN");
		driver.findElement(By.className("checkbox-ui")).click();
		
		
	}

}
