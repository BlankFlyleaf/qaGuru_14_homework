package ru.egar.test;

import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class AboutTest extends TestBase {

    @Test
    @Tag("Regression")
    @Story("Проверка кейсов на странице 'О компании'")
    @Owner("AChurilov")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Проверяем переход на страницу 'О компании' и 'История'")
    public void aboutCompanyTest() {
        aboutPage
                .openAbout()
                .checkAboutCompanyText()
                .checkHistoryButton()
                .clickHistoryButton()
                .checkCorrectPage()
                .checkAnniversaryText();
    }
}
