import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.naukri.com/");
		Thread.sleep(2000);
		Set<String> wins = driver.getWindowHandles();
		List<String> lst = new ArrayList<String>(wins);

		driver.switchTo().window(lst.get(2));
		driver.close();

		/*
		 * for (int i = lst.size() - 1; i >= 0; i--) { String win = lst.get(i);
		 * driver.switchTo().window(win); driver.close(); Thread.sleep(2000);
		 * 
		 * }
		 */
	}

}
