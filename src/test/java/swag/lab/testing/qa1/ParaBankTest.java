package swag.lab.testing.qa1;

import net.bytebuddy.utility.RandomString;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Random;

public class ParaBankTest {
    public WebDriver driver;
    public WebDriverWait wait;
    public String baseURL;


    @BeforeTest
    public void setUp()  {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        baseURL = "https://parabank.parasoft.com/parabank/index.htm";}


    @Test
    public void CheckOutTest() {
        driver.get(baseURL);

        //Verify that user can see home page
        driver.findElement(By.xpath("//body/div[@id='mainPanel']/div[@id='topPanel']/a[2]/img[1]")).isDisplayed();

        //Click on "LogIn register" element
        driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();

        //Verify that user can see "Sining is easy" text
        driver.findElement(By.xpath("//h1[contains(text(),'Signing up is easy!')]")).isDisplayed();

        //Click on First name
        driver.findElement(By.xpath("//input[@id='customer.firstName']")).click();

        //Enter First name
        driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys("Zarko");

        //Click on Last name
        driver.findElement(By.xpath("//input[@id='customer.lastName']")).click();

        //Enter last name
        driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys("Petrovic");

        //Click on Adress field
        driver.findElement(By.xpath("//input[@id='customer.address.street']")).click();

        //Enter adress
        driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys("Zaplanjska");

        //Click on City field
        driver.findElement(By.xpath("//input[@id='customer.address.city']")).click();

        //Enter City Name
        driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys("Belgrade");

        //Click on State field
        driver.findElement(By.xpath("//input[@id='customer.address.state']")).click();

        //Enter state Name
        driver.findElement(By.xpath("//input[@id='customer.address.state']")).sendKeys("Serbia");

        //Click on Zip code field
        driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).click();

        //Enter Zip code
        driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys("11000");

        //Clik on phone filed
        driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).click();

        //Enter phone number
        driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys("062452231");

        //Click on SSN field
        driver.findElement(By.xpath("//input[@id='customer.ssn']")).click();

        //Enter SSN
        driver.findElement(By.xpath("//input[@id='customer.ssn']")).sendKeys("235115");

        //Click on username
        driver.findElement(By.xpath("//input[@id='customer.username']")).click();


        //Enter username
        driver.findElement(By.xpath("//input[@id='customer.username']")).sendKeys("zarkppod");

        //Click on password
        driver.findElement(By.xpath("//input[@id='customer.password']")).click();

        //Enter password
        driver.findElement(By.xpath("//input[@id='customer.password']")).sendKeys("markosos");




}

    @AfterTest
    public void endTest(){
        driver.quit(); }

}

