package steps;

import config.ServerConfig;
import drivers.WebDriverFactory;
import io.cucumber.java.bg.И;
import io.cucumber.java.ru.Тогда;
import org.aeonbits.owner.ConfigFactory;
import pages.TopPanel;

public class TopPanelSteps {
    private TopPanel topPanel = new TopPanel(WebDriverFactory.getWebDriver());
    private ServerConfig cfg = ConfigFactory.create(ServerConfig.class);

    @И("пользователь переходит в личный кабинет")
    public void goToAccount() {
        topPanel.goToAccound();
    }

}
