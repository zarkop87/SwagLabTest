package swag.lab.testing.qa1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class ZaraCreateAccount {

    public WebDriver driver;
    public WebDriverWait wait;
    public String baseURL;


    @BeforeTest
    public void setUp()  {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        baseURL = "https://www.zara.com/rs/";}


    @Test
    public void CheckOutTest() {
        driver.get(baseURL);

        //Verify that user can open home page
        driver.findElement(By.className("layout-catalog-logo-icon")).isDisplayed();

        //Verify that user can see "Prijavi se" element
        driver.findElement(By.xpath("//span[contains(text(),'PRIJAVI SE')]")).isDisplayed();

        //Click on "Prijavi se" element
        driver.findElement(By.xpath("//span[contains(text(),'PRIJAVI SE')]")).click();

        //Verify that user can see LogIn form
        driver.findElement(By.xpath("//span[contains(text(),'Zaboravili ste svoju lozinku?')]")).isDisplayed();

        //Click on "Registrujte se" button
        driver.findElement(By.xpath("//span[contains(text(),'Registrujte se')]")).click();

        //Verify that user can see "Create account page"
        driver.findElement(By.xpath("//span[contains(text(),'Lični podaci')]")).isDisplayed();

        //Click on "E posta" field
        driver.findElement(By.className("zds-input-base__input")).click();

        //Enter valid EMail adress
        driver.findElement(By.className("zds-input-base__input")).sendKeys();

        //Enter valid






    }


    @AfterTest
    public void endTest(){
        driver.quit(); }






}
