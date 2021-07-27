import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement serach = driver.findElement(By.xpath("//input[@name='search']"));
		serach.sendKeys("java", Keys.ENTER);
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		serach.sendKeys("testng", Keys.ENTER);
	}

}
