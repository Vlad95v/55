import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxTests extends TestBase {

    @Test
    void succesfulFillRormTests() {
        open("/automation-practice-form");
        $("#firstName").setValue("Roman");
        $("#lastName").setValue("Ivanov");
        $("#userEmail").setValue("roman@ivi.ru");

        $("#gender-radio-1").click();
        $("#userNumber").setValue("8999655666");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__year-select").selectOption("2027");
        $(".react-datepicker__month-select").selectOption("May");
        $(".react-datepicker__day--019").click();

        $("#subjectsInput").setValue("E");
        $$("[role='option']").get(0).shouldBe(visible).click();
        $("#subjectsInput").clear();
        $("#subjectsInput").setValue("H");
        $$("[role='option']").get(0).shouldBe(visible).click();
        $("#hobbies-checkbox-3").click();
        $("#uploadPicture").uploadFromClasspath("photo.jpg");
        $("#currentAddress").setValue("Москва, проспект Андропова");

        $("#state").click();
        $("#react-select-3-option-1").click();
        $("#city").click();
        $("#react-select-4-option-1").click();
        $("#submit").click();



        $(".modal-content").shouldBe(visible);
        //  $("tbody tr:first-child td:last-child").shouldHave(text("Roman Ivanov"));

    }
}
