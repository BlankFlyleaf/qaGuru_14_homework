package ru.egar.pages.component;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.cssValue;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class OpticalHoverComponent {
    private SelenideElement titleOfHover(String titleId)  {
        return $("[field='tn_text_" + titleId + "']");
    }
    private SelenideElement resultOfHover(String resultId)  {
        return $("[field='tn_text_" + resultId + "']");
    }
    private SelenideElement triggerOfHover (String titleId)  {
        return $("#sbs-932805066-" + titleId);
    }

    public void checkTitleOfHover(String titleId, String title) {
        titleOfHover(titleId).shouldHave(text(title));
    }

    public void checkResultOfHover(String resultId, String result) {
        resultOfHover(resultId).shouldNotHave(cssValue("opacity", "0"))
                .shouldHave(text(result));
    }

    public void triggerHover(String titleId) {
        triggerOfHover(titleId).hover();
    }

}
