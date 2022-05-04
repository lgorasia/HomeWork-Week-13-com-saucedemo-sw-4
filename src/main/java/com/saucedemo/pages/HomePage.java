package com.saucedemo.pages;


import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By usernameField = By.id("user-name");
    By passwordField = By.id("password");
    By loginButton = By.id("login-button");





    public void enterUsername(String userName) {

        sendTextToElement(usernameField, userName);
    }

    public void enterPassword(String password) {

        sendTextToElement(passwordField, password);
    }

    public void cliclOnLoginButton() {

        clickOnElement(loginButton);
    }




}
