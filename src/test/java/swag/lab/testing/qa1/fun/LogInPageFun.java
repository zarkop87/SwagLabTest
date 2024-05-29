package swag.lab.testing.qa1.fun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import page_object.LogInPageObject;

public class LogInPageFun {
    public static void validLogInOutTest(WebDriver driver, WebDriverWait wait) {

            driver.findElement(LogInPageObject.userNameField).click();
            driver.findElement(LogInPageObject.userNameField).sendKeys("standard_user");
            driver.findElement(LogInPageObject.passwordFiled).click();
            driver.findElement(LogInPageObject.passwordFiled).sendKeys("secret_sauce");
            driver.findElement(LogInPageObject.logInButton).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(LogInPageObject.productsPage));


        }

    public static void logOutTest(WebDriver driver, WebDriverWait wait) throws InterruptedException {

        driver.findElement(By.id("react-burger-menu-btn")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("logout_sidebar_link")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(LogInPageObject.logInButton));


    }

    }





