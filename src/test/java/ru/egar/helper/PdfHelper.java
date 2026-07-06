package ru.egar.helper;

import com.codeborne.pdftest.PDF;

import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import static com.codeborne.pdftest.assertj.Assertions.assertThat;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class PdfHelper {
    private PDF pdf;

    private PDF getPdf(String value) throws Exception {
        if (pdf == null) {
            String url = $("a[href*='" + value + "']")
                    .scrollTo()
                    .shouldBe(visible)
                    .getAttribute("href");

            HttpClient client = HttpClient.newBuilder()
                    .connectTimeout(Duration.ofSeconds(10))
                    .build();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .timeout(Duration.ofSeconds(30))
                    .GET()
                    .build();

            HttpResponse<InputStream> response = client.send(request,
                    HttpResponse.BodyHandlers.ofInputStream());
            pdf = new PDF(response.body());
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
