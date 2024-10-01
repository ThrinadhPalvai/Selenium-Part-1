package myProject1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandleAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.linkText("Click Here")).click();
		Set <String> window= driver.getWindowHandles();
		Iterator <String> it=window.iterator();
		String ParentWindow=it.next();
		String ChildWindow=it.next();
		driver.switchTo().window(ChildWindow);
		System.out.println(driver.findElement(By.xpath("//div//h3")).getText());
		driver.switchTo().window(ParentWindow);
		System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());
		
		

	}

}
