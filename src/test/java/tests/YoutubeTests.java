package tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import tests.page.YoutubeMainPage;

import static com.codeborne.selenide.Selenide.*;

public class YoutubeTests {
    static YoutubeMainPage youtubeMainPage = new YoutubeMainPage();

    @ValueSource(strings = {
            "MAN HALTS CHARGING ELEPHANT",
            "Curious spotted hyena jumps on car - Ngorongoro Crater",
            "People Dying Inside Compilation #26"
    })
    @ParameterizedTest
    void youtubeParallelTest(String searchQuery) {
        open("https://www.youtube.com/");
        new YoutubeMainPage().doSearch(searchQuery)
                .checkResults(searchQuery);
    }

    @Test
    void keyBoardTest1() {
        open("https://www.youtube.com/");
        new YoutubeMainPage().openVirtualKeyboard()
                .setValuesOnKeyboard("1")
                .closeVirtualKeyboard();
    }

    @Test
    void keyBoardTest2() {
        open("https://www.youtube.com/");
        new YoutubeMainPage().openVirtualKeyboard()
                .setValuesOnKeyboard("1")
                .setValuesOnKeyboard("2")
                .closeVirtualKeyboard();
    }

    @Test
    void keyBoardTest3() {
        open("https://www.youtube.com/");
        new YoutubeMainPage().openVirtualKeyboard()
                .setValuesOnKeyboard("1")
                .setValuesOnKeyboard("2")
                .setValuesOnKeyboard("3")
                .setValuesOnKeyboard("1")
                .setValuesOnKeyboard("2")
                .setValuesOnKeyboard("3")
                .setValuesOnKeyboard("1")
                .setValuesOnKeyboard("2")
                .setValuesOnKeyboard("3")
                .setValuesOnKeyboard("1")
                .setValuesOnKeyboard("2")
                .setValuesOnKeyboard("3")
                .setValuesOnKeyboard("1")
                .setValuesOnKeyboard("2")
                .setValuesOnKeyboard("3")
                .setValuesOnKeyboard("1")
                .setValuesOnKeyboard("2")
                .setValuesOnKeyboard("3")
                .setValuesOnKeyboard("1")
                .setValuesOnKeyboard("2")
                .setValuesOnKeyboard("3")
                .closeVirtualKeyboard();
    }
}
