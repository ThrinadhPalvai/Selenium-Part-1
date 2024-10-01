package myProject1;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class LoginPagePractise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		WebDriverWait w =new WebDriverWait(driver,Duration.ofSeconds(10));

		
		//we have use string method when we need a specific items in a list. but, here we are selecting all items in a list so , there is no need of string
		//String[] phones= {"iPhone","Samsung","Nokia","Blackberry"};
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("select[class='form-control']")));
		driver.findElement(By.cssSelector("button[class='btn btn-success']")).click();
		
		WebElement StaticDropDown= driver.findElement(By.cssSelector("select[class='form-control']"));
		Select dropdown =new Select(StaticDropDown);
		dropdown.selectByValue("consult");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
		
		
		List <WebElement> products = driver.findElements(By.cssSelector(".card-footer .btn-info"));
		
		
		
		for(int i=0;i<products.size();i++)
		{
		products.get(i).click();
		}
	driver.findElement(By.partialLinkText("Checkout")).click();
	driver.findElement(By.cssSelector("button[class='btn btn-success']")).click();
	w.until(ExpectedConditions.visibilityOfElementLocated(By.id("country")));
	driver.findElement(By.id("country")).sendKeys("Hyderabad");
	w.until(ExpectedConditions.elementToBeClickable(By.id("checkbox2")));
	driver.findElement(By.id("checkbox2")).click();
	driver.findElement(By.cssSelector("input[value='Purchase']")).click(); 
	}
}
