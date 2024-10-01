package myProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("input[value='option3']")).click();
		 String  label =(driver.findElement(By.cssSelector("label[for='honda']")).getText());
		 WebElement dropdown= driver.findElement(By.id("dropdown-class-example"));
		 Select s=new Select(dropdown);
		 s.selectByVisibleText(label);    
		 driver.findElement(By.id("name")).sendKeys(label);
		 driver.findElement(By.id("alertbtn")).click();
		 String alert= driver.switchTo().alert().getText();
		 if(alert.contains(label))
		 {
			 System.out.println("Assignment completed Successfully");
		 }
		 else
		 System.out.println("You Haven't completed your Assignmnet successfully ");
	}

}
