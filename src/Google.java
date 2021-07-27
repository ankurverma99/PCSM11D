import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("file:///E:/HTML/Demo1.html");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);
		Thread.sleep(2000);
		// driver.close();
		driver.quit();
	}

}
