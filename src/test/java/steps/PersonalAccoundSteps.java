package steps;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;

public class PersonalAccoundSteps {
    private static WebDriver driver;
    protected static WebDriverWait wait;

    public static void assertCurrentUrl(String url) {
        Assert.assertEquals(url, driver.getCurrentUrl());
    }

    public static void openTabByName(String tabName) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable
                    (driver.findElement(By.cssSelector(String.format("[title=\"%s\"]", tabName))))).click();
        } catch (Exception e) {
            wait.until(ExpectedConditions.elementToBeClickable
                    (driver.findElement(By.cssSelector(String.format("[title=\"%s\"]", tabName))))).click();
        }
    }
}
