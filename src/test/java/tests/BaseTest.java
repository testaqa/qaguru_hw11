package tests;

import com.codeborne.selenide.Configuration;
import config.ConfigHelper;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.HomePage;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    HomePage homePage = new HomePage();

    @BeforeAll
    public static void BeforeAll(){
        Configuration.baseUrl = ConfigHelper.getWebUrl();
        Configuration.browser = System.getProperty("browser", "chrome");
var test = ConfigHelper.isRemoteWebDriver();

        if (ConfigHelper.isRemoteWebDriver()) {
            Configuration.remote = ConfigHelper.getWebRemoteDriver();

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("enableVNC", true);
            capabilities.setCapability("enableVideo", true);
            Configuration.browserCapabilities = capabilities;
        }

        open("");
        HomePage homePage = new HomePage();
        homePage.citySelection.first().click();
    }
}
