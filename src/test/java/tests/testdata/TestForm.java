package tests.testdata;

import com.github.javafaker.Faker;

import java.util.Locale;

public class TestForm {

    static Faker fakerRu = new Faker(Locale.of("ru"));
    static Faker faker = new Faker();

    /*String userName = fakerRu.name().fullName();
    String userEmail = faker .internet().emailAddress();
    String currentAddress =  fakerRu.address().fullAddress();
    String permanentAddress = fakerRu.address().fullAddress();*/

    public static String firstName = fakerRu.name().name();
    public static String lastName = fakerRu.name().lastName();
    public static String userEmail =  faker.internet().emailAddress();
    public static String userNumber = faker.number().digits(10);
    public static String subjectsInput = "Physics";
    public static String currentAddress = fakerRu.address().fullAddress();
}
