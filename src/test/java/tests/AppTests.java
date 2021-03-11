package tests;

import config.ConfigHelper;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;

public class AppTests extends BaseTest{

    @Test
    void UserLogin() {
        homePage.loginLink.click();
        homePage.emailField.setValue(ConfigHelper.getAppUsername());
        homePage.passwordField.setValue(ConfigHelper.getAppPassword());
        homePage.submitLoginButton.click();

        homePage.logoutLink.shouldBe(visible, Duration.ofSeconds(30));
    }

    @Test
    @Tag("web")
    void MenuSectionsPresented() {
        homePage.menuSections.shouldHaveSize(6);
    }

    @Test
    @Tag("web")
    void SearchFieldExists() {
        homePage.searchField.should(exist);
    }
}
