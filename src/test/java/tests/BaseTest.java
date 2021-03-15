package tests;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import helpers.DriverHelper;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import pages.HomePage;

import static com.codeborne.selenide.Selenide.open;
import static helpers.AttachmentsHelper.*;

public class BaseTest {

    HomePage homePage = new HomePage();

    @BeforeAll
    public static void BeforeAll() {
        SelenideLogger.addListener("allure", new AllureSelenide().screenshots(true).savePageSource(true));

        DriverHelper.configureDriver();
    }

    @BeforeEach
    public void BeforeEach() {
        open("");
        HomePage homePage = new HomePage();
        if (homePage.citySelection.size() > 0) {
            homePage.citySelection.first().click();
        }
    }

    @AfterEach
    public void afterEach() {
        attachScreenshot("Last screenshot");
        attachPageSource();
        attachAsText("Browser console logs", getConsoleLogs());
        attachVideo();
    }
}
