package HeroloTestMarianna.appmanager;

import HeroloTestMarianna.model.RequestForm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RequestFormHelper extends HelperBase {

    public RequestFormHelper(WebDriver webDriver) {

        super(webDriver);
    }

    //fill request form
    public void fillRequestForm(RequestForm requestForm) {
        String mari = new String();
        clickAndFillTextByLocator(By.id("name"), requestForm.getName());
        clickAndFillTextByLocator(By.id("company"), requestForm.getCompany());
        clickAndFillTextByLocator(By.id("email"), requestForm.getEmail());
        clickAndFillTextByLocator(By.id("telephone"), requestForm.getPhone());
        clickByLocator(By.linkText("דברו איתנו"));
    }

    public WebElement findElementByErrorText(String text){
        WebElement errorMessage = findElementByLocator(By.linkText(text));
        return errorMessage;
    }





}
