package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeadDelete {
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
driver.findElement(By.xpath("//span[text()='Phone']")).click();
driver.findElement(By.name("phoneNumber")).sendKeys("9");
driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
Thread.sleep(2000);
String lead = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId'][1]/a[@class='linktext']")).getText();
driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]")).click();
////driver.findElement(By.xpath("//a[@id='ext-gen928']")).click();

//String leadid = driver.findElement(By.xpath("//div[contains(@class,'partyId')][1]/a[@class='linktext']")).getText();
//driver.findElement(By.xpath("//div[contains(@class,'partyId')]/a[@class='linktext'][1]")).click();

//List<WebElement> ele = driver.findElements(By.xpath("//div[contains(@class,'partyId')][1]/a[@class='linktext'][1]"));
//
//ele.get(0).click();

driver.findElement(By.linkText("Delete")).click();
driver.findElement(By.linkText("Find Leads")).click();
//this below commented line also executes
//String text = driver.findElement(By.xpath("//div[@class='x-form-element']/input[@name='id']")).getText();
driver.findElement(By.name("id")).sendKeys(lead);
driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
Thread.sleep(2000);
driver.close();
	}
}