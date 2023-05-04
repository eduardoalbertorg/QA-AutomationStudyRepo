package steps;

import org.openqa.selenium.WebDriver;

public class BaseSteps {
    protected WebDriver webDriver;

    public BaseSteps(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public String getCurrentUrl() {
        return this.webDriver.getCurrentUrl();
    }

    public String getPageTitle() {
        return this.webDriver.getTitle();
    }

    public void closeWindow() {
        this.webDriver.close();
    }

    public void quitDriver() {
        this.webDriver.quit();
    }
}
