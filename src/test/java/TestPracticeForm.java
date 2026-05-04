import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestPracticeForm extends PracticeForm {
    @Test
    void StudentRegistrationForm() {
        open("/automation-practice-form");
        $("[id=firstName]").setValue("Artem");
        $("[id=lastName]").setValue("Izbyshev");
        $("[id=userEmail]").setValue("izbyshev-aa@mail.ru");
        $("[for=gender-radio-1]").click();
        $("[id=hobbies-checkbox-1]").click();
        $("[id=userNumber]").setValue("9620352740");
        $("[id=currentAddress]").setValue("currentAddress");
        $("[id=state]").click();
        $("[id = react-select-3-option-2]").click();
        $("[id=submit]").click();
    }


}
