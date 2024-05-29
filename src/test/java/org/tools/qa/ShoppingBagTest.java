package org.tools.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import page_object.LogInPageObject;
import swag.lab.testing.qa1.fun.CartFun;
import swag.lab.testing.qa1.fun.LogInPageFun;
import swag.lab.testing.qa1.fun.PDPFun;
import swag.lab.testing.qa1.fun.PLPFun;
import swag.lab.testing.qa1.utility.BeforeAll;

public class ShoppingBagTest extends BeforeAll {
    @Test
    public void validLogInLogOutTest() throws InterruptedException {

        //Valid Log In
        LogInPageFun.validLogInOutTest(driver, wait);

        //Click on first Product on PLP
        PLPFun.clickOnFirstPLP(driver,wait);

        //Check PDP name of product
        PDPFun.getNameOfProduct(driver,wait);

        //Add to chart product
       PDPFun.addProductToBag(driver,wait);


       //Go to chart
        CartFun.goToCart(driver,wait);

        //Check name of Product in chart
        CartFun.getProductNameInCart(driver,wait);



        //Check names












    }
}
