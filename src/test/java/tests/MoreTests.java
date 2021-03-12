package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exist;

public class MoreTests extends BaseTest{

    @Test
    @Tag("web")
    void NewTest1() {
        homePage.menuSections.shouldHaveSize(6);
    }

    @Test
    @Tag("web")
    void NewTest2() {
        homePage.searchField.should(exist);
    }
}
