package ru.egar.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import ru.egar.helper.PdfHelper;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SmartMonitoringPage {
    private final SelenideElement pageHeader = $("[field='tn_text_1728221258709']");
    private final ElementsCollection triggerOfAccordion = $$(".r.t-rec.title-sbmaccord");

    @Step("Открываем страницу 'Смарт бизнес-мониторинг'")
    public SmartMonitoringPage openSmartMonitoring() {
        open("/smart-business-monitoring");
        pageHeader
                .shouldHave(text("Система мониторинга \n для оптимизации \n бизнес-процессов"));

        return this;
    }

    public SmartMonitoringPage triggerAccordion(String title) {
        triggerOfAccordion
                .findBy(text(title))
                .click();

        return this;
    }

    public SmartMonitoringPage checkPdfAuthor (String value, String author) throws Exception {
        PdfHelper pdfHelper = new PdfHelper();
        pdfHelper.checkPdfAuthor(value, author);

        return this;
    }
    public SmartMonitoringPage checkPdfContainsText (String value, String text) throws Exception {
        PdfHelper pdfHelper = new PdfHelper();
        pdfHelper.checkPdfContainsText(value, text);

        return this;
    }

}
