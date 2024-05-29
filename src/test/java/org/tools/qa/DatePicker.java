package org.tools.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class DatePicker {

    public static WebDriver driver;
    public static WebDriverWait wait;
    public String baseURL;

    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        baseURL = "https://demoqa.com/date-picker";


    }


    @Test
    public void menuTest() throws InterruptedException {
        driver.get(baseURL);

        driver.findElement(By.id("datePickerMonthYearInput")).click();
        driver.findElement(By.xpath("//option[contains(text(),'March')]")).click();
        driver.findElement(By.xpath("//option[contains(text(),'1987')]")).click();
        driver.findElement(By.xpath("//div[contains(text(),'26')]")).click();

        String myDate = driver.findElement(By.xpath("//input[@id='datePickerMonthYearInput']")).getAttribute("value");
        System.out.println(myDate);











    }



    @AfterTest
    public void endTest(){
        driver.quit(); }
}
