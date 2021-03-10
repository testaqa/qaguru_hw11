package tests;

import config.AuthConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;
import pages.HomePage;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    AuthConfig config = ConfigFactory.create(AuthConfig.class, System.getProperties());
    HomePage homePage = new HomePage();

    @BeforeAll
    public static void BeforeAll(){
        open("https://godzila.bg/en/");
        HomePage homePage = new HomePage();
        homePage.citySelection.first().click();
    }
}
