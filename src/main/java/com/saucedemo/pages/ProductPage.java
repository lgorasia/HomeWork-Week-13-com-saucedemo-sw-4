package com.saucedemo.pages;




import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage extends Utility {

    By productDisplayField = By.xpath("//span[contains(text(),'Products')]");
    By sixProductsLocator = By.className("inventory_item");


    public String productDisplayText(){
       return getTextFromElement(productDisplayField);
    }
    public int sixproducts(){
        List<WebElement> actualNumbreElement =driver.findElements(sixProductsLocator);
        int actualNumber = actualNumbreElement.size();
        return actualNumber;
    }


    }


