package HeroloTestMarianna.tests;

import HeroloTestMarianna.appmanager.*;
import HeroloTestMarianna.datatest.RequestFormDataProvider;
import HeroloTestMarianna.model.Pagination;
import HeroloTestMarianna.model.RequestForm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class MainPageTests extends TestBase {
    private WebDriverWait wait;
    private RequestFormHelper requestFormHelper;
    private ThanksPageHelper thanksPageHelper;
    private PaginationHelper paginationHelper;
    private PopUpHelper popUpHelper;


    @BeforeTest
    public void init() {

        requestFormHelper = new RequestFormHelper(applicationManager.getWebDriver());
        thanksPageHelper = new ThanksPageHelper(applicationManager.getWebDriver());
        paginationHelper = new PaginationHelper(applicationManager.getWebDriver());
        popUpHelper = new PopUpHelper(applicationManager.getWebDriver());
        wait = new WebDriverWait(applicationManager.getWebDriver(), Duration.ofSeconds(10));
    }
//check right ande left button in gallery "עבוד"ות לדוגמה
    @Test
    public void testCarousel() {

        paginationHelper.scrollToCarousel();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@alt='Right arrow']")));
        if (popUpHelper.checkIfPopUpPresent()) {
            popUpHelper.closePopUp();
        }
        paginationHelper.rightButton();
        paginationHelper.leftButton();

    }


    @Test(dataProvider = "PositiveTests", dataProviderClass = RequestFormDataProvider.class)
    public void testRequestForm(RequestForm requestFormTest) {
        requestFormHelper.fillRequestForm(requestFormTest);
        wait.until(urlContains("thank-you"));
        thanksPageHelper.goBack();
    }

    @Test(dataProvider = "NegativeTests1", dataProviderClass = RequestFormDataProvider.class)
    public void testRequestFormNegative1(RequestForm requestFormTest) {
        requestFormHelper.fillRequestForm(requestFormTest);
        requestFormHelper.findElementByErrorText("שדה שם הוא שדה חובה");
        requestFormHelper.findElementByErrorText("שדה חברה הוא שדה חובה");
        requestFormHelper.findElementByErrorText("כתובת אימייל לא חוקית");
        requestFormHelper.findElementByErrorText("שדה טלפון הוא שדה חובה");
    }

    @Test(dataProvider = "NegativeTests2", dataProviderClass = RequestFormDataProvider.class)
    public void testRequestFormNegative2(RequestForm requestFormTest) {
        requestFormHelper.fillRequestForm(requestFormTest);
        requestFormHelper.findElementByErrorText("מספר טלפון לא חוקי");
    }

    @Test(dataProvider = "NegativeTests3", dataProviderClass = RequestFormDataProvider.class)
    public void testRequestFormNegative3(RequestForm requestFormTest) {
        requestFormHelper.fillRequestForm(requestFormTest);
        requestFormHelper.findElementByErrorText("כתובת אימייל לא חוקית");
        requestFormHelper.findElementByErrorText("מספר טלפון לא חוקי");
    }
}
//    WebElement element = thanksPageHelper.findTextElement();
//        wait.until(textToBePresentInElement(element,"תודה!"));