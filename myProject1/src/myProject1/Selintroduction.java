package myProject1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class Selintroduction {

	public static void main(String[] args) {
//	System.setProperty("webdriver.edge.driver","C:\\Users\\lenovo\\Desktop\\ALL\\Thrinadh\\Selenium\\msedgedriver.exe\\");
	//WebDriver driver = new EdgeDriver();
	System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Desktop\\ALL\\Thrinadh\\Selenium\\chromedriver.exe\\");
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.close();
	//driver.quit();
	}

}

