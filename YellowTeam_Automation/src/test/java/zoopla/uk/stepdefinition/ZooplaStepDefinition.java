package zoopla.uk.stepdefinition;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.usa.utility.Highlighter;
import com.usa.utility.Utility;
import cucumber.api.java.en.*;
import zoopla.page.factory.MasterPageFactory2;
import zoopla.uk.baseclass.ZooplaSuperClass;

public class ZooplaStepDefinition extends ZooplaSuperClass {

	MasterPageFactory2 mpf;

	@Given("^As a user I am able to open any browser$")
	public void as_a_user_I_am_able_to_open_any_browser() throws Exception {
		logger.info("*******> As a user i can open any browser <*******");
		ZooplaSuperClass.initialization();
		mpf = PageFactory.initElements(driver, MasterPageFactory2.class);

	}

	@Given("^As a user I am able to enter \"([^\"]*)\"$")
	public void as_a_user_I_am_able_to_enter(String URL) {
		driver.get(URL);
		logger.info("*******> As a user i can enter the url <*******");
		Highlighter.getcolor(driver, mpf.getClickSigninButton(), "blue");
		Utility.waitForElement(mpf.getAcceptCookies());
		mpf.getAcceptCookies().click();

	}

	@When("^As a user I am able to click on signin button$")
	public void as_a_user_I_am_able_to_click_on_signin_button() {
		logger.info("*******> As a user i can click on signin button <*******");
		Highlighter.getcolor(driver, mpf.getClickSigninButton(), "blue");
		Utility.waitForElement(mpf.getClickSigninButton());
		mpf.getClickSigninButton().click();
        
	}

	@When("^As a user I am able to submit signin button$")
	public void as_a_user_I_am_able_to_submit_signin_button() {
		logger.info("*******> As a user i can click on login button <*******");
		Highlighter.getcolor(driver, mpf.getClickLogin(), "blue");
		Utility.waitForElement(mpf.getClickLogin());
		mpf.getClickLogin().click();

	}

	@When("^As a user I am able to enter the valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void as_a_user_I_am_able_to_enter_the_valid_and(String userName, String passWord) {

		logger.info("*******> As a user i can enter the username <*******");
		Highlighter.getcolor(driver, mpf.getEnterUserName(), "blue");
		Utility.waitForElement(mpf.getEnterUserName());
		mpf.getEnterUserName().sendKeys(userName);

		logger.info("*******> As a user i can enter the password <*******");
		Highlighter.getcolor(driver, mpf.getEnterPassword(), "blue");
		Utility.waitForElement(mpf.getEnterPassword());
		mpf.getEnterPassword().sendKeys(passWord);

	}

	@When("^Homepage title should be \"([^\"]*)\"$")
	public void homepage_title_should_be(String homeTitle) {
		logger.info("*******> As a user i can verify the homepage <*******");
		if (driver.getPageSource().contains("Incorrect email or password")) {
			System.out.println("My test is failed");
			driver.quit(); // if test case failed browser will be close
		}

		else { // if test case pass they take else condition & avoid if
			Assert.assertEquals("Browse properties by city or town in the UK", homeTitle); // assert coming from testng
			System.out.println("Home page validation is pass");

		}

	}

	@When("^As a user I can enter the location as \"([^\"]*)\" & search it$")
	public void as_a_user_I_can_enter_the_location_as_search_it(String location) {
		logger.info("*******> As a user I can enter & search the location  <*******");
		Highlighter.getcolor(driver, mpf.getEnterLocation(), "blue");
		Utility.waitForElement(mpf.getEnterLocation());
		mpf.getEnterLocation().sendKeys(location);
		Highlighter.getcolor(driver, mpf.getClickSearch(), "blue");
		Utility.waitForElement(mpf.getClickSearch());
		mpf.getClickSearch().click();

	}

	@When("^As a user I can print all the price values$")
	public void as_a_user_I_can_print_all_the_price_values() {
		logger.info("*******> As a user I print all the price values <*******");

		List<WebElement> list = mpf.getPrintallprice();
		System.out.println("Total property count num :" + list.size());
		for (WebElement select : list) {
			String listPrice = select.getText();
			System.out.println("Properties price list :" + listPrice);
         }
		System.out.println("Fifth property Price : " + list.get(4).getText());
	}

	@When("^As a user I can select the fifth property on list$")
	public void as_a_user_I_can_select_the_fifth_property_on_list() {
		logger.info("*******> As a user I can select the fifth property on list <*******");

		List<WebElement> list = mpf.getClickFifthProperty();
		for (int i = 0; i < list.size(); i++) {
			if (i > 4) {
				System.out.println("Selected property : " + i);
				System.out.println("Selected property details : " + list.get(i).getText());
				list.get(i).click();;
				break;
			}
		}
	}

	@When("^As a user I can verify the logo, name and phone number of the agent \"([^\"]*)\"$")
	public void as_a_user_I_can_verify_the_logo_name_and_phone_number_of_the_agent(String agentLogo) {
	   logger.info("*******> As a user I can verify the agent logo, name & phone no <*******");
		if (driver.getPageSource().contains("Do Not verify the logo")) {
			driver.quit();
		} else {
			Assert.assertEquals("Logo,Agent name,phone number", agentLogo);
			System.out.println("Agent logo,name & phone no validation is pass");
		}

	}

	@When("^As a user I can click on my zoopla button$")
	public void as_a_user_I_can_click_on_my_zoopla_button() {
		logger.info("*******> As a user I can click on my zoopla button <*******");
		Highlighter.getcolor(driver, mpf.getMouseHoverMyZoopla(), "blue");
		Utility.waitForElement(mpf.getMouseHoverMyZoopla());
		Actions action = new Actions(driver);
		WebElement mousHover = mpf.getMouseHoverMyZoopla();
		action.moveToElement(mousHover).build().perform();

	}

	@When("^As a user I can click on signout button$")
	public void as_a_user_I_can_click_on_signout_button() {
		logger.info("*******> As a user I can click signout button <*******");
		Highlighter.getcolor(driver, mpf.getClickSignOut(), "blue");
		// Utility.waitForElement(mpf.getClickSignOut());
		Actions action = new Actions(driver);
		WebElement mouse = mpf.getClickSignOut();
		action.moveToElement(mouse);
		action.click();

	}

	@Then("^Loginpage title should be \"([^\"]*)\"$")
	public void loginpage_title_should_be(String loginTitle) {
		logger.info("*******> As a user i can verify the login title <*******");
		if (driver.getPageSource().contains("Login was unsuccessful.")) {
			System.out.println("My test is failed");
			driver.quit();
		} else {
			Assert.assertEquals("Zoopla > Search Property to Buy, Rent, House Prices, Estate Agents", loginTitle);
			System.out.println("Login page is pass");

		}
	}

	@Then("^As a user I can close the browser$")
	public void as_a_user_I_can_close_the_browser() {

		driver.quit();

	}

}
