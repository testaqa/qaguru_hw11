package tests;

import config.ConfigHelper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;
import static io.qameta.allure.Allure.step;

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

    @Test
    @Tag("web")
    @DisplayName("Verify menu sections and search field with steps in test")
    void StepsInTest() {
        step("Verify menu sections count", () -> {
            homePage.menuSections.shouldHaveSize(6);
        });

        step("Verify search field exists", () -> {
            homePage.searchField.should(exist);
        });
    }

    @Test
    @Tag("web")
    @DisplayName("Verify steps in PageObject")
    void StepsInPage() {
        homePage.IsSearchFieldExists();
        homePage.VerifyMenuSectionsCount(6);
    }
}
