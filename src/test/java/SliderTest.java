import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.time.Duration;

public class SliderTest {
    public WebDriver driver;
    public WebDriverWait wait;
    public String baseURL;

    @BeforeTest
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        baseURL = "https://demoqa.com/slider";
    }


    @Test
    public void sliderTest() throws InterruptedException {
        driver.get(baseURL);
        driver.findElement(By.xpath("//h1[contains(text(),'Slider')]")).isDisplayed();


        String sliderValue = driver.findElement(By.id("sliderValue")).getAttribute("value");
        System.out.println("First Result"+ sliderValue);

        //Web element
        WebElement slider = driver.findElement(By.
                xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/span[1]/input[1]"));

        //Creating Objects for Actions class
        Actions action = new Actions(driver);

        //Move slider by 300 pixel using drag and drop
        action.dragAndDropBy(slider,300,0).build().perform();
        Thread.sleep(2000);

        String secondSliderValue = driver.findElement(By.id("sliderValue")).getAttribute("value");
        System.out.println("Second Result"+ secondSliderValue);
        Assert.assertNotEquals(sliderValue,secondSliderValue);




    }





    @AfterTest
    public void endTest(){
        driver.quit(); }


}
