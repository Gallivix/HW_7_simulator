import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static tests.testdata.TestForm.*;

public class ВарTestPracticeForm extends PracticeForm {
    @Test
    void StudentRegistrationForm() {
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
        $("[id=firstName]").setValue(firstName);
        $("[id=lastName]").setValue(lastName);
        $("[id=userEmail]").setValue(userEmail);
        $("[for=gender-radio-1]").click();
        $("[id=userNumber]").setValue(userNumber);
        $("[id=subjectsInput]").click();
        $("[id=subjectsInput]").setValue(subjectsInput);
        $("[id=react-select-2-option-0]").click();
        $("[id=hobbies-checkbox-1]").click();
        $("[id=currentAddress]").setValue(currentAddress);
        $("[id=state]").click();
        $("[id=react-select-3-option-1]").click();
        $("[id=city]").click();
        $("[id=react-select-4-option-1]").click();
        $("[id=submit]").click();

        $("div.modal-dialog").should(appear);
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(text("Artem"), text("Izbyshev"),
                text("izbyshev-aa@mail.ru"),
                text("9620352740"));

    }
}
