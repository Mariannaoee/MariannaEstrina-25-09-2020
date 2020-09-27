package HeroloTestMarianna.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PopUpHelper extends HelperBase {
    public PopUpHelper(WebDriver webDriver) {
        super(webDriver);
    }

    public boolean checkIfPopUpPresent() {

        boolean isPresent =  isElementPresentByLocator(By.cssSelector(".onUnloadPopup__CloseModalBtn-sc-1mwkper-1"));
        return isPresent;

    }

    public void closePopUp(){
        clickByLocator(By.cssSelector(".onUnloadPopup__CloseModalBtn-sc-1mwkper-1"));
    }
}
