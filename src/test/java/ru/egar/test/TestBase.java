package ru.egar.test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.FileDownloadMode;
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

public class TestBase {
    CareerPage careerPage = new CareerPage();
    AboutPage aboutPage = new AboutPage();
    SmartMonitoringPage smartMonitoringPage = new SmartMonitoringPage();

    @BeforeAll
    static void testConfig() {
        Configuration.browser = System.getProperty("BROWSER", "chrome");
        Configuration.browserSize = System.getProperty("BROWSER_SIZE", "1920x1080");
        Configuration.pageLoadStrategy = System.getProperty("PAGE_LOAD_STRATEGY", "eager");
        Configuration.baseUrl = System.getProperty("BASE_URL", "https://egar.ru");
        Configuration.fileDownload = FileDownloadMode.FOLDER;
        Configuration.downloadsFolder = "build/downloads";

        String selenoidUrl = System.getProperty("SELENOID_URL");

        if (selenoidUrl != null && !selenoidUrl.isBlank()) {
            Configuration.browserVersion = System.getProperty("BROWSER_VERSION");
            Configuration.remote = ("https://" + System.getProperty("SELENOID_CREDENTIAL") + "@" + System.getProperty("SELENOID_URL"));
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                    "enableVNC", true,
                    "enableVideo", true
            ));
            Configuration.browserCapabilities = capabilities;
        }
    }

    @BeforeAll
    static void setUpAllure() {
        SelenideLogger.addListener("allure", new AllureSelenide());
    }

    @AfterEach
    void tearDown() {
            Attach.screenshotAs("Last screenshot");
            Attach.pageSource();
            Attach.browserConsoleLogs();
        if (System.getProperty("SELENOID_URL") != null) {
            Attach.addVideo();
        }
            Selenide.closeWebDriver();
    }
}
