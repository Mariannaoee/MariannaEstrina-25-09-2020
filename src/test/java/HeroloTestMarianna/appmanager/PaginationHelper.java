package HeroloTestMarianna.appmanager;

import HeroloTestMarianna.model.Pagination;
import HeroloTestMarianna.model.ThanksPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaginationHelper extends HelperBase {

    public PaginationHelper(WebDriver webDriver) {
        super(webDriver);
    }

    public void leftButton() {
        Pagination pagination = new Pagination();
        String left = pagination.getLeftButton();
        clickByLocator(By.xpath("//img[@alt='Left arrow']"));
    }


    public void rightButton() {

        Pagination pagination = new Pagination();
        String right = pagination.getRightButton();
        clickByLocator(By.xpath("//img[@alt='Right arrow']"));
    }
    // scroll window to carousel
    public void scrollToCarousel() {
        WebElement rightButtonGallery = findElementByLocator(By.xpath("//img[@alt='Right arrow']"));
        scrollWindow(rightButtonGallery.getLocation().getX(),rightButtonGallery.getLocation().getY());
    }
}




