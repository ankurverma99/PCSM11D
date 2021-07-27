import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BlueStone {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
		WebElement rings = driver.findElement(By.xpath("//ul[@class='wh-main-menu']/li/a[@title='Rings']"));
		Actions a = new Actions(driver);
		a.moveToElement(rings).perform();
		driver.findElement(By.xpath("//ul[@class='two-col']/descendant::a[@title='Diamond Rings']")).click();
		WebElement defaultPrice = driver.findElement(By.xpath("//span/span[contains(.,'Price')]"));
		a.moveToElement(defaultPrice).perform();
		List<WebElement> dPrice = driver.findElements(By.xpath("//form[@id='price']/div[@class='form-items']/div"));
		for (WebElement price : dPrice) {
			System.out.println(price.getText());
		}
		WebElement popular = driver.findElement(By.xpath("//span/span[contains(.,'Popular')]"));
		a.moveToElement(popular).perform();
		driver.findElement(By.xpath("//a[text()='Price Low to High ']")).click();
	}

}
