package step;


import drivers.WebDriverFactory;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class DriverHooks {
    private static final Logger logger = LogManager.getLogger(WebDriverFactory.class);

    @Before()
    public void setupDriver() {
        WebDriverFactory.setupDriver();
    }

    @After()
    public void quitDriver() {
        WebDriverFactory.quitDriver();
    }
}

