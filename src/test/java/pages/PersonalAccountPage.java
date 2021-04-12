package pages;

import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Тогда;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import steps.PersonalAccoundSteps;


public class PersonalAccountPage {
    protected final Logger logger = LogManager.getLogger(PersonalAccountPage.class);
    protected WebDriver driver;
    protected WebDriverWait wait;
    @FindBy(css = "[title=\"Личный кабинет\"]")
    private WebElement personalAccount;
    @FindBy(css = ".header2__right p")
    private WebElement userLogo;
    protected Actions actions;


    @Тогда("пользователь переходит в личный кабинет")
    public void enterAccount() {
        moveToElement(userLogo);
        wait.until(ExpectedConditions.elementToBeClickable(personalAccount)).click();
    }

    private void moveToElement(WebElement userLogo) {//Наводим курсор на элемент
        actions.moveToElement(userLogo).build().perform();
        userLogo.click();
    }

    @И("(?:.*)выполнен переход в раздел \"([^\"]*)\"$")
    public void openTabByName(String tabName) {
        PersonalAccoundSteps.openTabByName(tabName);
    }

    @И("(?:.*)выполнена проверка текущего \"([^\"]*)\"$")
    public void checkUrl(String url) {
        PersonalAccoundSteps.assertCurrentUrl(url);
    }

}
