package com.saucedemo.testsuite;


import com.saucedemo.pages.HomePage;
import com.saucedemo.pages.ProductPage;
import com.saucedemo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPage extends TestBase {
    HomePage homePage = new HomePage();
    ProductPage productPage = new ProductPage();


    @Test
    public void userSholdLoginSuccessfullyWithValid() {
        homePage.enterUsername("standard_user");
        homePage.enterPassword("secret_sauce");
        homePage.cliclOnLoginButton();


        String actualMessage = productPage.productDisplayText();
        String expectedMessage = "PRODUCTS";
        Assert.assertEquals(expectedMessage, actualMessage, "Product text not displayed");

    }
    @Test
    public void verifyThatSixProductsAreDisplayedOnPage(){
        homePage.enterUsername("standard_user");
        homePage.enterPassword("secret_sauce");
        homePage.cliclOnLoginButton();
        int actualNumber = productPage.sixproducts();
        int expectedNumber = 6;
        Assert.assertEquals(expectedNumber,actualNumber);
    }


}



