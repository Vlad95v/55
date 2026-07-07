package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;



import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests extends TestBase {

    @Test
    void succesfulFillRormTests() {

        open("https://demoqa.com/automation-practice-form");
        $("[id=firstName]").setValue("Roman");
        $("[id=lastName]").setValue("Ivanov");
        $("[id=userEmail]").setValue("roman@ivi.ru");
        $("[id=userNumber]").setValue("8999655666");
        $("[for=gender-radio-1]").click();
        $("[id=react-select-2-live-region]").setValue("Hindi");
        $("[id=hobbies-checkbox-1]").click();
        $("[id=hobbies-checkbox-3").click();
        $(".css-hlgwow").click();
        $("[id=submit]").click();

        $(".modal-content").shouldBe(visible);
      //  $("tbody tr:first-child td:last-child").shouldHave(text("Roman Ivanov"));

    }
    @Test
    void succesfulFillRormTests() {
        Configuration.browserSize = "1920x1080";

        open("https://demoqa.com/automation-practice-form");
        $("[id=firstName]").setValue("Roman");
        $("[id=lastName]").setValue("Ivanov");
        $("[id=userEmail]").setValue("roman@ivi.ru");
        $("[id=userNumber]").setValue("8999655666");
        $("[for=gender-radio-1]").click();
        $("[id=react-select-2-live-region]").setValue("Hindi");
        $("[id=hobbies-checkbox-1]").click();
        $("[id=hobbies-checkbox-3").click();
        $(".css-hlgwow").click();
        $("[id=submit]").click();

        $(".modal-content").shouldBe(visible);
        //  $("tbody tr:first-child td:last-child").shouldHave(text("Roman Ivanov"));

    }
}
