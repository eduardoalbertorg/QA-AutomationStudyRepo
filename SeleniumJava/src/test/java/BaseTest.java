import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class BaseTest {
    private WebDriver webDriver;

    public BaseTest() {
        WebDriverManager.chromedriver().setup();
    }

    public WebDriver getWebDriver() {
        if (this.webDriver == null) {
            this.webDriver = new ChromeDriver();
        }
        return this.webDriver;
    }

    @AfterTest
    public void closeDriver() {
        this.webDriver.quit();
    }
}
