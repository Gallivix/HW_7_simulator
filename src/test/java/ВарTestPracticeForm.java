import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ВарTestPracticeForm extends PracticeForm {
    @Test
    void StudentRegistrationForm() {
        open("/automation-practice-form");
        $("[id=firstName]").setValue("Artem");
        $("[id=lastName]").setValue("Izbyshev");
        $("[id=userEmail]").setValue("izbyshev-aa@mail.ru");
        $("[for=gender-radio-1]").click();
        $("[id=userNumber]").setValue("9620352740");
        $("[id=subjectsInput]").click();
        $("[id=subjectsInput]").setValue("Physics");
        $("[id=react-select-2-option-0]").click();
        $("[id=hobbies-checkbox-1]").click();

        $("[id=currentAddress]").setValue("currentAddress");
        $("[id=state]").click();
        $("[id=react-select-3-option-1]").click();
        $("[id=city]").click();
        $("[id=react-select-4-option-1]").click();
        $("[id=submit]").click();
    }
}
