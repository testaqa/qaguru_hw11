package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class HomePage {
    public ElementsCollection citySelection = $$(".popup-btn-city");
    public SelenideElement loginLink = $(byText("login"));
    public SelenideElement emailField = $("#login-email");
    public SelenideElement passwordField = $("input[name=password]");
    public SelenideElement submitLoginButton = $(".popup.show button.popup-btn-login");
    public SelenideElement logoutLink = $(byText("logout"));
    public ElementsCollection menuSections = $$(".mainmenu-list li");
    public SelenideElement searchField = $("#searchbar-input");

    @Step("Verify than menu has {itemCount} items")
    public void VerifyMenuSectionsCount(int itemCount){
        menuSections.shouldHaveSize(itemCount);
    }

    @Step("Is search field exists")
    public boolean IsSearchFieldExists(){
        return searchField.exists();
    }
}
