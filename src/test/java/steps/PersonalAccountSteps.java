package steps;

import config.ServerConfig;
import drivers.WebDriverFactory;
import io.cucumber.java.ru.И;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import pages.PersonalAccountPage;
import org.junit.Assert;

public class PersonalAccountSteps {
    private static PersonalAccountPage personalAccountPage = new PersonalAccountPage(WebDriverFactory.getWebDriver());
    private ServerConfig cfg = ConfigFactory.create(ServerConfig.class);
    protected WebDriver driver;

    @И("выполнен переход в раздел \"([^\"]*)\"$")
    public static void openTabByName(String tabName) {
        personalAccountPage.openTabByName(tabName);
    }
    @И("выполнена проверка текущего \"([^\"]*)\"$")
    public void assertCurrentUrl(String url) {
        Assert.assertEquals(url, driver.getCurrentUrl());
    }


}
