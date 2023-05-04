package steps;

import org.openqa.selenium.WebDriver;

public class FacebookSteps extends BaseSteps {
    public FacebookSteps(WebDriver webDriver) {
        super(webDriver);
    }

    public void navigateToFacebook() {
        this.webDriver.navigate().to("https://www.facebook.com/");
    }
}
