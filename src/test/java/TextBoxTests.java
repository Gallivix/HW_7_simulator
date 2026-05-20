import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import pages.TextBoxPage;
import java.util.Locale;
import static tests.testdata.TestData.*;
import static utils.RandomUtils.getRandomEmail;
import static utils.RandomUtils.getRandomString;

public class TextBoxTests extends TestBase {
    TextBoxPage textBoxPage = new TextBoxPage();
    Faker fakerRu = new Faker(Locale.of("ru"));
    Faker faker = new Faker();



    @Test


    void successfulFillFormTest_with_utils() {
        String userName = getRandomString(10);
        String userEmail = getRandomEmail();
        String currentAddress =  getRandomString(100);
        String permanentAddress = getRandomString(90);


        textBoxPage.openPage();
        textBoxPage.typeUserName(userName);
        textBoxPage.typeUserEmail(userEmail);
        textBoxPage.typeCurrentAddress(currentAddress);
        textBoxPage.typePermanentAddress(permanentAddress);
        textBoxPage.SubmitForm();
        textBoxPage.checkField("name", userName);
        textBoxPage.checkField("email", userEmail);
        textBoxPage.checkField("currentAddress", currentAddress);
        textBoxPage.checkField("permanentAddress", permanentAddress);
    }



    @Test
    void successfulFillFormTest_with_faker() {
        String userName = fakerRu.name().fullName();
        String userEmail = faker .internet().emailAddress();
        String currentAddress =  fakerRu.address().fullAddress();
        String permanentAddress = fakerRu.address().fullAddress();

        textBoxPage.openPage();
        textBoxPage.typeUserName(userName);
        textBoxPage.typeUserEmail(userEmail);
        textBoxPage.typeCurrentAddress(currentAddress);
        textBoxPage.typePermanentAddress(permanentAddress);
        textBoxPage.SubmitForm();
        textBoxPage.checkField("name", userName);
        textBoxPage.checkField("email", userEmail);
        textBoxPage.checkField("currentAddress", currentAddress);
        textBoxPage.checkField("permanentAddress", permanentAddress);
    }




    @Test

    void successfulFillFormTest() {
        textBoxPage.openPage();
        textBoxPage.typeUserName(userName);
        textBoxPage.typeUserEmail(userEmail);
        textBoxPage.typeCurrentAddress(currentAddress);
        textBoxPage.typePermanentAddress(permanentAddress);
        textBoxPage.SubmitForm();
        textBoxPage.checkField("name", userName);
        textBoxPage.checkField("email", userEmail);
        textBoxPage.checkField("currentAddress", currentAddress);
        textBoxPage.checkField("permanentAddress", permanentAddress);

    }

    @Test
    void sucessfulFillFormWithoutAdressTest_chaining() {
        textBoxPage.
                openPage()
                .typeUserName(userName)
                .typeUserEmail(userEmail)
                .SubmitForm()
                .checkField("name", userName)
                .checkField("name", userEmail);
    }

    @Test
    void sucessfulFillFormWithoutAdressTest() {
       /* textBoxPage.openPage()
                .typeUserName(userName)
                .typeUserEmail(userEmail)
                .SubmitForm()
                .checkField("name", userName)
                .checkField("name", userEmail);*/


        /*textBoxPage.typeUserName(userName);
        textBoxPage.typeUserEmail(userEmail);
        textBoxPage.SubmitForm();
        textBoxPage.checkField("name", userName);
        textBoxPage.checkField("name", userEmail);*/
    }



}
