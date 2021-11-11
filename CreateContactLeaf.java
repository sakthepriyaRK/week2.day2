package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContactLeaf {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/main");
driver.manage().window().maximize();

driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Contacts")).click();
driver.findElement(By.linkText("Create Contact")).click();
driver.findElement(By.id("firstNameField")).sendKeys("sabana");
driver.findElement(By.id("lastNameField")).sendKeys("janaki");;

driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("sabana");
driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("janaki");
driver.findElement(By.id("createContactForm_description")).sendKeys("good");
driver.findElement(By.id("createContactForm_departmentName")).sendKeys("it");
driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("abcefg@gmail.com");
WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
Select sel=new Select(state);
sel.selectByVisibleText("California");
driver.findElement(By.name("submitButton")).click();
driver.findElement(By.linkText("Edit")).click();
driver.findElement(By.id("updateContactForm_description")).clear();
driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("check once");
driver.findElement(By.xpath("//input[@value='Update']")).click();
String title = driver.getTitle();
System.out.println(title);
}
}