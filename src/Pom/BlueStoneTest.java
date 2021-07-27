package Pom;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlueStoneTest {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		BLueStone bl = new BLueStone(driver);
		bl.sendText("rings");
		bl.ringClick();
		Set<String> tabs = driver.getWindowHandles();
		for (String tab : tabs) {
			driver.switchTo().window(tab);
		}
		bl.buyNowClick();
		System.out.println(bl.getErrorMes());
	}
}
