import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import steps.FacebookSteps;
import steps.GoogleSteps;

public class GoogleTest extends BaseTest {
    private WebDriver webDriver = getWebDriver();
    private GoogleSteps googleSteps = new GoogleSteps(webDriver);
    private FacebookSteps facebookSteps = new FacebookSteps(webDriver);

    @Test
    public void openGoogleTest() {
        String googleURL = "https://www.google.com/";
        googleSteps.openGoogleHomepage();
        String actualURL = googleSteps.getCurrentUrl();
        Assert.assertEquals(actualURL, googleURL);
    }

    @Test
    public void titleGoogleTest() {
        String expectedTitle = "Google";
        googleSteps.openGoogleHomepage();
        String actualTitle = googleSteps.getPageTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Test
    public void navigateToFacebookTest() {
        String googleURL = "https://www.google.com/";
        googleSteps.openGoogleHomepage();
        String actualURL = googleSteps.getCurrentUrl();
        Assert.assertEquals(actualURL, googleURL);

        String expectedTitle = "Facebook - Inicia sesión o regístrate";
        facebookSteps.navigateToFacebook();
        String actualTitle = facebookSteps.getPageTitle();
        Assert.assertEquals(actualTitle, expectedTitle);

    }
}
