package pages;

import drivers.WebDriverFactory;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class TopPanel extends BasePage { ;
    private AuthPopUp authPopUp;

    public TopPanel(WebDriver driver) {
        super(driver);
        authPopUp = new AuthPopUp(WebDriverFactory.getWebDriver());
    }

    @FindBy(css = ".header2__right p")
    private static WebElement userLogoName;
    @FindBy(css = "[title=\"Личный кабинет\"]")
    private static WebElement personalAccount;

    public static void goToAccount() {
        moveToElement(userLogoName);
        wait.until(ExpectedConditions.elementToBeClickable(personalAccount)).click();
    }
}
