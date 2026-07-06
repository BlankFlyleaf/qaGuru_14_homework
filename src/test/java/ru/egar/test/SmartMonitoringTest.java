package ru.egar.test;

import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("Regression")
@Story("Проверка кейсов на странице 'Смарт бизнес-технологии'")
@Owner("AChurilov")
public class SmartMonitoringTest extends TestBase {


    @Test
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Проверяем PDF файл в аккордеоне 'Функциональные характеристики'")
    public void pdfTest () throws Exception {
        smartMonitoringPage
                .openSmartMonitoring()
                .triggerAccordion("Функциональные характеристики")
                .checkPdfAuthor("Функциональные_характеристики_СБМ", "Руслан Пронин")
                .checkPdfContainsText("Функциональные_характеристики_СБМ","Функциональные характеристики системы «СМАРТ БИЗНЕС- МОНИТОРИНГ - СБМ»");
    }


    @Test
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Проверяем первый PDF файл в аккордеоне 'Установка'")
    public void pdfInstallTest () throws Exception {
        smartMonitoringPage
                .openSmartMonitoring()
                .triggerAccordion("Установка")
                .checkPdfAuthor("Инструкция_по_установке_и_эксплуатации_ПО_СБМ", "Руслан Пронин")
                .checkPdfContainsText("Инструкция_по_установке_и_эксплуатации_ПО_СБМ","Описание проверочного экземпляра программного обеспечения «СМАРТ БИЗНЕС-МОНИТОРИНГ- СБМ»");
    }

}
