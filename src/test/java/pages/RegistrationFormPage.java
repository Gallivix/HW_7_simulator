package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationFormPage {

// Elements
private SelenideElement outputResults = $(".table-responsive");
private SelenideElement modalDialog = $("div.modal-dialog");
private SelenideElement modalTitle = $("#example-modal-sizes-title-lg");

private SelenideElement firstNameInput = $("#firstName");
private SelenideElement lastNameInput = $("#lastName");
private SelenideElement userEmailInput = $("#userEmail");
private SelenideElement genderContainer = $("[for=gender-radio-1]");
private SelenideElement userNumberInput = $("#userNumber");
private SelenideElement subjects = $("#subjectsInput");
private SelenideElement subjectsInput = $("#subjectsInput");
private SelenideElement subjectsClick =  $("#react-select-2-option-0");
private SelenideElement hobbiesCheckBox = $("#hobbies-checkbox-1");
private SelenideElement currentAddressInput =  $("#currentAddress");
private SelenideElement state =  $("#state");
private SelenideElement stateInput = $("#react-select-3-option-1");
private SelenideElement city =  $("#city");
private SelenideElement cityInput= $("#react-select-4-option-1");
public SelenideElement submitButton = $("#submit");

    public RegistrationFormPage openPage() {
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
        return this;
    }





// Actions

    public RegistrationFormPage typeFirstName(String value) {
        firstNameInput.setValue(value);

        return this;
    }


    public RegistrationFormPage typeLastNameInput(String value) {
        lastNameInput.setValue(value);

        return this;
    }

    public RegistrationFormPage typeUserEmail(String value) {
        userEmailInput.setValue(value);

        return this;
    }

    public RegistrationFormPage setGender() {
        genderContainer.click();
        return this;
    }

    public RegistrationFormPage typeUserNumberInput(String value) {
        userNumberInput.setValue(value);

        return this;
    }

    public RegistrationFormPage typeSubjects() {
        subjects.click();
        return this;
    }

    public RegistrationFormPage typeSubjectsInput(String value) {
        subjectsInput.setValue(value);

        return this;
    }

    public RegistrationFormPage typeSubjectsClick() {
        subjectsClick.click();
        return this;
    }

    public RegistrationFormPage typeHobbiesCheckBox() {
        hobbiesCheckBox.click();
        return this;
    }

    public RegistrationFormPage typeCurrentAddress(String value) {
        currentAddressInput.setValue(value);
        return this;
    }

    public RegistrationFormPage state() {
        state.click();
        return this;
    }

    public RegistrationFormPage typeState() {
        stateInput.click();
        return this;
    }

    public RegistrationFormPage city() {
        city.click();
        return this;
    }
    public RegistrationFormPage typeCity() {
        cityInput.click();
        return this;
    }

    public RegistrationFormPage SubmitForm() {
        submitButton.click();
        return this;
    }


    public RegistrationFormPage checkResult(String expectedValue) {
        outputResults.shouldHave(text(expectedValue));
        return this;
    }

    public RegistrationFormPage checkModalAppears() {
        modalDialog.should(appear);
        modalTitle.shouldHave(text("Thanks for submitting the form"));
        return this;
    }
}
