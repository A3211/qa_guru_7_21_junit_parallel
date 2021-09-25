package tests.page;

import com.codeborne.selenide.CollectionCondition;

import static com.codeborne.selenide.Selenide.$$;

public class YoutubeResultsPage {

    public void checkResults(String expected) {
        $$("body").shouldHave(CollectionCondition.texts(expected));
    }
}
