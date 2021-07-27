package Google;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBus {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Departure Month");
		String dMonth = sc.next();
		System.out.println("Enter the Departure Date");
		int dDate = sc.nextInt();
		System.out.println("Enter the arivel montyh");
		String aMonth = sc.next();
		System.out.println("Enter the Arivel date");
		int aDate = sc.nextInt();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("disable-Notification");
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		String flightDate = dMonth.substring(0, 3);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='onward_cal']")).click();
		String cDate = driver
				.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']/descendant::td[@class='monthTitle']"))
				.getText();
		System.out.println(cDate);
		String flightCDate = cDate.substring(0, 3);

		while (!flightDate.equalsIgnoreCase(flightCDate)) {
			Thread.sleep(2000);
			driver.findElement(By
					.xpath("//div[@id='rb-calendar_onward_cal']/table[@class='rb-monthTable first last']/descendant::td[@class='next']/button"))
					.click();
			cDate = driver
					.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']/descendant::td[@class='monthTitle']"))
					.getText();
			flightCDate = cDate.substring(0, 3);

		}

	}

}
