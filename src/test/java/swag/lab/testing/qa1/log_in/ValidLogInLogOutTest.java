package swag.lab.testing.qa1.log_in;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import page_object.LogInPageObject;
import swag.lab.testing.qa1.fun.LogInPageFun;
import swag.lab.testing.qa1.utility.BeforeAll;

public class ValidLogInLogOutTest  extends BeforeAll {

    @Test (priority = 1, description = "TC-001-Valid Log In Test")
    public void validLogInLogOutTest() throws InterruptedException {

        //Valid Log in
        LogInPageFun.validLogInOutTest(driver,wait);


        //Log Out
        LogInPageFun.logOutTest(driver,wait);

    }

}
