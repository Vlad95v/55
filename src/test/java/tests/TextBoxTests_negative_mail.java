package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;



import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests_negative_mail {

    @Test
    void succesfulFillRormTests() {
        Configuration.browserSize = "1920x1080";

        open("https://demoqa.com/automation-practice-form");
        $("[id=firstName]").setValue("Roman");
        $("[id=lastName]").setValue("Ivanov");
        $("[id=userEmail]").setValue("romanvi.ru");
        $("[id=userNumber]").setValue("8999655666");
        $("[for=gender-radio-1]").click();
        $("[id=submit]").click();

        $(".modal-content").shouldNotBe(visible);

    }
}
