package tests;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class AppTests {

    @Test
    void UserLogin() {
        open("https://godzila.bg/en/");
        $(".popup-btn-city").click();
        $(byText("login")).click();
        $("#login-email").setValue("testaqa@protonmail.com");
        $("input[name=password]").setValue("testaqa1");
        $(".popup.show button.popup-btn-login").click();

        $(byText("logout")).shouldBe(visible, Duration.ofSeconds(30));
    }
}
