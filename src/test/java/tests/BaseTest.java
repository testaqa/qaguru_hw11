package tests;

import helpers.DriverHelper;
import org.junit.jupiter.api.BeforeAll;
import pages.HomePage;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {

    HomePage homePage = new HomePage();

    @BeforeAll
    public static void BeforeAll(){

        DriverHelper.configureDriver();

        open("");
        HomePage homePage = new HomePage();
        homePage.citySelection.first().click();
    }
}
