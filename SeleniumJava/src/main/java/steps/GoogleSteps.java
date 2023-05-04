package steps;

import org.openqa.selenium.WebDriver;

public class GoogleSteps extends BaseSteps {

    public GoogleSteps(WebDriver webDriver) {
        super(webDriver);
    }

    public void openGoogleHomepage() {
        this.webDriver.get("https://www.google.com/");
    }

}
