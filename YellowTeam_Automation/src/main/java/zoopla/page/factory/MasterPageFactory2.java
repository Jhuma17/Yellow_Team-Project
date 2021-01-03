package zoopla.page.factory;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import zoopla.uk.baseclass.ZooplaSuperClass;

public class MasterPageFactory2 extends ZooplaSuperClass {

	public MasterPageFactory2() {

		PageFactory.initElements(driver, this); // here driver is a global level

	}

	@FindBy(xpath = "(//*[text()='Accept all cookies'])[2]")
	@CacheLookup // for using cache memory
	private WebElement acceptCookies;

	public WebElement getAcceptCookies() {
		return acceptCookies;
	}

	@FindBy(linkText = "Sign in")
	@CacheLookup
	private WebElement clickSigninButton;

	public WebElement getClickSigninButton() {
		return clickSigninButton;
	}

	@FindBy(id = "signin_email")
	@CacheLookup
	private WebElement enterUserName;

	public WebElement getEnterUserName() {
		enterUserName.clear(); // clear the text box
		return enterUserName;
	}

	@FindBy(id = "signin_password")
	@CacheLookup
	private WebElement enterPassword;

	public WebElement getEnterPassword() {
		enterPassword.clear(); // clear the text box
		return enterPassword;
	}

	@FindBy(id = "signin_submit")
	@CacheLookup
	private WebElement clickLogin;

	public WebElement getClickLogin() {
		return clickLogin;
	}

	@FindBy(id = "search-input-location")
	@CacheLookup
	private WebElement enterLocation;

	public WebElement getEnterLocation() {
		return enterLocation;
	}

	@FindBy(css = "#search-submit")
	@CacheLookup
	private WebElement clickSearch;

	public WebElement getClickSearch() {
		return clickSearch;

	}

	@FindBy(xpath = "//*[@class='css-1e28vvi-PriceContainer e2uk8e8']")
	@CacheLookup
	private List<WebElement> printallprice;

	public List<WebElement> getPrintallprice() {
		return printallprice;

	}

	@FindBy(xpath = "//*[@class='e2uk8e4 css-16zqmgg-StyledLink-Link-FullCardLink e33dvwd0']")
	@CacheLookup
	private List<WebElement> clickFifthProperty;

	public List<WebElement> getClickFifthProperty() {
		return clickFifthProperty;
	}
 
	
	@FindBy(xpath = " //header/div[1]/div[1]/div[1]/div[1]/ul[1]/li[5]/a[1]")
	@CacheLookup
	private WebElement mouseHoverMyZoopla;

	public WebElement getMouseHoverMyZoopla() {
		return mouseHoverMyZoopla;

	}

	@FindBy(xpath = "(//*[text()='Sign out'])[2]")
	@CacheLookup
	private WebElement clickSignOut;

	public WebElement getClickSignOut() {
		return clickSignOut;

	}

}
