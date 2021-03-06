package main.java.com.dbyl.appiumCore.pageActions;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

/**
 * @author young
 *
 */
public class HomePage {
	/** The driver. */
	IOSDriver<?> driver;

	@iOSFindBy(xpath = "//XCUIElementTypeNavigationBar[@name=\"Topic\"]/XCUIElementTypeButton[1]")
	IOSElement naviBar;
	@iOSFindBy(xpath = "//XCUIElementTypeOther[@name=\"Topic\"]")
	IOSElement topic;
	@iOSFindBy(id = "Sign in")
	IOSElement signIn;
	@iOSFindBy(id = "Sign up")
	IOSElement signUp;

	@iOSFindBy(id = "Allow")
	IOSElement allowButton;

	/**
	 * Gets the driver.
	 *
	 * @return the driver
	 */
	public IOSDriver<?> getDriver() {
		return driver;
	}

	/**
	 * @author young
	 * @throws InterruptedException
	 */
	public void tapNaviMenu() throws InterruptedException {
		try {
			if (naviBar.isDisplayed()) {
				naviBar.click();
			}
		} catch (Exception e) {
			Thread.sleep(2000);
			naviBar.click();
		}

	}

	/**
	 * @author young
	 * @return
	 */
	public SignInPage naviToSignInPage() {
		signIn.click();
		return new SignInPage(driver);
	}

	/**
	 * 
	 * @return
	 */
	public HomePage tapAllowButton() {
		allowButton.click();
		return this;
	}

	/**
	 * Sets the driver.
	 *
	 * @param driver
	 *            the new driver
	 */
	public void setDriver(IOSDriver<?> driver) {
		this.driver = driver;
	}

	/**
	 * @author young
	 * @param driver
	 */
	public HomePage(IOSDriver<?> driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

}
