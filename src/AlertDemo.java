import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		Thread.sleep(2000);
		Alert a = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(a.getText());
		Thread.sleep(2000);
		a.sendKeys("Ankur");
		Thread.sleep(2000);
		a.accept();
		Thread.sleep(2000);
		WebElement res = driver.findElement(By.id("promptResult"));
		System.out.println(res.getText());
	}

}
