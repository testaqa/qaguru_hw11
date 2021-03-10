package tests;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;

public class AppTests extends BaseTest{

    @Test
    void UserLogin() {
        homePage.loginLink.click();
        homePage.emailField.setValue(config.username());
        homePage.passwordField.setValue(config.password());
        homePage.submitLoginButton.click();

        homePage.logoutLink.shouldBe(visible, Duration.ofSeconds(30));
    }

    @Test
    void MenuSectionsPresented() {
        homePage.menuSections.shouldHaveSize(6);
    }
}
