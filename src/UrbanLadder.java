import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UrbanLadder {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.urbanladder.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement close = driver.findElement(By.xpath("//a[@class = 'close-reveal-modal hide-mobile']"));
		close.click();
		Actions a = new Actions(driver);// object creation
		List<WebElement> menues = driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));
		for (WebElement menuName : menues) {
			String name = menuName.getText();
			System.err.println(name);
			Thread.sleep(1000);
			a.moveToElement(menuName).perform();// calling non static method
			Thread.sleep(2000);
			DemoScreenShot.takePic(driver, name);
			List<WebElement> subMenues = driver.findElements(
					By.xpath("//span[contains(.,'" + name + "')]/parent::li/descendant::ul[@class='taxonslist']/li"));
			for (WebElement subMenu : subMenues) {
				System.out.println(subMenu.getText());
			}
			Thread.sleep(1000);

		}
		driver.close();
	}

}
