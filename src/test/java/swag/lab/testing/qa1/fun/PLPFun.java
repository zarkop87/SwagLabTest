package swag.lab.testing.qa1.fun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import page_object.ProductListingPage;

public class PLPFun {
    public static void clickOnFirstPLP (WebDriver driver, WebDriverWait wait) {

        //Click on First PLP product

        driver.findElement(ProductListingPage.firstProductOfList).isDisplayed();

        driver.findElement(ProductListingPage.firstProductOfList).click();









    }
}
