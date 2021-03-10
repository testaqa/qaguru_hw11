package tests;

import org.junit.jupiter.api.BeforeAll;
import pages.HomePage;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    HomePage homePage = new HomePage();

    @BeforeAll
    public static void BeforeAll(){
        open("https://godzila.bg/en/");
        HomePage homePage = new HomePage();
        homePage.citySelection.first().click();
    }
}
