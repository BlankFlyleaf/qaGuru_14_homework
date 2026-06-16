package ru.egar.test;

import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import ru.egar.data.OpticalHoverData;

public class CareerTest extends TestBase {

    @Test
    @Tag("Smoke")
    @Tag("Regression")
    @Story("Проверка кейсов на странице 'Карьеры'")
    @Owner("AChurilov")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Проверяем открытие модальной формы 'Связаться с нами'")
    public void modalDialogTest(){
        careerPage
                .openCareer()
                .checkFeedbackButton()
                .clickFeedbackButton()
                .checkModalDialog()
                .checkEmail()
                .checkPhone()
                .checkName()
                .checkCompany()
                .checkJob()
                .checkComment()
                .checkCheckbox()
                .checkSubmitButton();
    }

    @Test
    @Tag("Smoke")
    @Tag("Regression")
    @Story("Проверка кейсов на странице 'Карьеры'")
    @Owner("AChurilov")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Проверяем появление валидации модальной формы 'Связаться с нами'")
    public void modalDialogValidationTest(){
        careerPage
                .openCareer()
                .clickFeedbackButton()
                .checkValidationNotActive()
                .clickSubmitButton()
                .checkValidationActive();
    }

    @EnumSource(OpticalHoverData.class)
    @ParameterizedTest
    @Tag("Regression")
    @Story("Проверка кейсов на странице 'Карьеры'")
    @Owner("AChurilov")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Проверяем заполнение ховеров с заменой заголовка на описание")
    public void hoverOpticalTest(OpticalHoverData opticalHoverData) {
        careerPage
                .openCareer()
                .checkHover(
                        opticalHoverData.titleId,
                        opticalHoverData.title,
                        opticalHoverData.resultId,
                        opticalHoverData.result);
    }
}