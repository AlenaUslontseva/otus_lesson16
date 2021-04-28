package step;

import config.ServerConfig;
import drivers.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Пусть;
import io.cucumber.java.ru.Тогда;
import org.aeonbits.owner.ConfigFactory;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.MainPage;
import pages.PersonalAccountPage;

import static drivers.DriverManager.getWebDriver;


public class SampleTest {
    MainPage mainPage = new MainPage();
    private ServerConfig cfg = ConfigFactory.create(ServerConfig.class);
    //PersonalAccountPage personalAccountPage = new PersonalAccountPage();

    @Before()
    public void setupDriver() {
        DriverManager.setupDriver();
    }

    @After()
    public void quitDriver() {
        DriverManager.quitDriver();
    }

    @Пусть("^выполнен вход на сайт \"([^\"]*)\"$")
    public void signIn(String url) {
        getWebDriver().navigate().to(url);
    }

    @И("пройдена проверка title стартовой страницы")
    public void checkTitleStartPage() {
        String expectedResult = "Онлайн‑курсы для профессионалов, дистанционное обучение современным профессиям";
        String actualResult = getWebDriver().getTitle();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Когда("открылось окно с регистрацией")
    public void registrationPage() {
        mainPage.getRegistrationButton().click();
    }

    @И("в поле email указан email незарегистрированного пользователя")
    public void specifyEmail() { //specify-указать
        mainPage.findEmailField().sendKeys(cfg.emailNegativeTest());
    }

    @И("в поле password указан password незарегистрированного пользователя")
    public void specifyPasswordPositive() {  //specify-указать
        mainPage.findPasswordField().sendKeys(cfg.passwordNegativeTest());
    }

    @И("в поле email указан  email зарегистрированного пользователя")
    public void specifyEmailPositive() { //specify-указать
        mainPage.findEmailField().sendKeys(cfg.emailPositiveTest());
    }

    @И("в поле пароль указан password зарегистрированного пользователя")
    public void specifyPassword() {  //specify-указать
        mainPage.findPasswordField().sendKeys(cfg.passwordPositiveTest());
    }

    @И("нажата кнопка Войти")
    public void clickButtonToComeIn() {
        mainPage.pushTheButtonComeIn().click();
    }

    @Тогда("вышло сообщение об ошибке")
    public void checkErrorMessage() {
        Assert.assertNotNull("Сообщения об ошибке не существует", mainPage.isErrorLabelVisible());
    }

    @Тогда("выполнена проверка появления иконки пользователя")
    public void checkLogo() {
        Assert.assertNotNull("Лого пользователя найдено", mainPage.findLogo());
    }

}

