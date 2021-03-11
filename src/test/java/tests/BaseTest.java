package tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import helpers.DriverHelper;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import pages.HomePage;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    HomePage homePage = new HomePage();

    @BeforeAll
    public static void BeforeAll(){
        SelenideLogger.addListener("allure", new AllureSelenide().screenshots(true).savePageSource(true));

        DriverHelper.configureDriver();

        open("");
        HomePage homePage = new HomePage();
        homePage.citySelection.first().click();
    }
}
