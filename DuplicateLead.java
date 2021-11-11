package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/main");
driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Find Leads")).click();
driver.findElement(By.xpath("//span[text()='Email']")).click();
driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("a@gmail.com");
driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
Thread.sleep(2000);
String  lead=driver.findElement(By.xpath("//div[contains(@class,'partyId')][1]/a[@class='linktext']")).getText();
driver.findElement(By.xpath("//div[contains(@class,'partyId')][1]/a[@class='linktext'][1]")).click();
driver.findElement(By.linkText("Duplicate Lead")).click();
String title = driver.getTitle();
System.out.println(title);
driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
Thread.sleep(2000);
driver.close();




	}
}