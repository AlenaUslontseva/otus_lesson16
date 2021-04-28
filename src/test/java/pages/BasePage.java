package pages;

import org.aeonbits.owner.ConfigFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasePage {
    protected static final Logger logger = LogManager.getLogger(BasePage.class);
    protected WebDriver driver;
    protected static WebDriverWait wait;//явное ожидание
    protected final static int EXPLICIT_WAIT_TIME_OUT_TIME = 5;//время явного ожидания в секундах
    // protected final ServerConfig cfg = ConfigFactory.create(ServerConfig.class);//Конфиг для доступа к значениям из файла конфигурации
    protected static Actions actions;//для сложных действий

    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        actions = new Actions(driver);
        wait = new WebDriverWait(driver, EXPLICIT_WAIT_TIME_OUT_TIME);//инициализация явного ожидания
    }

    protected void moveToElement(WebElement element) {
        logger.info(String.format("Наводим курсор на элемент %s", element));
        actions.moveToElement(element).build().perform();
    }

}
