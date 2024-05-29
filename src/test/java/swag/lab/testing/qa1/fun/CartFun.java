package swag.lab.testing.qa1.fun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CartFun {
    public static void goToCart (WebDriver driver, WebDriverWait wait){

        //Go to cart
        driver.findElement(By.
                id("shopping_cart_container")).click();
    }
    public static void getProductNameInCart (WebDriver driver, WebDriverWait wait){

        String myProductNameInChart = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/a[1]/div[1]")).getText();
        System.out.println(myProductNameInChart);

    }


}
