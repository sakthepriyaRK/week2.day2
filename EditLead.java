package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
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
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id='ext-gen248']")).sendKeys("sakthe");
driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
Thread.sleep(2000);
//the below commented line also works for getting the first resulting id. can use line 29 ,30 format also
//String lead = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId'][1]/a[@class='linktext']")).getText();
//driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]")).click();
WebElement lead = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId'][1]/a[@class='linktext']"));
lead.getText();
lead.click();
driver.findElement(By.linkText("Edit")).click();	
WebElement company = driver.findElement(By.xpath("//input[@value='TestLeaf']"));
company.clear();
company.sendKeys("TCS");
driver.findElement(By.xpath("//input[@value='Update']")).click();
Thread.sleep(2000);
driver.close();

}
}