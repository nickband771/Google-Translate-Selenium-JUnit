package utils;

import org.openqa.selenium.By;

public class Locators {

    public interface MainPage {

        By inputTextLanguagesButton = By.xpath("//*[@class='akczyd'][1]/button[@class='VfPpkd-Bz112c-LgbsSe VfPpkd-Bz112c-LgbsSe-OWXEXe-e5LLRc-SxQuSe yHy1rc eT1oJ mN1ivc ZihNHd KY3GZb']/div[@class='VfPpkd-Bz112c-RLmnJb']");

        By hebrewLanguageButton = By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[1]/c-wiz/div[2]/c-wiz/div[1]/div/div[3]/div/div[3]/span[30]/div[1]");

        By actualInputLanguage = By.xpath("/html/body/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[1]/c-wiz/div[1]/c-wiz/div[2]/div/div[2]/div/div/span/button[2]/span[1]/span");

        By resultTranslateLanguagesButton = By.xpath("//*[@class='akczyd'][2]/button[@class='VfPpkd-Bz112c-LgbsSe VfPpkd-Bz112c-LgbsSe-OWXEXe-e5LLRc-SxQuSe yHy1rc eT1oJ mN1ivc ZihNHd KY3GZb']/div[@class='VfPpkd-Bz112c-RLmnJb']");

        By aymaraLanguageButton = By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[1]/c-wiz/div[2]/c-wiz/div[2]/div/div[3]/div/div[2]/span[2]/div[1]");

        By actualTranslateLanguage = By.xpath("/html/body/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[1]/c-wiz/div[1]/c-wiz/div[5]/div/div[2]/div/div/span/button[1]/span[1]/span");

        By fastToRussianChange = By.xpath("/html/body/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[1]/c-wiz/div[1]/c-wiz/div[2]/div/div[2]/div/div/span/button[2]/span[3]");

        By textArea = By.xpath("/html/body/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[2]/div[2]/c-wiz[1]/span/span/div/textarea");

        By translateResultArea = By.xpath("/html/body/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[2]/div[2]/c-wiz[2]/div/div[6]/div/div[1]/span[1]/span/span");

        By autoRecognizeLanguageButton = By.xpath("/html/body/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[1]/c-wiz/div[2]/c-wiz/div[1]/div/div[3]/div/div[1]");

        By autoRecognizeLanguage = By.xpath("/html/body/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[1]/c-wiz/div[1]/c-wiz/div[2]/div/div[2]/div/div/span/button[1]/span[1]/span");

        By historyButton = By.xpath("/html/body/c-wiz/div/div[2]/c-wiz/nav/a[1]/div[1]");

        By signInButton = By.xpath("/html/body/div[2]/header/div[2]/div[3]/div[1]/a");

        By lastInHistoryTranslateResult = By.xpath("/html/body/c-wiz/div/div[3]/c-wiz/div/div[3]/div/div/div/div[1]/div[3]");

        By clearTheHistoryButton = By.xpath("/html/body/c-wiz/div/div[3]/c-wiz/div/div[2]/button/span");

        By saveTranslateButton = By.xpath("/html/body/c-wiz/div/div[2]/c-wiz/div[2]/c-wiz/div[1]/div[2]/div[2]/c-wiz[2]/div/div[6]/div/div[3]/div/div/div[1]/span/button");

        By savedTranslatesButton = By.xpath("/html/body/c-wiz/div/div[2]/c-wiz/nav/a[2]/div[1]");

        By lastSavedTranslateResult = By.xpath("/html/body/c-wiz/div/div[3]/c-wiz/div[2]/ol/li[1]/div[1]/div[5]/span");
    }

    public interface AuthorizePage {

        By usernameInputArea = By.xpath("//*[@id=\"identifierId\"]");

        By usernameConfirmButton = By.xpath("//*[@id=\"identifierNext\"]/div/button/span");

        By passwordInputArea = By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input");

        By passwordConfirmButton = By.xpath("//*[@id=\"passwordNext\"]/div/button/span");
    }

}
