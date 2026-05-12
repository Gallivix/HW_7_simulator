import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static tests.testdata.TestForm.*;

public class ВарTestPracticeForm extends PracticeForm {
    @Test
    void StudentRegistrationForm() {
        open("/automation-practice-form");
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
    }
}
