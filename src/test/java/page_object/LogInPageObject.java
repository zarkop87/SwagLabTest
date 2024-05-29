package page_object;

import org.openqa.selenium.By;

public class LogInPageObject {

    public static By userNameField = By.id("user-name");
    public static By passwordFiled = By.id("password");
    public static String validUser = "standard_user";
    public static String validPassword = "secret_sauce";
    public static By logInButton = By.id("login-button");
    public static By productsPage = By.xpath("//span[contains(text(),'Products')]");
    public static By hamburgerMenu = By.id("react-burger-menu-btn");
    public static By logOutButton = By.id("logout_sidebar_link");


}
