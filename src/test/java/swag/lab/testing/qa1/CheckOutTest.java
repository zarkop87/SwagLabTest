package swag.lab.testing.qa1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class CheckOutTest {

    public WebDriver driver;
    public WebDriverWait wait;
    public String baseURL;


    @BeforeTest
    public void setUp()  {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        baseURL = "https://www.saucedemo.com/";}


        @Test
                public void CheckOutTest() {


            driver.get(baseURL);

            //Click on Username Field
            driver.findElement(By.id("user-name")).click();

            //Enter Valid Username in Field
            driver.findElement(By.id("user-name"))
                    .sendKeys("standard_user");

            //Click on Password Field
            driver.findElement(By.id("password")).click();

            //Enter Valid Password
            driver.findElement(By.id("password"))
                    .sendKeys("secret_sauce");

            //Click on LogIn
            driver.findElement(By.id("login-button")).click();

            //Verify LogIn
            driver.findElement(By.xpath("//span[contains(text(),'Products')]")).isDisplayed();

            driver.findElement(By.className("inventory_item_name")).isDisplayed();
            driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
            driver.findElement(By.className("shopping_cart_link")).click();
            driver.findElement(By.name("checkout")).click();
            driver.findElement(By.name("firstName")).click();
            driver.findElement(By.name("firstName")).sendKeys("Zarko");
            driver.findElement(By.name("lastName")).click();
            driver.findElement(By.name("lastName")).sendKeys("Petrovic");
            driver.findElement(By.name("postalCode")).click();
            driver.findElement(By.name("postalCode")).sendKeys("11000");
            driver.findElement(By.name("continue")).click();
            driver.findElement(By.className("summary_info_label"));
            driver.findElement(By.name("finish")).click();
            driver.findElement(By.className("pony_express"));
            driver.findElement(By.name("back-to-products")).click();
            driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
            driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).isDisplayed();











        }

    @AfterTest
    public void endTest(){
        driver.quit(); }




}
