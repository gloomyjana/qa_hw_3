import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class GithubCheckTests {
    @Test
    void checkJUnit5CodeExampleTest() {
        open("https://github.com/selenide/selenide");

        $("#wiki-tab").click();
        $(".wiki-more-pages-link").$("button").click();
        $(".Box--condensed").shouldHave(text("SoftAssertions"));
        $(byText("SoftAssertions")).click();
        $(".markdown-body").shouldHave(text("Using JUnit5 extend test class"));
    }
}
