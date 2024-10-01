package myProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class form {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\ALL\\Thrinadh\\Selenium\\chromedriver-win64\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Thrinadh");
		driver.findElement(By.name("email")).sendKeys("thrinadhpalvai1106@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("thrinadh@palvai");
		driver.findElement(By.id("exampleCheck1")).click();
		driver.findElement(By.xpath("//select/option[1]")).click();
		/*		OR
		 * WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select abc = new Select(dropdown);
		abc.selectByVisibleText("Female");*/
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("11-06-2001");
		driver.findElement(By.cssSelector("input[class*='btn btn-success']")).click();
		System.out.println(driver.findElement(By.cssSelector("div[class*='alert alert-success alert-dismissible']")).getText());
	}
}
