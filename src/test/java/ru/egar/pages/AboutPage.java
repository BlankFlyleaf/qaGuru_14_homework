package ru.egar.pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.assertj.core.api.Assertions.assertThat;

public class AboutPage {
    private final SelenideElement aboutCompanySummary = $("[field='tn_text_1727520405082']");
    private final SelenideElement historyButton = $("a.tn-atom[href='/anniversary']");
    private final SelenideElement anniversaryText = $("[field='tn_text_1757954613382']");

    @Step("Открываем страницу 'О компании'")
    public AboutPage openAbout() {
        open("/about#submenu:about");

        return this;
    }

    @Step("Проверяем краткое описании компании 'Egar")
    public AboutPage checkAboutCompanyText() {
        aboutCompanySummary
                .shouldHave(text("EGAR – российская компания, работающая в сфере разработки программного обеспечения, системной интеграции и оказания комплексных ИТ-услуг."));

        return this;
    }

    @Step("Проверяем кнопку 'История EGAR'")
    public AboutPage checkHistoryButton() {
        historyButton
                .scrollTo()
                .shouldBe(visible)
                .shouldBe(enabled)
                .shouldHave(text("История EGAR"));

        return this;
    }

    @Step("Нажимаем кнопку 'История EGAR'")
    public AboutPage clickHistoryButton() {
        historyButton
                .click();

        return this;
    }

    @Step("Проверяем, что совершен переход на страницу '/anniversary'")
    public AboutPage checkCorrectPage() {
        assertThat(WebDriverRunner.url()).endsWith("/anniversary");

        return this;
    }

    @Step("Проверяем текст годовщины")
    public AboutPage checkAnniversaryText() {
        anniversaryText
                .shouldHave(text("Более 25 лет мы упрощаем работу финансового сектора, делая банковские продукты доступными и удобными для людей, а также создаем передовые ИТ-решения \n для цифровизации промышленности."));

        return this;
    }
}
