package Google;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class g {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement search = driver.findElement(By.name("q"));
		System.out.println(search.isDisplayed());
		System.out.println("is Enamble :" + search.isEnabled());
		search.sendKeys("java", Keys.ENTER);
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		/*
		 * js.executeScript("window.scrollBy(0,1000)"); Thread.sleep(2000);
		 * js.executeScript("window.scrollBy(0,-500)");
		 */
		/*
		 * js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		 * Thread.sleep(2000);
		 * js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		 */
		WebElement ele = driver.findElement(By.xpath("//span[text()='View all']"));
		js.executeScript("arguments[0].scrollIntoView()", ele);
	}

}
