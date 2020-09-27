package HeroloTestMarianna.appmanager;

import HeroloTestMarianna.model.ThanksPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ThanksPageHelper extends HelperBase {

    public ThanksPageHelper(WebDriver webDriver) {
        super(webDriver);
    }

    public void goBack() {
        String sd  ="זוזור ";
        ThanksPage thanksPage = new ThanksPage();
        clickByLocator(By.linkText(thanksPage.getReturnButton()));
    }

    public WebElement findTextElement(){
        WebElement element = findElementByLocator(By.linkText("תודה!"));
        return element;
    }


}
