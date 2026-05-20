import org.junit.jupiter.api.Test;
import pages.RegistrationFormPage;
//import pages.RegistrationFormPage;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static tests.testdata.TestForm.*;

public class ВарTestPracticeForm extends PracticeForm {

    RegistrationFormPage registrationFormPage = new RegistrationFormPage();


    @Test
    void StudentRegistrationForm_pageObject() {
        registrationFormPage.openPage();
        registrationFormPage.typeFirstName(firstName);
        registrationFormPage.typeLastNameInput(lastName);
        registrationFormPage.typeUserEmail(userEmail);
        registrationFormPage.setGender();
        registrationFormPage.typeUserNumberInput(userNumber);
        registrationFormPage.typeSubjects();
        registrationFormPage.typeSubjectsInput(subjectsInput);
        registrationFormPage.typeSubjectsClick();
        registrationFormPage.typeHobbiesCheckBox();
        registrationFormPage.typeCurrentAddress(currentAddress);
        registrationFormPage.state();
        registrationFormPage.typeState();
        registrationFormPage.city();
        registrationFormPage.typeCity();
        registrationFormPage.SubmitForm();
        registrationFormPage.checkModalAppears();
        registrationFormPage.checkResult("Student Name", firstName + " " + lastName);
        registrationFormPage.checkResult("Student Email", userEmail);
        registrationFormPage.checkResult("Mobile", userNumber);

    }




    @Test
    void StudentRegistrationForm_old() {
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
        $(".table-responsive").shouldHave(text(firstName), text(lastName),
                text(userEmail),
                text(userNumber));

    }
}
