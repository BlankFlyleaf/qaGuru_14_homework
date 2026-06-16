package ru.egar.pages.component;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class ModalDialogValidationComponent {
    private final SelenideElement emailError = $("#error_1629901744875");
    private final SelenideElement phoneError = $("#error_1629901767207");
    private final SelenideElement nameError = $("#error_1495810354468");
    private final SelenideElement companyError = $("#error_1630012770354");
    private final SelenideElement jobError = $("#error_1630012788697");
    private final SelenideElement commentError = $("#error_1629901868249");
    private final SelenideElement checkboxError = $("#error_1679027361388");
    private final SelenideElement dialogError = $(".t-form__errorbox-middle");

    public ModalDialogValidationComponent checkEmailErrorNotVisible(){
        emailError
                .shouldNotBe(visible)
                .shouldNotHave(text("Поле обязательно для заполнения"));

        return this;
    }

    public ModalDialogValidationComponent checkPhoneErrorNotVisible(){
        phoneError
                .shouldNotBe(visible)
                .shouldNotHave(text("Поле обязательно для заполнения"));

        return this;
    }

    public ModalDialogValidationComponent checkNameErrorNotVisible(){
        nameError
                .shouldNotBe(visible)
                .shouldNotHave(text("Поле обязательно для заполнения"));

        return this;
    }

    public ModalDialogValidationComponent checkCompanyErrorNotVisible(){
        companyError
                .shouldNotBe(visible)
                .shouldNotHave(text("Поле обязательно для заполнения"));

        return this;
    }

    public ModalDialogValidationComponent checkJobErrorNotVisible(){
        jobError
                .shouldNotBe(visible)
                .shouldNotHave(text("Поле обязательно для заполнения"));

        return this;
    }

    public ModalDialogValidationComponent checkCommentErrorNotVisible(){
        commentError
                .shouldNotBe(visible)
                .shouldNotHave(text("Поле обязательно для заполнения"));

        return this;
    }

    public ModalDialogValidationComponent checkCheckboxErrorNotVisible(){
        checkboxError
                .shouldNotBe(visible)
                .shouldNotHave(text("Поле обязательно для заполнения"));

        return this;
    }

    public ModalDialogValidationComponent checkDialogErrorAppear(){
        dialogError
                .scrollTo()
                .shouldBe(appear)
                .shouldHave(text("Поле обязательно для заполнения"));

        return this;
    }

    public ModalDialogValidationComponent checkEmailErrorVisible(){
        emailError
                .shouldBe(visible)
                .shouldHave(text("Поле обязательно для заполнения"));

        return this;
    }

    public ModalDialogValidationComponent checkPhoneErrorVisible(){
        phoneError
                .shouldBe(visible)
                .shouldHave(text("Поле обязательно для заполнения"));

        return this;
    }

    public ModalDialogValidationComponent checkNameErrorVisible(){
        nameError
                .shouldBe(visible)
                .shouldHave(text("Поле обязательно для заполнения"));

        return this;
    }

    public ModalDialogValidationComponent checkCompanyErrorVisible(){
        companyError
                .shouldBe(visible)
                .shouldHave(text("Поле обязательно для заполнения"));

        return this;
    }

    public ModalDialogValidationComponent checkJobErrorVisible(){
        jobError
                .shouldBe(visible)
                .shouldHave(text("Поле обязательно для заполнения"));

        return this;
    }


    public ModalDialogValidationComponent checkCheckboxErrorVisible(){
        checkboxError
                .shouldBe(visible)
                .shouldHave(text("Поле обязательно для заполнения"));

        return this;
    }
}
