package Day002;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class locators_test001 {
	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//name
		//driver.findElement(By.name("search")).sendKeys("Mac");
		
		//id
		boolean logoDisplayStatus=driver.findElement(By.id("logo")).isDisplayed();
		System.out.println(logoDisplayStatus);
	}

}
