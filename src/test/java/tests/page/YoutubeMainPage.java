package tests.page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class YoutubeMainPage {

    private static SelenideElement searchInput = $(By.name("search_query"));
    private static SelenideElement virtualKeyboard = $("#gs_ok50");

    private static ElementsCollection keyboardButtons =  $$(".vk-btn");

    public YoutubeResultsPage doSearch (String query) {
        searchInput.setValue(query).pressEnter();
        return new YoutubeResultsPage();
    }

    public YoutubeMainPage openVirtualKeyboard () {
        searchInput.hover();
        virtualKeyboard.click();
        return new YoutubeMainPage();
    }

    public YoutubeMainPage closeVirtualKeyboard () {
        virtualKeyboard.click();
        return new YoutubeMainPage();
    }

    public YoutubeMainPage setValuesOnKeyboard (String key) {
        keyboardButtons.findBy(Condition.text(key)).click();
        return new YoutubeMainPage();
    }


}
