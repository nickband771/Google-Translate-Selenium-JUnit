package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Locators;

public class MainPage {

    private WebDriver browser;

    public MainPage(WebDriver browser) {
        this.browser = browser;
    }

    public MainPage clickInputTextLanguagesButton() {
        WebElement inputTextLanguagesButton = browser.findElement(Locators.MainPage.inputTextLanguagesButton);
        inputTextLanguagesButton.click();
        return new MainPage(browser);
    }

    public MainPage clickHebrewLanguageButton() {
        WebElement hebrewLanguageButton = browser.findElement(Locators.MainPage.hebrewLanguageButton);
        hebrewLanguageButton.click();
        return new MainPage(browser);
    }

    public String getHebrewLanguageButtonText() {
        WebElement hebrewLanguageButtonText = browser.findElement(Locators.MainPage.hebrewLanguageButton);
        return hebrewLanguageButtonText.getText();
    }

    public String getActualInputLanguageText() {
        WebElement actualInputLanguageText = browser.findElement(Locators.MainPage.actualInputLanguage);
        return actualInputLanguageText.getText();
    }

    public MainPage clickResultTranslateLanguagesButton() {
        WebElement resultTranslateLanguagesButton = browser.findElement(Locators.MainPage.resultTranslateLanguagesButton);
        resultTranslateLanguagesButton.click();
        return new MainPage(browser);
    }

    public MainPage clickAymaraLanguageButton() {
        WebElement aymaraLanguageButton = browser.findElement(Locators.MainPage.aymaraLanguageButton);
        aymaraLanguageButton.click();
        return new MainPage(browser);
    }

    public String getAymaraLanguageButtonText() {
        WebElement aymaraLanguageButtonText = browser.findElement(Locators.MainPage.aymaraLanguageButton);
        return aymaraLanguageButtonText.getText();
    }

    public String getActualTranslateLanguageText() {
        WebElement actualTranslateLanguageText = browser.findElement(Locators.MainPage.actualTranslateLanguage);
        return actualTranslateLanguageText.getText();
    }

    public MainPage clickFastToRussianChangeButton() {
        WebElement fastToRussianChangeButton = browser.findElement(Locators.MainPage.fastToRussianChange);
        fastToRussianChangeButton.click();
        return new MainPage(browser);
    }

    public MainPage clickTextArea() {
        WebElement textArea = browser.findElement(Locators.MainPage.textArea);
        textArea.click();
        return new MainPage(browser);
    }

    public MainPage inputText(String text) {
        WebElement textArea = browser.findElement(Locators.MainPage.textArea);
        textArea.sendKeys(text);
        return new MainPage(browser);
    }

    public String getTextAreaText() {
        WebElement textArea = browser.findElement(Locators.MainPage.textArea);
        return textArea.getText();
    }

    public String getResultTranslateAreaText() {
        WebElement resultTranslateArea = browser.findElement(Locators.MainPage.translateResultArea);
        return resultTranslateArea.getText();
    }

    public MainPage clickAutoRecognizeLanguageButton() {
        WebElement autoRecognizeLanguageButton = browser.findElement(Locators.MainPage.autoRecognizeLanguageButton);
        autoRecognizeLanguageButton.click();
        return new MainPage(browser);
    }

    public String getAutoRecognizeLanguageButtonText() {
        WebElement autoRecognizeLanguageButton = browser.findElement(Locators.MainPage.autoRecognizeLanguage);
        return autoRecognizeLanguageButton.getText();
    }

    public MainPage clickHistoryButton() {
        WebElement historyButton = browser.findElement(Locators.MainPage.historyButton);
        historyButton.click();
        return new MainPage(browser);
    }

    public AuthorizePage clickSignInButton() {
        WebElement signInButton = browser.findElement(Locators.MainPage.signInButton);
        signInButton.click();
        return new AuthorizePage(browser);
    }

    public String lastInHistoryResultTranslateText() {
        WebElement lastInHistoryResultTranslateText = browser.findElement(Locators.MainPage.lastInHistoryTranslateResult);
        return lastInHistoryResultTranslateText.getText();
    }

    public MainPage clickClearTheHistoryButton() {
        WebElement clearTheHistoryButton = browser.findElement(Locators.MainPage.clearTheHistoryButton);
        clearTheHistoryButton.click();
        return new MainPage(browser);
    }

    public MainPage clickSavedTranslatesButton() {
        WebElement savedTranslatesButton = browser.findElement(Locators.MainPage.savedTranslatesButton);
        savedTranslatesButton.click();
        return new MainPage(browser);
    }

    public String clickSaveTranslateButton() {
        WebElement lastSavedTranslateResult = browser.findElement(Locators.MainPage.saveTranslateButton);
        return lastSavedTranslateResult.getText();
    }

    public String getLastSaveTranslateResult() {
        WebElement lastSavedTranslateResult = browser.findElement(Locators.MainPage.lastSavedTranslateResult);
        return lastSavedTranslateResult.getText();
    }
}
