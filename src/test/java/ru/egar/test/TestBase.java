package ru.egar.test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;
import ru.egar.helpers.Attach;
import ru.egar.pages.AboutPage;
import ru.egar.pages.CareerPage;
import ru.egar.pages.SmartMonitoringPage;

import java.util.Map;

import static com.codeborne.selenide.logevents.SelenideLogger.step;

public class TestBase {
    CareerPage careerPage = new CareerPage();
    AboutPage aboutPage = new AboutPage();
    SmartMonitoringPage smartMonitoringPage = new SmartMonitoringPage();

    @BeforeAll
    static void testConfig() {
        String browser = System.getProperty("BROWSER", "chrome");
        String browserVersion = System.getProperty("BROWSER_VERSION");
        String pageLoadStrategy = System.getProperty("PAGE_LOAD_STRATEGY", "eager");
        String browserSize = System.getProperty("BROWSER_SIZE", "1920x1080");
        String selenoidCredential = System.getProperty("SELENOID_CREDENTIAL");
        String selenoidUrl = System.getProperty("SELENOID_URL");
        String baseUrl = System.getProperty("BASE_URL");

        step("Задаем настройки для автотестов", () ->{
            Configuration.browser = browser;
            Configuration.browserVersion = browserVersion;
            Configuration.browserSize = browserSize;
            Configuration.pageLoadStrategy = pageLoadStrategy;
            Configuration.baseUrl = baseUrl;
            Configuration.remote = ("https://" + selenoidCredential + "@" + selenoidUrl);

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                    "enableVNC", true,
                    "enableVideo", true
            ));
            Configuration.browserCapabilities = capabilities;
        });
    }

    @BeforeAll
    static void setUpAllure() {
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @AfterEach
    void tearDown() {
        step("Добавляем аттачи", () ->{
            Attach.screenshotAs("Last screenshot");
            Attach.pageSource();
            Attach.browserConsoleLogs();
            Attach.addVideo();
        });
        step("Завершаем тест", Selenide::closeWebDriver);
    }
}
