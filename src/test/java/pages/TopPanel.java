package pages;

import drivers.WebDriverFactory;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class TopPanel extends BasePage {
    private AuthPopUp authPopUp;
    //protected static WebDriver driver;

    public TopPanel(WebDriver driver) {
        super(driver);
        authPopUp = new AuthPopUp(WebDriverFactory.getWebDriver());
    }

    @FindBy(css = ".ic-blog-default-avatar")
    private WebElement userLogoName;
    @FindBy(css = "[title=\"Личный кабинет\"]")
    private WebElement personalAccount;

    public void goToAccount() {
        Actions actions = new Actions(driver);
       // driver.get("https://otus.ru/lk/biography/personal/");
        actions.moveToElement(userLogoName).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(personalAccount));
    }
}
