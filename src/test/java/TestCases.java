import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AuthorizePage;
import pages.MainPage;

public class TestCases {

    private WebDriver browser;

    @Before
    public void precondition() {
        browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("https://translate.google.ru/");
    }

    @Test
    // Тест-кейс 1 "Изменение языка ввода и результата перевода"
    public void checkLanguageChangers() {

        MainPage mainPage = new MainPage(browser);

        mainPage
                .clickInputTextLanguagesButton();

        String expectedInputLanguage = mainPage.getHebrewLanguageButtonText();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }

        mainPage
                .clickHebrewLanguageButton();

        String actualInputLanguage = mainPage.getActualInputLanguageText();

        Assert.assertEquals(expectedInputLanguage, actualInputLanguage);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }

        mainPage
                .clickResultTranslateLanguagesButton();

        String expectedResultLanguage = mainPage.getAymaraLanguageButtonText();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }

        mainPage
                .clickAymaraLanguageButton();

        String actualTranslateLanguage = mainPage.getActualTranslateLanguageText();

        Assert.assertEquals(expectedResultLanguage, actualTranslateLanguage);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Test
    //Тест-кейс 2 "Ввод текста, ожидание перевода"
    public void checkInputTextTranslate() {

        MainPage mainPage = new MainPage(browser);

        mainPage
                .clickFastToRussianChangeButton()
                .clickTextArea()
                .inputText("Нет времени объяснять...");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }

        String actualResultTranslateText = mainPage.getResultTranslateAreaText();

        Assert.assertEquals("No time to explain...", actualResultTranslateText);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Test
    //Тест-кейс 3 "Ввод текста, автоматическое определение языка"
    public void checkAutoRecognizeInputLanguage() {

        MainPage mainPage = new MainPage(browser);

        mainPage
                .clickInputTextLanguagesButton();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }

        mainPage
                .clickAutoRecognizeLanguageButton()
                .clickTextArea()
                .inputText("Нет времени объяснять...");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }

        String actualAutoRecognizeLanguageButtonText = mainPage.getAutoRecognizeLanguageButtonText();

        Assert.assertEquals("русский (определен автоматически)", actualAutoRecognizeLanguageButtonText);
    }

    @Test
    //Тест-кейс 4 "Перевод текста, добавление перевода в историю"
    public void checkTranslatesHistory() {

        MainPage mainPage = new MainPage(browser);
        AuthorizePage authorizePage = new AuthorizePage(browser);

        mainPage
                .clickSignInButton();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        authorizePage
                .clickUsernameInputArea()
                .usernameInputArea("mmailfortest05")
                .clickPasswordInputButton();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        authorizePage
                .passwordInputArea("zqxwcevr111")
                .clickConfirmPasswordButton();

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        mainPage
                .clickTextArea()
                .inputText("Нет времени объяснять...");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }

        String expectedResultTranslateText = mainPage.getResultTranslateAreaText();

        mainPage
                .clickHistoryButton();

        browser.get("https://translate.google.ru/history?hl=ru&sl=ru&tl=en&text=%D0%9D%D0%B5%D1%82%20%D0%B2%D1%80%D0%B5%D0%BC%D0%B5%D0%BD%D0%B8%20%D0%BE%D0%B1%D1%8A%D1%8F%D1%81%D0%BD%D1%8F%D1%82%D1%8C...&op=translate");

        try {
            Thread.sleep(7000);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }

        String actualLastInHistoryResultTranslateText = mainPage.lastInHistoryResultTranslateText();
        Assert.assertEquals(expectedResultTranslateText, actualLastInHistoryResultTranslateText);

        mainPage
                .clickClearTheHistoryButton();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Test
    //Тест-кейс 5 "Добавление текущего перевода в список «Сохраненные»"
    public void checkSavedTranslates() {

        MainPage mainPage = new MainPage(browser);
        AuthorizePage authorizePage = new AuthorizePage(browser);

        mainPage
                .clickSignInButton();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        authorizePage
                .clickUsernameInputArea()
                .usernameInputArea("mmailfortest05")
                .clickPasswordInputButton();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        authorizePage
                .passwordInputArea("zqxwcevr111")
                .clickConfirmPasswordButton();

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        mainPage
                .clickTextArea()
                .inputText("Нет времени объяснять...");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }

        String expectedResultTranslateText = mainPage.getResultTranslateAreaText();

        mainPage
                .clickSaveTranslateButton();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }

        mainPage
                .clickSavedTranslatesButton();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }

        String actualLastSavedTranslateResultText = mainPage.getLastSaveTranslateResult();

        Assert.assertEquals(expectedResultTranslateText, actualLastSavedTranslateResultText);

    }

    @After
    public void closeBrowser() {
        browser.quit();
    }
}
