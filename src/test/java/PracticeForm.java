import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class PracticeForm {
    @BeforeAll
    static void beforeAll() {

        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.timeout = 10000;

        // Задаём размер и положение окна
        Configuration.browserSize = "1920x1080";
        Configuration.browserPosition = "0x0";   // ← это ключевой параметр!

        Configuration.holdBrowserOpen = true;
    }
}