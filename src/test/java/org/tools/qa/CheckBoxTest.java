package org.tools.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class CheckBoxTest {

    public WebDriver driver;
    public WebDriverWait wait;
    public String baseURL;

    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        baseURL = "https://demoqa.com/checkbox";}

    @Test
    public void CheckBoxTest(){
        driver.get(baseURL);

        //Verify-User can see CheckBox webpage
        driver.findElement(By.xpath("//h1[contains(text(),'Check Box')]")).isDisplayed();

        //Click on Home toggle element
        driver.findElement(By
                .xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/span[1]/button[1]/*[1]"));


        //Click on - toggle element
        driver.findElement(By.
                xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/button[1]/*[1]")).click();

        //Click on Notes
        driver.findElement(By.xpath("//span[contains(text(),'Notes')]")).click();

        //Verify - User can see "Notes" massage
        driver.findElement(By.xpath("//span[contains(text(),'notes')]")).isDisplayed();









    }





    @AfterTest
    public void myTest(){
        driver.quit();
    }


}
