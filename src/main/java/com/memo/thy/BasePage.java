package com.memo.thy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage extends WebDriverHelper{
    By PopUpBy = By.cssSelector("#cookieWarningAcceptId");
    By searchBoxBy = By.cssSelector("input[id='general-booker-to']");

    public BasePage(WebDriver driver) {
        super(driver);
    }

    public MainPage getLoginPage(){
        click(PopUpBy,10);
        return new MainPage(driver);
    }
}
