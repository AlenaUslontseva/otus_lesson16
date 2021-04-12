package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static drivers.DriverManager.getWebDriver;

public class MainPage {
    String registrationButtonLocator = "header2__auth-container";
    String emailFieldLocator = "//input[@type='text']";
    String passwordFieldLocator = "//input[@type='password']";
    String buttonComeInLocator ="div.new-input-line_last:nth-child(5) > button:nth-child(1)";
   //String buttonComeInLocator ="[class=\"new-log-reg__form js-login\"] [type=\"submit\"]";
    String errorMessage =   ".new-input-error.new-input-error_top.new-input-error_form.js-text";
    String logoLocator = "header2-menu__icon";
    // protected WebDriverWait wait;

    public WebElement getRegistrationButton() {
        return getWebDriver().findElement(By.className(registrationButtonLocator));
    }

    public WebElement findEmailField() { //Field-поле
        return getWebDriver().findElement(By.xpath(emailFieldLocator));
    }

    public WebElement findPasswordField() {
        return getWebDriver().findElement(By.xpath(passwordFieldLocator));
    }

    public WebElement pushTheButtonComeIn() {
        return getWebDriver().findElement(By.cssSelector(buttonComeInLocator));
    }

    public WebElement isErrorLabelVisible() { //is Error Label Visible-видна ли ошибка
       return getWebDriver().findElement(By.cssSelector(errorMessage));
    }

    public WebElement findLogo() {
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(logoLocator)));
        return getWebDriver().findElement(By.className(logoLocator));
    }

}
