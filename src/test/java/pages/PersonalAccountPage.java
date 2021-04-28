package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class PersonalAccountPage extends BasePage {
    public PersonalAccountPage(WebDriver driver) {
        super(driver);
    }

    public void openTabByName(String tabName) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable
                    (driver.findElement(By.cssSelector(String.format("[title=\"%s\"]", tabName))))).click();
        } catch (Exception e) {
            wait.until(ExpectedConditions.elementToBeClickable
                    (driver.findElement(By.cssSelector(String.format("[title=\"%s\"]", tabName))))).click();
        }
    }
}
