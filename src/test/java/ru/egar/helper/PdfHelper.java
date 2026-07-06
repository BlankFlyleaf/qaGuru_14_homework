package ru.egar.helper;

import com.codeborne.pdftest.PDF;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import static com.codeborne.pdftest.assertj.Assertions.assertThat;
import static com.codeborne.selenide.Selenide.$;

public class PdfHelper {
    private PDF pdf;

    private PDF getPdf(String value) throws Exception {
        if (pdf == null) {
            String encoded = URLEncoder.encode(value, StandardCharsets.UTF_8);
            pdf = new PDF($("[href='https://file.egar.ru/" + encoded + ".pdf']").download());
        }
        return pdf;
    }

    public void checkPdfAuthor(String value, String author) throws Exception {
        assertThat(getPdf(value).author).isEqualTo(author);
    }

    public void checkPdfContainsText (String value, String text) throws Exception {
        assertThat(getPdf(value)).containsText(text);
    }
}
