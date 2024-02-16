package com.memo.thy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;


import java.time.Duration;

public class MainPage extends BasePage{
    By mainBy = By.cssSelector("img[title='Turkish Airlines']");
    //By gtTitle = By.xpath("//h2[text()='Where do you want to explore?']");



    public MainPage(WebDriver driver) {
        super(driver);
    }

    public String getHomePageTitle(){
        return driver.getTitle();
    }

    public void waitForLoad(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(mainBy));
    }


}
