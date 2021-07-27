package Pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BLueStone {
	@FindBy(name = "search_query")
	private WebElement searchBox;
	@FindBy(xpath = "//img[@alt='The Felicita Top Open Ring']")
	private WebElement ring;
	@FindBy(id = "buy-now")
	private WebElement buyNow;
	@FindBy(xpath = "//div[@class='formErrorContent']")
	private WebElement error;

	public BLueStone(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void sendText(String text) {
		searchBox.sendKeys(text, Keys.ENTER);
	}

	public void ringClick() {
		ring.click();
	}

	public void buyNowClick() {
		buyNow.click();
	}

	public String getErrorMes() {
		return error.getText();
	}

}
