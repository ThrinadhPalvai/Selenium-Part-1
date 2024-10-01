package myProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000l);
		int i = 1;
		while (i < 5) {
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.cssSelector(".ui_state_default.ui_state_highlight.ui_state_active")).click();
	}
}

//TODO Auto-generated method stub
// System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\ALL\\Thrinadh\\Selenium\\chromedriver-win64\\chromedriver.exe\\");//

/*
 * driver.get("https://rahulshettyacademy.com/AutomationPractice/");
 * driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).click();
 * System.out.println(driver.findElement(By.cssSelector(
 * "input[id*='checkBoxOption1']")).isSelected());
 * driver.findElement(By.cssSelector("input[id*='checkBoxOption1']")).click();
 * System.out.println(driver.findElement(By.cssSelector(
 * "input[id*='checkBoxOption1']")).isSelected());
 * System.out.println(driver.findElement(By.cssSelector("input[type='checkbox']"
 * )).getSize());
 * 
 * driver.close();
 */