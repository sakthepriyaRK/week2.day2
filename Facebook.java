package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("firstname")).sendKeys("sakthe");
		driver.findElement(By.name("lastname")).sendKeys("RK");
		driver.findElement(By.name("reg_email__")).sendKeys("sak.gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Abcefg*123");
		WebElement days = driver.findElement(By.id("day"));
		Select select=new Select(days);
		select.selectByValue("9");
		WebElement months = driver.findElement(By.id("month"));
		Select select1=new Select(months);
		select1.selectByVisibleText("Nov");
		WebElement years = driver.findElement(By.id("year"));
		Select select2=new Select(years);
		select2.selectByValue("1992");
		driver.findElement(By.xpath("//input[@value='1']")).click();


		
	}

}
