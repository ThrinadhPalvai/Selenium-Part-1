package myProject1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\ALL\\Thrinadh\\Selenium\\chromedriver-win64\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("palvai");
		driver.findElement(By.name("pass")).sendKeys("thrinadh");
		driver.findElement(By.className("_51sy")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Forgotten account?")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Not you?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Email address or mobile number']")).sendKeys("IamErripuku1234@gmail.com");
		driver.findElement(By.xpath("//button[@name='did_submit']")).click();

	}

}
