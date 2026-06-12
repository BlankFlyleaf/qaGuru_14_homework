package ru.egar.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import ru.egar.pages.component.OpticalAndTooltipHoverComponent;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CareerPage {

    private SelenideElement feedBackButton = $(".t228__right_buttons");
    private SelenideElement modlDialog = $(".t702__wrapper");
    private SelenideElement modalTitle = $("#popuptitle_783271288");
    private SelenideElement emailHeader = $("#field-title_1629901744875");
    private SelenideElement emailInput = $("#input_1629901744875");
    private SelenideElement phoneHeader = $("#field-title_1629901767207");
    private SelenideElement phoneInput = $("#input_1629901767207");
    private SelenideElement nameHeader = $("#field-title_1495810354468");
    private SelenideElement nameInput = $("#input_1495810354468");
    private SelenideElement companyHeader = $("#field-title_1630012770354");
    private SelenideElement companyInput = $("#input_1630012770354");
    private SelenideElement jobhHeader = $("#field-title_1630012788697");
    private SelenideElement jobhInput = $("#input_1630012788697");
    private SelenideElement commentHeader = $("#field-title_1629901868249");
    private SelenideElement commentInput = $("#input_1629901868249");
    private SelenideElement checkboxHeader = $(".t-checkbox__control span");
    private SelenideElement checkboxInput = $("[data-input-lid='1679027361388']");
    private SelenideElement submitButtonHeader = $(".t-submit span");
    private SelenideElement submitButton = $(".t-submit span");

    @Step("Открываем страницу Карьера")
    public CareerPage openCareer() {
        open("/career");

        return this;
    }

    @Step("Проверка оптического ховера - {title}")
    public CareerPage checkHover (String titleId, String title, String resultId, String result) {
        OpticalAndTooltipHoverComponent opticalHover = new OpticalAndTooltipHoverComponent();

        opticalHover.checkTitleOfHover(titleId, title);
        opticalHover.triggerHover(titleId);
        opticalHover.checkResultOfHover(resultId, result);

        return this;
    }

    @Step("Проверка кнопки 'Связаться с нами'")
    public CareerPage checkFeedbackButton() {
        feedBackButton
                .shouldBe(visible)
                .shouldBe(enabled)
                .shouldBe(clickable)
                .shouldHave(text("СВЯЗАТЬСЯ С НАМИ"));

        return this;
    }

    @Step("Нажатие кнопки 'Связиться с нами'")
    public CareerPage clickFeedbackButton() {
        feedBackButton.click();

        return this;
    }

    @Step("Проверка появления диалогового окна и его заголовка")
    public CareerPage checkModalDialog() {
        modlDialog.should(appear);
        modalTitle.shouldHave(text("Запрос информации"));

        return this;
    }

    @Step("Проверка параметра модального окна - Email")
    public CareerPage checkEmail() {
        emailHeader.shouldHave(text("Электронная почта"));
        emailInput.shouldBe(editable);

        return this;
    }

    @Step("Проверка параметра модального окна - Номер телефона")
    public CareerPage checkPhone() {
        phoneHeader.shouldHave(text("Номер телефона"));
        phoneInput.shouldBe(editable);

        return this;
    }

    @Step("Проверка параметра модального окна - Имя")
    public CareerPage checkName() {
        nameHeader.shouldHave(text("Имя"));
        nameInput.shouldBe(editable);

        return this;
    }

    @Step("Проверка параметра модального окна - Компания")
    public CareerPage checkCompany() {
        companyHeader.shouldHave(text("Компания"));
        companyInput.shouldBe(editable);

        return this;
    }

    @Step("Проверка параметра модального окна - Должность")
    public CareerPage checkJob() {
        jobhHeader.shouldHave(text("Должность"));
        jobhInput.shouldBe(editable);

        return this;
    }

    @Step("Проверка параметра модального окна - Комментарий")
    public CareerPage checkComment() {
        commentHeader.shouldHave(text("Комментарий"));
        commentInput.shouldBe(editable);

        return this;
    }

    @Step("Проверка параметра модального окна - чекбокс согласия")
    public CareerPage checkCheckbox() {
        checkboxHeader
                .shouldHave(text("Я согласен(-на) с"))
                .shouldHave(text("Политикой конфиденциальности и условиями обработки персональных данных"));
        checkboxInput.shouldBe(clickable);


        return this;
    }

    @Step("Проверка кнопки Submit")
    public CareerPage checkSubmitButton() {
        submitButtonHeader.shouldHave(text("Отправить"));
        submitButton
                .shouldBe(enabled)
                .shouldBe(clickable);

        return this;
    }
}
