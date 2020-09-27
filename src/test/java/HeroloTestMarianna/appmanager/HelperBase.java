package HeroloTestMarianna.appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelperBase {
    protected WebDriver webDriver;
    protected WebDriverWait wait;


    public HelperBase(WebDriver webDriver) {

        this.webDriver = webDriver;
    }


    // function that receive locator and click on it
    protected void clickByLocator(By locator) {
        webDriver.findElement(locator).click();
    }

    // function that fill text by locator (input,text box etc)
    protected void clickAndFillTextByLocator(By locator, String text) {
        clickByLocator(locator);
        if (text != null) {//if text not null
            String existingText = webDriver.findElement(locator).getAttribute("value");//take the value
            if (!text.equals(existingText)) {
                webDriver.findElement(locator).clear();
                webDriver.findElement(locator).sendKeys(text);
            }
        }
    }

    // check if element is present and then return the element
    protected WebElement findElementByLocator(By locator) {
        if (isElementPresentByLocator(locator)) {
            WebElement element = webDriver.findElement(locator);
            return element;
        }
        return null;
    }

    // function that check if element is present
    protected boolean isElementPresentByLocator(By locator) {
        try {
            webDriver.findElement(locator);
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    public void scrollWindow(int horizon, int vertical){
        JavascriptExecutor jse = (JavascriptExecutor)webDriver;
        jse.executeScript("window.scrollBy(" +horizon+ "," + vertical + ")");
    }
}