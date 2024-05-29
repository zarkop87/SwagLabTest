package swag.lab.testing.qa1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class LumaCreateAccount {
    public WebDriver driver;
    public WebDriverWait wait;
    public String baseURL;


    @BeforeTest
    public void setUp()  {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        baseURL = "https://magento.softwaretestingboard.com/";}



    @Test
    public void CheckOutTest() {
        driver.get(baseURL);


        //Verify that user can open home page
        driver.findElement(By.xpath("//body/div[2]/main[1]/div[3]/div[1]/div[3]/div[1]/a[1]/img[1]")).isDisplayed();


        //Verify that user can see "Create Account" element
        driver.findElement(By.xpath("//header/div[1]/div[1]/ul[1]/li[3]/a[1]")).click();

        //Verify that user can see "Create account" form
        driver.findElement(By.xpath("//span[contains(text(),'Create New Customer Account')]")).isDisplayed();

        //Click on "First Name" field
        driver.findElement(By.xpath("//input[@id='firstname']")).click();

        //Enter First name
        driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Zarko");

        //Click on Last Name filed
        driver.findElement(By.xpath("//input[@id='lastname']")).click();

        //Enter Last name
        driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Petrovic");

        //Click on EMail field
        driver.findElement(By.xpath("//input[@id='email_address']")).click();

        //Enter valid eMail
        driver.findElement(By.xpath("//input[@id='email_address']")).sendKeys("zarekop@gmail.com");

        //Click on password field
        driver.findElement(By.xpath("//input[@id='password']")).click();

        //Enter password
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("nikonezan");

        //Click on Confirm password field
        driver.findElement(By.xpath("//input[@id='password-confirmation']")).click();

        //Enter Confirm password
        driver.findElement(By.xpath("//input[@id='password-confirmation']")).sendKeys("nikonezan");

        //Click on confirm account
        driver.findElement(By.xpath("//body[1]/div[2]/main[1]/div[3]/div[1]/form[1]/div[1]/div[1]/button[1]/span[1]")).click();





    }

    @AfterTest
    public void endTest(){
        driver.quit(); }
}
