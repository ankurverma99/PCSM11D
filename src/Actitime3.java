import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime3 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		String user = ReadData.readCell("E:/Login.xlsx", "login", 1, 0);
		String pass = ReadData.readCell("E:/Login.xlsx", "login", 1, 1);
		driver.findElement(By.id("username")).sendKeys(user);
		driver.findElement(By.name("pwd")).sendKeys(pass, Keys.ENTER);
	}
}
