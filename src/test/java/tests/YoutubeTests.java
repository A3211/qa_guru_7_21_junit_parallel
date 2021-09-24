package tests;

import com.codeborne.selenide.CollectionCondition;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class YoutubeTests {

    @ValueSource(strings = {
            "MAN HALTS CHARGING ELEPHANT",
            "Curious spotted hyena jumps on car - Ngorongoro Crater",
            "People Dying Inside Compilation #26"
    })
    @ParameterizedTest
    void youtubeParallelTest(String searchQuery) {
        open("https://www.youtube.com/");
        $(By.name("search_query")).setValue(searchQuery).pressEnter();
        $$("body").shouldHave(CollectionCondition.texts(searchQuery));
    }
}
